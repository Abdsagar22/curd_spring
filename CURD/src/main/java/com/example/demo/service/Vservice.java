package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Vendor;

public interface Vservice {
	
	public String createVendar(Vendor vendor);
	public String UpadteVendar(Vendor vendor);
	public String deleteVendar(int id);
	public Vendor getVendar(int id);
	public List<Vendor> getAllVendor();
	

}
