package com.silbo.exchange_data.SLB_TEST.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "vm_test_stgmvtin")
public class Stgmvtin {

    @Id
    private Long id;

    @Column(name = "stcmsgid")
    private String stcmsgid;

    @Column(name = "stccproin")
    private String stccproin;

    public Long getId() {
        return id;
    }

    public String getStcmsgid() {
        return stcmsgid;
    }

    public String getStccproin() {
        return stccproin;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setStcmsgid(String stcmsgid) {
        this.stcmsgid = stcmsgid;
    }

    public void setStccproin(String stccproin) {
        this.stccproin = stccproin;
    }
}
