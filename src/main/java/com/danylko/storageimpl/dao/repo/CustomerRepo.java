package com.danylko.storageimpl.dao.repo;

import com.danylko.storageimpl.dao.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepo extends MongoRepository<Customer, Long> {
}
