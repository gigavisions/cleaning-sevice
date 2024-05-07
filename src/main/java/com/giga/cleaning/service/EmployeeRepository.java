package com.giga.cleaning.service;

import com.giga.cleaning.service.Model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,String> {

}
