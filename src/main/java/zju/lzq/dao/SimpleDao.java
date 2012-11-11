package zju.lzq.dao;

import java.util.List;

public interface SimpleDao<T extends Object> {
	public void save(T object);

	public void delete(T object);
	
	public void delete(long id);

	public void update(T object);

	public T get(long id);

	public List<T> getAll();
}
