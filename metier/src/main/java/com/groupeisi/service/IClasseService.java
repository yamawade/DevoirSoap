package com.groupeisi.service;

import com.groupeisi.dto.ClasseDto;
import java.util.List;

public interface IClasseService {
    List<ClasseDto> getAll();
    ClasseDto get(Long id);
    boolean delete(Long id);
    ClasseDto save(ClasseDto classesDto);
    boolean update(ClasseDto classesDto);
    List<ClasseDto> findBySectorId(Long sectorId);
}