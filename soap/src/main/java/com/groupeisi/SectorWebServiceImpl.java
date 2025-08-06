package com.groupeisi;

import com.groupeisi.dto.SectorDto;
import com.groupeisi.service.SectorService;
import jakarta.jws.WebService;

import java.util.List;

@WebService(endpointInterface = "com.groupeisi.SectorWebService")
public class SectorWebServiceImpl implements SectorWebService {

    private final SectorService sectorsService = new SectorService();

    @Override
    public SectorDto get(Long id) {
        return sectorsService.get(id);
    }

    @Override
    public List<SectorDto> all() {
        return sectorsService.getAll();
    }

    @Override
    public SectorDto save(SectorDto sectorsDto) {
        // Validation : Un DTO pour la création ne doit pas avoir d'ID
        if (sectorsDto.getId() != null && sectorsDto.getId() != 0) {
            // Lancer une exception pour indiquer une mauvaise utilisation de l'API
            throw new IllegalArgumentException("Impossible de créer un secteur avec un ID existant. Utilisez l'opération 'update' à la place.");
        }
        boolean isSaved = sectorsService.save(sectorsDto);
        return isSaved ? sectorsDto : null;
    }

    @Override
    public SectorDto update(SectorDto sectorsDto) {
        // Validation : Un DTO pour la mise à jour doit avoir un ID
        if (sectorsDto.getId() == null || sectorsDto.getId() == 0) {
            // Lancer une exception pour indiquer une mauvaise utilisation de l'API
            throw new IllegalArgumentException("L'ID est requis pour la mise à jour d'un secteur. Utilisez l'opération 'save' pour créer un nouveau secteur.");
        }
        boolean isUpdated = sectorsService.update(sectorsDto);
        return isUpdated ? sectorsDto : null;
    }

    @Override
    public boolean delete(Long id) {
        return sectorsService.delete(id);
    }
}