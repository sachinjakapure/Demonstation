package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Fault;

@Repository
public interface FaultRepositoy extends CrudRepository<Fault, Long>{

}
