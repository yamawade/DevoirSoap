package com.groupeisi;

import com.groupeisi.dto.ClasseDto;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

import java.util.List;

@WebService(serviceName = "ClasseWebService")
public interface ClasseWebService {

    @WebMethod(operationName = "getClasse")
    @RequestWrapper(localName = "getClasse",
            targetNamespace = "http://groupeisi.com/",
            className = "com.groupeisi.jaxws.GetClasse")
    @ResponseWrapper(localName = "getClasseResponse",
            targetNamespace = "http://groupeisi.com/",
            className = "com.groupeisi.jaxws.GetClasseResponse")
    ClasseDto get(@WebParam(name = "idClasse") Long idClasse);

    @WebMethod(operationName = "allClasses")
    List<ClasseDto> all();

    @WebMethod(operationName = "allClassesBySector")
    @RequestWrapper(localName = "allClassesBySector",
            targetNamespace = "http://groupeisi.com/",
            className = "com.groupeisi.jaxws.AllClassesBySector")
    @ResponseWrapper(localName = "allClassesBySectorResponse",
            targetNamespace = "http://groupeisi.com/",
            className = "com.groupeisi.jaxws.AllClassesBySectorResponse")
    List<ClasseDto> allBySector(@WebParam(name = "idSector") Long sectorId);

    @WebMethod(operationName = "saveClasse")
    @RequestWrapper(localName = "saveClasse",
            targetNamespace = "http://groupeisi.com/",
            className = "com.groupeisi.jaxws.SaveClasse")
    @ResponseWrapper(localName = "saveClasseResponse",
            targetNamespace = "http://groupeisi.com/",
            className = "com.groupeisi.jaxws.SaveClasseResponse")
    ClasseDto save(@WebParam(name = "classe") ClasseDto classesDto);

    @WebMethod(operationName = "updateClasse")
    @RequestWrapper(localName = "updateClasse",
            targetNamespace = "http://groupeisi.com/",
            className = "com.groupeisi.jaxws.UpdateClasse")
    @ResponseWrapper(localName = "updateClasseResponse",
            targetNamespace = "http://groupeisi.com/",
            className = "com.groupeisi.jaxws.UpdateClasseResponse")
    ClasseDto update(@WebParam(name = "classe") ClasseDto classesDto);

    @WebMethod(operationName = "deleteClasse")
    @RequestWrapper(localName = "deleteClasse",
            targetNamespace = "http://groupeisi.com/",
            className = "com.groupeisi.jaxws.DeleteClasse")
    @ResponseWrapper(localName = "deleteClasseResponse",
            targetNamespace = "http://groupeisi.com/",
            className = "com.groupeisi.jaxws.DeleteClasseResponse")
    boolean delete(@WebParam(name = "idClasse") Long idClasse);
}