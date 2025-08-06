package com.groupeisi;

import com.groupeisi.dto.ClasseDto;
import com.groupeisi.service.ClasseService;

import jakarta.jws.WebService;

import java.util.List;


@WebService(endpointInterface = "com.groupeisi.ClasseWebService")
public class ClasseWebServiceImpl implements ClasseWebService {

    private final ClasseService classesService = new ClasseService();

    @Override
    public ClasseDto get(Long idClasse) {
        return classesService.get(idClasse);
    }

    @Override
    public List<ClasseDto> all() {
        return classesService.getAll();
    }

    @Override
    public List<ClasseDto> allBySector(Long sectorId) {
        return classesService.findBySectorId(sectorId);
    }

    @Override
    public ClasseDto save(ClasseDto classesDto) {
        return classesService.save(classesDto) ? classesDto : null;
    }

    @Override
    public ClasseDto update(ClasseDto classesDto) {
        return classesService.update(classesDto) ? classesDto : null;
    }

    @Override
    public boolean delete(Long idClasse) {
        return classesService.delete(idClasse);
    }
}