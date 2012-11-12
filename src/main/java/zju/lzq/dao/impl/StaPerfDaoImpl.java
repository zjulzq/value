package zju.lzq.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.StaPerfDao;
import zju.lzq.entity.StaPerf;

@Repository @Transactional
public class StaPerfDaoImpl extends SimpleDaoImpl<StaPerf> implements StaPerfDao {
	private static Logger log = Logger.getLogger(StaPerfDaoImpl.class);
	public Class<StaPerf> bean = StaPerf.class;

	public StaPerfDaoImpl() {
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	protected Class<StaPerf> getBean() {
		return bean;
	}

}
