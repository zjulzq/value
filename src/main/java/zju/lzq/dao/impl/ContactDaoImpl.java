package zju.lzq.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.ContactDao;
import zju.lzq.entity.Contact;

@Repository @Transactional
public class ContactDaoImpl extends SimpleDaoImpl<Contact> implements ContactDao {
	private static Logger log = Logger.getLogger(ContactDaoImpl.class);
	public Class<Contact> bean = Contact.class;

	public ContactDaoImpl() {
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	protected Class<Contact> getBean() {
		return bean;
	}

}
