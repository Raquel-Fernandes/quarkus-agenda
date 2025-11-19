package com.portfolio.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Contact extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    public String name;
    @Column
    public String email;
    @Column
    public String phone;
    @Column
    public Date birth_date;

}
