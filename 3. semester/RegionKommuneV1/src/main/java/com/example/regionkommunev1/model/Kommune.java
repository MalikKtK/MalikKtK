package com.example.regionkommunev1.model;

import jakarta.persistence.*;

@Entity
public class Kommune {

    @Id
    @Column(length = 4)
    private String kode;
    private String name;
    private String href;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @ManyToOne
    @JoinColumn(name = "region", referencedColumnName = "kode")
    private Region region;

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }


}
