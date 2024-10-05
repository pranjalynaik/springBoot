 package com.springbootcrudoperation.Repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Repository;

import com.springbootcrudoperation.model.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Integer>
{
	//public Student findByRollno(int rollno);
	
	//custom finder method generates query automatically based on method name
	//eg select*from student where rollno=1
	
	//public Student findByName(String name);
	
   //public List <Student> findbyRollno(int rollno);

	public List<Student> findByUsernameAndPassword(String username,String password);

	//write custom jql query
	
	@Transactional
	@Modifying
	@Query(name="deletedata",value="delete from Student where rollno=?1")
	public void deleteData(int rollno);
	
//	@Query(value="From Student")
//	public List <Student> getallData();
//
//	@Query(value="from Student where rolllno=?1")
//    public  Student getSingleData(int rollno);
	
	@Transactional
	@Modifying
	@Query(value="update Student set name=:nm, username=:u, password=:p where rollno=:id")
	public void updateData(@Param ("nm")String name,@Param("u") String username,@Param("p") String password,@Param("id") int rollno);


	
	
	
}
