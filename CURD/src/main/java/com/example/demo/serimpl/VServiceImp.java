package com.example.demo.serimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Vendor;
import com.example.demo.repo.Vrepo;
import com.example.demo.service.Vservice;

@Service
public class VServiceImp implements Vservice {

	@Autowired
	private Vrepo repo;
	
	@Override
	public String createVendar(Vendor vendor) 
	{
		repo.save(vendor);
		return "Data saved";
	}

	@Override
	public String UpadteVendar(Vendor vendor) {
		repo.save(vendor);
		return null;
	}

	@Override
	public String deleteVendar(int id) {
		
		repo.deleteById(null);
		return "deleted";
	}

	@Override
	public Vendor getVendar(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public List<Vendor> getAllVendor() {
		
		return repo.findAll();
	}

}
