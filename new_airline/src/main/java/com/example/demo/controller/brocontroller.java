package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.airline;
import com.example.demo.repository.prorepository;







@RestController
public class brocontroller {
@Autowired
private prorepository info;
@PostMapping("/add")
public airline addpro(@RequestBody airline air) {
	try {
		info.save(air);
		return air ;
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}
@GetMapping("/getAll")
public List<airline> getall(){
	try {
		return info.findAll();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}
@PutMapping("/update")
public airline putair(@RequestBody airline air){
	try {
		info.save(air);
		return air;
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}
@DeleteMapping("/del/{id}")
public String delair(@PathVariable int id ) {
	try {
		airline air = info.getOne(id);
		info.delete(air);
		return " airline deleted";
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}
}