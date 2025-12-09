package com.portfolio.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;



// @Transactional
@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "contact")
public class Contact extends PanacheEntityBase {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contact_seq")
    @SequenceGenerator(name = "contact_seq", sequenceName = "contact_seq", allocationSize = 1)
    private Long id;
    @Column(name = "name")
    public String name;
    @Column(name = "email")
    public String email;
    @Column(name = "phone")
    public String phone;
    @Column(name = "birth_date")
    public Date birthDate;

    // join com endereço


}
