package zju.lzq.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.AssessTableDao;
import zju.lzq.entity.AssessTable;

@Repository @Transactional
public class AssessTableDaoImpl extends SimpleDaoImpl<AssessTable> implements AssessTableDao {
	private static Logger log = Logger.getLogger(AssessTableDaoImpl.class);
	public Class<AssessTable> bean = AssessTable.class;

	public AssessTableDaoImpl() {
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	protected Class<AssessTable> getBean() {
		return bean;
	}

}
