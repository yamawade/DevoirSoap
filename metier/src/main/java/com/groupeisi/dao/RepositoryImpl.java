package com.groupeisi.dao;

import com.groupeisi.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class RepositoryImpl<T> implements Repository<T> {

	private final Class<T> classT;
	private final Session session = HibernateUtil.getSessionFactory().openSession();

	public RepositoryImpl() {
		this.classT = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public List<T> list(T t) {
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<T> criteria = builder.createQuery(classT);
		Root<T> root = criteria.from(classT);
		criteria.select(root);
		return session.createQuery(criteria).getResultList();
	}

	@Override
	// CORRIGÉ : La méthode get ne prend qu'un seul paramètre, l'ID
	public T get(Long id) {
		return session.find(classT, id);
	}

	@Override
	// CORRIGÉ : La méthode delete ne prend qu'un seul paramètre, l'ID
	public boolean delete(Long id) {
		Transaction tx = session.beginTransaction();
		try {
			T entity = session.find(classT, id);
			if (entity != null) {
				session.remove(entity);
				tx.commit();
				return true;
			}
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public T save(T t) {
		Transaction tx = session.beginTransaction();
		try {
			T savedEntity = (T) session.merge(t); // merge crée ou met à jour selon l’état
			tx.commit();
			return savedEntity;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			return null;
		}
	}



	@Override
	public boolean update(T t) {
		Transaction tx = session.beginTransaction();
		try {
			session.merge(t);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return false;
	}
}