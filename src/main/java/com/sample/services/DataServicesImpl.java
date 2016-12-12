package com.sample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.DataDao;
import com.sample.model.Employee;

@Service
public class DataServicesImpl implements DataServices{
	 @Autowired
	 DataDao dataDao;
	 
	 
	 public boolean addEntity(Employee employee) throws Exception {
	  return dataDao.addEntity(employee);
	 }

	 
	 public Employee getEntityById(long id) throws Exception {
	  return dataDao.getEntityById(id);
	 }

	 
	 public List getEntityList() throws Exception {
	  return dataDao.getEntityList();
	 }

	 
	 public boolean deleteEntity(long id) throws Exception {
	  return dataDao.deleteEntity(id);
	 }
}
