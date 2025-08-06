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
        return sectorsService.save(sectorsDto);
    }

    @Override
    public SectorDto update(SectorDto sectorsDto) {
        return sectorsDto;
    }


    @Override
    public boolean delete(Long id) {
        return sectorsService.delete(id);
    }
}