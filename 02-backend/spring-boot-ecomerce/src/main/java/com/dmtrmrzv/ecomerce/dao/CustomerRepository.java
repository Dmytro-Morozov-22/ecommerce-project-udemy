package com.dmtrmrzv.ecomerce.dao;

import com.dmtrmrzv.ecomerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
