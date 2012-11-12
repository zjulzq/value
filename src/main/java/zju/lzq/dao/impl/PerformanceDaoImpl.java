package zju.lzq.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.PerformanceDao;
import zju.lzq.entity.Performance;

@Repository @Transactional
public class PerformanceDaoImpl extends SimpleDaoImpl<Performance> implements PerformanceDao {
	private static Logger log = Logger.getLogger(PerformanceDaoImpl.class);
	public Class<Performance> bean = Performance.class;

	public PerformanceDaoImpl() {
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	protected Class<Performance> getBean() {
		return bean;
	}

}
