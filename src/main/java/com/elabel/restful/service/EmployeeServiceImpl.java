package com.elabel.restful.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elabel.restful.model.Employee;
import com.elabel.restful.repository.EmployeeRepository;

/**
 * 
 * @author yash
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee save(Employee entity) {
		return employeeRepository.save(entity);
	}

	@Override
	public Employee getById(Long id) {
		return employeeRepository.findOne( id);
	}

	@Override
	public List<Employee> getAll() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		employeeRepository.delete( id);
	}

}
