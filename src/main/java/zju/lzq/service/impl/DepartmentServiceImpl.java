package zju.lzq.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.DepartmentDao;
import zju.lzq.dao.PersonDao;
import zju.lzq.entity.Department;
import zju.lzq.service.DepartmentService;
import zju.lzq.web.form.AddDepartmentForm;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

	@Resource
	private DepartmentDao departmentDao;
	@Resource
	private PersonDao personDao;

	@Override
	public void save(AddDepartmentForm addDepartmentForm) {
		Department department = new Department();
		department.setCode(addDepartmentForm.getDeptCode());
		department.setName(addDepartmentForm.getDeptName());
		department.setManager(personDao.get(addDepartmentForm.getManager()));
		department.setViceManager(personDao.get(addDepartmentForm.getViceManager()));
		department.setPrcDate(new Date());
		departmentDao.save(department);
	}

}
