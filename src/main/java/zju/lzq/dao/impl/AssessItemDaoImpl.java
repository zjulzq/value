package zju.lzq.dao.impl;

import org.apache.log4j.Logger;

import zju.lzq.dao.AssessItemDao;
import zju.lzq.entity.AssessItem;

public class AssessItemDaoImpl extends SimpleDaoImpl<AssessItem> implements AssessItemDao {
	private static Logger log = Logger.getLogger(AssessItemDaoImpl.class);
	public Class<AssessItem> bean = AssessItem.class;

	public AssessItemDaoImpl() {
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	protected Class<AssessItem> getBean() {
		return bean;
	}

}
