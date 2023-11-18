package com.dockerone.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dockerone.entity.Student;

@RestController

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/one")
public class Controller {
	
static	List<Student> list=new ArrayList<Student>();
	
	static {
		Student s1=new Student(21, "satish","yanam");
		Student s2=new Student(22, "dhana","ampl");
	list.add(s1);
	list.add(s2);
	
	}
	
	@GetMapping("string")
	public String returnString() {
		return "Hello This is One";
	}
	
	@GetMapping("stdnt")
	public List< Student> getStudent() {
		
		return list;
		
	}
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student st){
		list.add(st);
		System.out.println(st);
		return st;
		
	}
}
