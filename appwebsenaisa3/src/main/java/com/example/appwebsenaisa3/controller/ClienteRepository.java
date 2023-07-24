package com.example.appwebsenaisa3.controller;

import com.example.appwebsenaisa3.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository <Cliente, Integer> {
}
