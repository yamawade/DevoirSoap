package com.groupeisi.dao;

import com.groupeisi.config.HibernateUtil;
import com.groupeisi.entity.ClasseEntity;
import org.hibernate.Session;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class ClasseDao extends RepositoryImpl<ClasseEntity> implements IClasseDao {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public List<ClasseEntity> findBySectorId(Long sectorId) {
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<ClasseEntity> cr = cb.createQuery(ClasseEntity.class);
        Root<ClasseEntity> root = cr.from(ClasseEntity.class);

        cr.select(root).where(cb.equal(root.get("sector").get("id"), sectorId));

        return session.createQuery(cr).getResultList();
    }
}