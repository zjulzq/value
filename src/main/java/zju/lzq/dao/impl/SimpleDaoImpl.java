package zju.lzq.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.SimpleDao;

@Transactional
public abstract class SimpleDaoImpl<T> implements SimpleDao<T> {
	@Resource
	protected SessionFactory sessionFactory;

	protected abstract Class<T> getBean();

	public SimpleDaoImpl() {
	}

	public void save(T object) {
		sessionFactory.getCurrentSession().persist(object);
	}

	public void delete(T object) {
		sessionFactory.getCurrentSession().delete(object);
	}

	public void delete(long id) {
		sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(getBean(), id));
	}

	public void update(T object) {
		sessionFactory.getCurrentSession().merge(object);
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public T get(long id) {
		return (T) sessionFactory.getCurrentSession().get(getBean(), id);
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List<T> getAll() {
		String hql = "from " + getBean().getName();
		return (List<T>) sessionFactory.getCurrentSession().createQuery(hql).list();
	}

}
