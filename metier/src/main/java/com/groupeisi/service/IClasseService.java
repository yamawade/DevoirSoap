package com.groupeisi.service;

import com.groupeisi.dto.ClasseDto;
import java.util.List;

public interface IClasseService {
    ClasseDto get(Long id);
    List<ClasseDto> getAll();
    List<ClasseDto> findBySectorId(Long sectorId);
    boolean save(ClasseDto classesDto);
    boolean update(ClasseDto classesDto);
    boolean delete(Long id);
}