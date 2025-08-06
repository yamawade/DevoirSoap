package com.groupeisi.dao;

import java.util.List;

public interface Repository<T> {

	public List<T> list(T t);
	public T get(Long id);
	public boolean delete(Long id);
	T save(T t); // au lieu de boolean

	public boolean update(T t);

}