package com.portfolio.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class Contact extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer contact_id;
    @Column
    private String street;
    @Column
    private Integer number;
    @Column
    private String zip_code;

}
