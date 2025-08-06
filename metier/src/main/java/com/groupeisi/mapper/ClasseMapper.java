package com.groupeisi.mapper;

import com.groupeisi.dto.ClasseDto;
import com.groupeisi.entity.ClasseEntity;
import com.groupeisi.entity.SectorEntity;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ClasseMapper {

    /**
     * Convertit une liste d'entités Classes en une liste de DTOs Classes.
     * @param classes Les entités Classes à convertir.
     * @return Une liste de ClassesDto.
     */
    public static List<ClasseDto> listClassesEntityToListClassesDto(List<ClasseEntity> classes) {
        if (classes == null) {
            return Collections.emptyList();
        }
        return classes.stream()
                .map(ClasseMapper::toClassesDto)
                .collect(Collectors.toList());
    }

    /**
     * Convertit un DTO Classes en une entité Classes.
     * @param classes Les DTOs Classes à convertir.
     * @return Une liste d'entités Classes.
     */
    public static List<ClasseEntity> listClassesDtoToListClassesEntity(List<ClasseDto> classes) {
        if (classes == null) {
            return Collections.emptyList();
        }
        return classes.stream()
                .map(ClasseMapper::toClassesEntity)
                .collect(Collectors.toList());
    }

    /**
     * Convertit une entité Classes en un DTO Classes.
     * @param classe L'entité Classes à convertir.
     * @return Le DTO Classes correspondant.
     */
    public static ClasseDto toClassesDto(ClasseEntity classe) {
        if (classe == null) {
            return null;
        }
        ClasseDto dto = new ClasseDto();
        dto.setId(classe.getId());
        dto.setClassName(classe.getClassName());
        dto.setDescription(classe.getDescription());
        // Assurez-vous que le secteur existe avant d'accéder à son ID
        if (classe.getSector() != null) {
            dto.setSectorId(classe.getSector().getId());
        }
        return dto;
    }

    /**
     * Convertit un DTO Classes en une entité Classes.
     * @param classe Le DTO Classes à convertir.
     * @return L'entité Classes correspondante.
     */
    public static ClasseEntity toClassesEntity(ClasseDto classe) {
        if (classe == null) {
            return null;
        }
        ClasseEntity entity = new ClasseEntity();
        entity.setId(classe.getId());
        entity.setClassName(classe.getClassName());
        entity.setDescription(classe.getDescription());
        // L'entité Sectors doit être créée et son ID défini
        if (classe.getSectorId() != null) {
            @SuppressWarnings("LanguageDetectionInspection") SectorEntity sector = new SectorEntity();
            sector.setId(classe.getSectorId());
            entity.setSector(sector);
        }
        return entity;
    }
}