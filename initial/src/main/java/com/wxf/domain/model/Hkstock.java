package com.wxf.domain.model;

import java.math.BigDecimal;
import java.util.Date;

public class Hkstock {
    private Long id;

    private String hkcode;

    private String hkname;

    private Integer number;

    private BigDecimal percent;

    private Date date;

    private String code;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHkcode() {
        return hkcode;
    }

    public void setHkcode(String hkcode) {
        this.hkcode = hkcode == null ? null : hkcode.trim();
    }

    public String getHkname() {
        return hkname;
    }

    public void setHkname(String hkname) {
        this.hkname = hkname == null ? null : hkname.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}