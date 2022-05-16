package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.CUPROD;

@Repository
public interface ProductoRepository extends CrudRepository <CUPROD,Long> {

}
