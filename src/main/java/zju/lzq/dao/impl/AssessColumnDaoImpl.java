package zju.lzq.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.AssessColumnDao;
import zju.lzq.entity.AssessColumn;

@Repository @Transactional
public class AssessColumnDaoImpl extends SimpleDaoImpl<AssessColumn> implements AssessColumnDao {
	private static Logger log = Logger.getLogger(AssessColumnDaoImpl.class);
	public Class<AssessColumn> bean = AssessColumn.class;

	public AssessColumnDaoImpl() {
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	protected Class<AssessColumn> getBean() {
		return bean;
	}

}
