package com.groupeisi.service;

import com.groupeisi.dto.SectorDto;
import java.util.List;

public interface ISectorService {
    List<SectorDto> getAll();
    SectorDto get(Long id);
    boolean delete(Long id);
    SectorDto save(SectorDto sectorsDto);
    boolean update(SectorDto sectorsDto);
}