package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insart(Department obj);
	void upade(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();

}
