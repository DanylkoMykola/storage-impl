package com.danylko.storageimpl.presentstion.controller;

import com.danylko.storageimpl.dao.entity.Customer;
import com.danylko.storageimpl.model.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    @GetMapping()
    public ResponseEntity<List<Customer>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getAll());
    }
    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer customer) {
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.create(customer));
    }
    @GetMapping("{id}")
    public ResponseEntity<Customer> getById(@PathVariable Long id) {
        return ResponseEntity.status((HttpStatus.OK)).body(customerService.getById(id));
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        customerService.deleteById(id);
    }
}
