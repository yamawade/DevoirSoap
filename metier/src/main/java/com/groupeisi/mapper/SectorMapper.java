package com.groupeisi.mapper;

import com.groupeisi.dto.SectorDto;
import com.groupeisi.entity.SectorEntity;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SectorMapper {

    /**
     * Convertit une liste d'entités Sectors en une liste de DTOs Sectors.
     * @param sectors Les entités Sectors à convertir.
     * @return Une liste de SectorsDto.
     */
    public static List<SectorDto> listSectorsEntityToListSectorsDto(List<SectorEntity> sectors) {
        if (sectors == null) {
            return Collections.emptyList();
        }
        return sectors.stream()
                .map(SectorMapper::toSectorsDto)
                .collect(Collectors.toList());
    }

    /**
     * Convertit une entité Sectors en un DTO Sectors.
     * @param sector L'entité Sectors à convertir.
     * @return Le DTO Sectors correspondant.
     */
    public static SectorDto toSectorsDto(SectorEntity sector) {
        if (sector == null) {
            return null;
        }
        SectorDto dto = new SectorDto();
        dto.setId(sector.getId());
        dto.setName(sector.getName());
        // Vous pouvez ajouter la conversion des classes si vous le souhaitez
//        if (sector.getClasses() != null) {
//            dto.setClasses(ClasseMapper.listClassesEntityToListClassesDto(sector.getClasses()));
//        }
        return dto;
    }

    /**
     * Convertit un DTO Sectors en une entité Sectors.
     * @param sector Le DTO Sectors à convertir.
     * @return L'entité Sectors correspondante.
     */
    public static SectorEntity toSectorsEntity(SectorDto sector) {
        if (sector == null) {
            return null;
        }
        SectorEntity entity = new SectorEntity();
        entity.setId(sector.getId());
        entity.setName(sector.getName());
//        if (sector.getClasses() != null) {
//            entity.setClasses(ClasseMapper.listClassesDtoToListClassesEntity(sector.getClasses()));
//        }
        return entity;
    }
}
