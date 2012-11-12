package zju.lzq.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.NameDao;
import zju.lzq.entity.Name;

@Repository @Transactional
public class NameDaoImpl extends SimpleDaoImpl<Name> implements NameDao {
	private static Logger log = Logger.getLogger(NameDaoImpl.class);
	public Class<Name> bean = Name.class;

	public NameDaoImpl() {
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	protected Class<Name> getBean() {
		return bean;
	}

}
