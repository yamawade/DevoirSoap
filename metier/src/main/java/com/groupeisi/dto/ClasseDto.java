package com.groupeisi.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "classe")
@XmlAccessorType(XmlAccessType.FIELD)
public class ClasseDto implements Serializable {

    @XmlElement(name = "idClass", required = true)
    private Long id;
    @XmlElement(name = "className", required = true)
    private String className;
    @XmlElement(name = "description", required = false)
    private String description;
    @XmlElement(name = "sectorId", required = true)
    private Long sectorId;

    public ClasseDto() {
        super();
    }

    public ClasseDto(Long id, String className, String description, Long sectorId) {
        super();
        this.id = id;
        this.className = className;
        this.description = description;
        this.sectorId = sectorId;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getSectorId() {
        return sectorId;
    }

    public void setSectorId(Long sectorId) {
        this.sectorId = sectorId;
    }
}