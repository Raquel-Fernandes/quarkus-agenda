package com.portfolio.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

public class Address extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    public Integer contact_id ;
    @Column
    public String street;
    @Column
    public Integer number ;
    @Column
    public String zip_code;

}
