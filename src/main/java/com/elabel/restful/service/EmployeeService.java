package com.elabel.restful.service;

import java.util.List;

import com.elabel.restful.model.Employee;

/**
 * 
 * @author yash
 *
 */
public interface EmployeeService {

	public Employee save(Employee entity);

	public Employee getById(Long id);

	public List<Employee> getAll();

	public void delete(Long id);
}
