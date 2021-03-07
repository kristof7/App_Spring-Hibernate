package com.kamper.accessingdatajpa;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    Employee findByAge(Integer employeeAge);
}
