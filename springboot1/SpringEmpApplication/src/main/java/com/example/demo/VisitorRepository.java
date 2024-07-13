package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.annotation.Id;
public interface VisitorRepository extends JpaRepository<Visitor, Long> {

	List<Visitor> findAll();
}