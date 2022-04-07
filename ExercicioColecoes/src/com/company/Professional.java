package com.company;

import java.math.BigDecimal;

public class Professional {

    private Integer id;
    private String name;
    private BigDecimal salary;


    public Professional(Integer id, String desenvolvedor, BigDecimal salary) {
        this.setId(id);
        desenvolvedor = getName();
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
