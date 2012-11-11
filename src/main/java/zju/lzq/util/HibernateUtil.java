package zju.lzq.util;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	private HibernateUtil() {
	}

	static {
		Configuration cfg = new Configuration();
		cfg.configure();
		sessionFactory = cfg.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static Session getSession() {
		synchronized (sessionFactory) {
			return sessionFactory.openSession();
		}
	}

	public static void save(Object entity) {
		Session session = null;
		Transaction tx = null;
		try {
			session = getSession();
			tx = session.beginTransaction();
			session.save(entity);
			tx.commit();
		} finally {
			close(session);
		}
	}

	public static void delete(Object entity) {
		Session session = null;
		Transaction tx = null;
		try {
			session = getSession();
			tx = session.beginTransaction();
			session.delete(entity);
			tx.commit();

		} finally {
			close(session);
		}
	}

	public static void update(Object entity) {
		Session session = null;
		Transaction tx = null;
		try {
			session = getSession();
			tx = session.beginTransaction();
			session.update(entity);
			tx.commit();
		} finally {
			close(session);
		}
	}

	public static Object get(Class<?> clazz, Serializable id) {
		Session session = null;
		try {
			session = getSession();
			Object object = session.get(clazz, id);
			return object;
		} finally {
			close(session);
		}
	}

	public static List<Object> getAll(String sql) {
		Session session = null;
		Query query = null;
		try {
			session = getSession();
			query = session.createQuery(sql);
			@SuppressWarnings("unchecked")
			List<Object> list = query.list();
			return list;
		} finally {
			close(session);
		}
	}

	private static void close(Session session) {
		if (session != null) {
			session.close();
		}
	}
}
