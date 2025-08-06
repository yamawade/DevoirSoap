package com.groupeisi.dao;

import java.util.List;

public interface Repository<T> {

	public List<T> list(T t);
	public T get(Long id);
	public boolean delete(Long id);
	public boolean save(T t);
	public boolean update(T t);

}