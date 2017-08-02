package com.elabel.restful.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elabel.restful.model.Employee;
/**
 * 
 * @author yash
 *
 */

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
