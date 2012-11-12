package zju.lzq.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.ContractDao;
import zju.lzq.entity.Contract;

@Repository @Transactional
public class ContractDaoImpl extends SimpleDaoImpl<Contract> implements ContractDao {
	private static Logger log = Logger.getLogger(ContractDaoImpl.class);
	public Class<Contract> bean = Contract.class;

	public ContractDaoImpl() {
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	protected Class<Contract> getBean() {
		return bean;
	}

}
