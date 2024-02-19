package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Vendor;

public interface Vrepo  extends JpaRepository<Vendor, Integer>{

}
