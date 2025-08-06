package com.groupeisi.dao;


import com.groupeisi.entity.ClasseEntity;

import java.util.List;

public interface IClasseDao extends Repository<ClasseEntity> {
    public List<ClasseEntity> findBySectorId(Long sectorId);

}
