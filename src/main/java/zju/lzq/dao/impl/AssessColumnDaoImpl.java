package zju.lzq.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.AssessColumnDao;
import zju.lzq.entity.AssessRow;

@Repository @Transactional
public class AssessColumnDaoImpl extends SimpleDaoImpl<AssessRow> implements AssessColumnDao {
	private static Logger log = Logger.getLogger(AssessColumnDaoImpl.class);
	public Class<AssessRow> bean = AssessRow.class;

	public AssessColumnDaoImpl() {
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	protected Class<AssessRow> getBean() {
		return bean;
	}

}
