package com.example.core.service;

import com.example.core.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Page<Customer> findAll(Pageable pageable);

    Optional<Customer> findById(Long id);

    List<Customer> findByName(String name);

    Customer save(Customer customer);

    void deleteById(Long id);
}
