package com.groupeisi.dto;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

@XmlRootElement(name = "sectors")
@XmlAccessorType(XmlAccessType.FIELD)
public class SectorDto implements Serializable {

    @XmlElement(name = "idSector", required = true)
    private Long id;

    @XmlElement(name = "name", required = true)
    private String name;

//    private List<ClasseDto> classes;

    public SectorDto() {
        super();
    }

    public SectorDto(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<ClasseDto> getClasses() {
//        return classes;
//    }
//
//    public void setClasses(List<ClasseDto> classes) {
//        this.classes = classes;
//    }
}
