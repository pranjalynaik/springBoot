package edu.cjc.sms.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cjc.sms.model.Student;

@Repository
public interface StudentRepository extends JpaRepository <Student , Integer>
{

public	List<Student> findAllByBatchNumber(String batchNumber);

public Optional<Student> findAllByStudentid(int studentid);
}