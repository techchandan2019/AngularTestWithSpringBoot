package com.bonami.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bonami.model.StudentDto;

@RestController
@RequestMapping("/studentapi")
@CrossOrigin("http://localhost:4200")
public class TestController {
	
	Logger logger=LoggerFactory.getLogger(TestController.class);
	private static final List<StudentDto> li=new ArrayList();
	
	@PostMapping(value = "/save")
	public String saveStudent(@RequestBody StudentDto dto) {
		logger.info(dto.toString());
		li.add(dto);
		return dto.toString();
	}
	@GetMapping("/getAll")
	public List<StudentDto> getStudents(){
		logger.info("========================getAll==================");
		return li;
	}
	

}
