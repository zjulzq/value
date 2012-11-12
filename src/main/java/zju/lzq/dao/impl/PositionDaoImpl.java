package zju.lzq.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.PositionDao;
import zju.lzq.entity.Position;

@Repository @Transactional
public class PositionDaoImpl extends SimpleDaoImpl<Position> implements PositionDao {
	private static Logger log = Logger.getLogger(PositionDaoImpl.class);
	public Class<Position> bean = Position.class;

	public PositionDaoImpl() {
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	protected Class<Position> getBean() {
		return bean;
	}

}
