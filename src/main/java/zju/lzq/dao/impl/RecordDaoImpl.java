package zju.lzq.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.RecordDao;
import zju.lzq.entity.Record;

@Repository @Transactional
public class RecordDaoImpl extends SimpleDaoImpl<Record> implements RecordDao {
	private static Logger log = Logger.getLogger(RecordDaoImpl.class);
	public Class<Record> bean = Record.class;

	public RecordDaoImpl() {
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	protected Class<Record> getBean() {
		return bean;
	}

}
