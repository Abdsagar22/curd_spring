package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Vendor;
import com.example.demo.serimpl.VServiceImp;

@RestController
@RequestMapping("/cloudvender")
public class Vcontroller {
	
	@Autowired
	private VServiceImp serimpl;
	
	
	@PostMapping("/save")
	public String SaveVenderdata(@RequestBody Vendor vendor)
	{
		serimpl.createVendar(vendor);
		return "data saved ";
		
	}
	
	@GetMapping("/id")
	public Vendor SaveVenderdata(@RequestParam int id)
	{
		 Vendor s=serimpl.getVendar(id);
		 System.out.println(s);
		
		return s;
		
	}
	
	
	

}
