package com.example.demo.Controller;

import javax.naming.InsufficientResourcesException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Service.StudentService;
import com.example.demo.Service.StudentServiceImpl;

@RestController
public class StudentController {
	
	@Autowired
	private StudentServiceImpl serviceImpl;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/get")
	public Object getStudent()
	{
		return serviceImpl.getStudent1();
	}
	
	@PostMapping("/save")
	
	public Object saveStudent(@RequestBody Student student)
	{
		return serviceImpl.save(student);
	}
	
	@GetMapping("/get/{rollno}")
	public Object getById(@PathVariable int rollno) throws ResourceNotFoundException
	{
		return this.studentRepository.findById(rollno).orElseThrow(()->new ResourceNotFoundException("ResourceNotFoundException"+ rollno));
	}

}
