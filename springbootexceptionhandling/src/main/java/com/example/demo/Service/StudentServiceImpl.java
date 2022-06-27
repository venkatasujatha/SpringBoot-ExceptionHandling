package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	
	private StudentRepository studentRepository;

	
	@Override
	public Object getStudent1() {
		
		return studentRepository.findAll();
	}

	@Override
	public Object save(Student student) {
		
		return studentRepository.save(student);
	}
	@Override
	public Object getById(int rollno) {
		
		return studentRepository.findById(rollno);
	}
	
	

}
