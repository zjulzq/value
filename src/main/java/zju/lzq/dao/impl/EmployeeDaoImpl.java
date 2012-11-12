package zju.lzq.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.EmployeeDao;
import zju.lzq.entity.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl extends SimpleDaoImpl<Employee> implements EmployeeDao {
	private static Logger log = Logger.getLogger(EmployeeDaoImpl.class);
	public Class<Employee> bean = Employee.class;

	public EmployeeDaoImpl() {
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	protected Class<Employee> getBean() {
		return bean;
	}

}
