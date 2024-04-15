package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.airline;

@Repository
public interface prorepository extends JpaRepository <airline,Integer>{


}
