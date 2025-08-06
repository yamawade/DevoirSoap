// Contenu de SectorService.java
package com.groupeisi.service;

import com.groupeisi.dao.ISectorDao;
import com.groupeisi.dao.SectorDao;
import com.groupeisi.dto.SectorDto;
import com.groupeisi.entity.SectorEntity;
import com.groupeisi.mapper.SectorMapper;
import java.util.List;

public class SectorService implements ISectorService {

    private final ISectorDao sectorsDao = new SectorDao();

    @Override
    public List<SectorDto> getAll() {
        return SectorMapper.listSectorsEntityToListSectorsDto(sectorsDao.list(new SectorEntity()));
    }

    @Override
    public SectorDto get(Long id) {
        SectorEntity entity = sectorsDao.get(id);
        return SectorMapper.toSectorsDto(entity);
    }

    @Override
    public boolean delete(Long id) {
        return sectorsDao.delete(id);
    }

    @Override
    public boolean save(SectorDto sectorsDto) {
        SectorEntity entity = SectorMapper.toSectorsEntity(sectorsDto);
        return sectorsDao.save(entity);
    }

    @Override
    public boolean update(SectorDto sectorsDto) {
        SectorEntity entity = SectorMapper.toSectorsEntity(sectorsDto);
        return sectorsDao.update(entity);
    }
}