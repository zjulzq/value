package zju.lzq.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.ScoreDao;
import zju.lzq.entity.Score;

@Repository @Transactional
public class ScoreDaoImpl extends SimpleDaoImpl<Score> implements ScoreDao {
	private static Logger log = Logger.getLogger(ScoreDaoImpl.class);
	public Class<Score> bean = Score.class;

	public ScoreDaoImpl() {
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	protected Class<Score> getBean() {
		return bean;
	}

}
