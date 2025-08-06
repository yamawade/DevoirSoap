package com.groupeisi.service;

import com.groupeisi.dao.IClasseDao;
import com.groupeisi.dao.ClasseDao;
import com.groupeisi.dto.ClasseDto;
import com.groupeisi.entity.ClasseEntity;
import com.groupeisi.mapper.ClasseMapper;

import java.util.List;

public class ClasseService implements IClasseService {

    private final IClasseDao classesDao = new ClasseDao();

    @Override
    public List<ClasseDto> getAll() {
        return ClasseMapper.listClassesEntityToListClassesDto(classesDao.list(new ClasseEntity()));
    }

    @Override
    public ClasseDto get(Long id) {
        ClasseEntity entity = classesDao.get(id);
        return ClasseMapper.toClassesDto(entity);
    }

    @Override
    public boolean delete(Long id) {
        return classesDao.delete(id);
    }

    @Override
    public boolean save(ClasseDto classesDto) {
        ClasseEntity entity = ClasseMapper.toClassesEntity(classesDto);
        return classesDao.save(entity);
    }

    @Override
    public boolean update(ClasseDto classesDto) {
        ClasseEntity entity = ClasseMapper.toClassesEntity(classesDto);
        return classesDao.update(entity);
    }

    @Override
    public List<ClasseDto> findBySectorId(Long sectorId) {
        return ClasseMapper.listClassesEntityToListClassesDto(classesDao.findBySectorId(sectorId));
    }
}