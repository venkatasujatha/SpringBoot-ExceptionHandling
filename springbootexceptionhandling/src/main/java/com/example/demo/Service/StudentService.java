package com.example.demo.Service;

import com.example.demo.Model.Student;

public interface StudentService {
	
	public Object getStudent1();

	Object save(Student student);

	Object getById(int rollno);

}
