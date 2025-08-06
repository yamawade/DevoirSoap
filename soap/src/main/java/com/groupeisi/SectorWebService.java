package com.groupeisi;

import com.groupeisi.dto.SectorDto;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

import java.util.List;

@WebService(serviceName = "SectorWebService")
public interface SectorWebService {

    @WebMethod(operationName = "getSector")
    @RequestWrapper(localName = "getSector",
            targetNamespace = "http://groupeisi.com/",
            className = "com.groupeisi.jaxws.GetSector")
    @ResponseWrapper(localName = "getSectorResponse",
            targetNamespace = "http://groupeisi.com/",
            className = "com.groupeisi.jaxws.GetSectorResponse")
    SectorDto get(@WebParam(name = "idSector") Long id);

    @WebMethod(operationName = "allSectors")
    List<SectorDto> all();

    @WebMethod(operationName = "saveSector")
    @RequestWrapper(localName = "saveSector",
            targetNamespace = "http://groupeisi.com/",
            className = "com.groupeisi.jaxws.SaveSector")
    @ResponseWrapper(localName = "saveSectorResponse",
            targetNamespace = "http://groupeisi.com/",
            className = "com.groupeisi.jaxws.SaveSectorResponse")
    SectorDto save(@WebParam(name = "sector") SectorDto sectorsDto);

    @WebMethod(operationName = "updateSector")
    @RequestWrapper(localName = "updateSector",
            targetNamespace = "http://groupeisi.com/",
            className = "com.groupeisi.jaxws.UpdateSector")
    @ResponseWrapper(localName = "updateSectorResponse",
            targetNamespace = "http://groupeisi.com/",
            className = "com.groupeisi.jaxws.UpdateSectorResponse")
    SectorDto update(@WebParam(name = "sector") SectorDto sectorsDto);

    @WebMethod(operationName = "deleteSector")
    @RequestWrapper(localName = "deleteSector",
            targetNamespace = "http://groupeisi.com/",
            className = "com.groupeisi.jaxws.DeleteSector")
    @ResponseWrapper(localName = "deleteSectorResponse",
            targetNamespace = "http://groupeisi.com/",
            className = "com.groupeisi.jaxws.DeleteSectorResponse")
    boolean delete(@WebParam(name = "idSector") Long id);
}