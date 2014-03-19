package zju.lzq.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.PersonDao;
import zju.lzq.entity.Person;

@Repository
@Transactional
public class PersonDaoImpl extends SimpleDaoImpl<Person> implements PersonDao {
	private static Logger log = Logger.getLogger(PersonDaoImpl.class);
	public Class<Person> bean = Person.class;

	public PersonDaoImpl() {
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	protected Class<Person> getBean() {
		return bean;
	}

}
