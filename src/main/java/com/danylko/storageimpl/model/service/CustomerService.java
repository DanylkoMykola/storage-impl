package com.danylko.storageimpl.model.service;

import com.danylko.storageimpl.dao.entity.Customer;
import com.danylko.storageimpl.dao.repo.CustomerRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {

    private CustomerRepo customerRepo;

    public List<Customer> getAll() {
       return customerRepo.findAll();
    }

    public Customer getById(Long id) {
        return customerRepo.findById(id).orElseThrow(() -> new RuntimeException("Not found: " + id));
    }

    public Customer create(Customer customer) {
        return customerRepo.save(customer);
    }

    public void deleteById(Long id) {
        customerRepo.deleteById(id);
    }
}
