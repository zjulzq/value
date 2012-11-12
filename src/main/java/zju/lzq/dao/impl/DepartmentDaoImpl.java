package zju.lzq.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.DepartmentDao;
import zju.lzq.entity.Department;

@Repository @Transactional
public class DepartmentDaoImpl extends SimpleDaoImpl<Department> implements DepartmentDao {
	private static Logger log = Logger.getLogger(DepartmentDaoImpl.class);
	public Class<Department> bean = Department.class;

	public DepartmentDaoImpl() {
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	protected Class<Department> getBean() {
		return bean;
	}

}
