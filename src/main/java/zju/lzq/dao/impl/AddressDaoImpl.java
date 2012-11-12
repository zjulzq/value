package zju.lzq.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.AddressDao;
import zju.lzq.entity.Address;

@Repository @Transactional
public class AddressDaoImpl extends SimpleDaoImpl<Address> implements AddressDao {
	private static Logger log = Logger.getLogger(AddressDaoImpl.class);
	public Class<Address> bean = Address.class;

	public AddressDaoImpl() {
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	protected Class<Address> getBean() {
		return bean;
	}

}
