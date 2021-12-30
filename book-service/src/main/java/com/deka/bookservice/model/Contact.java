package com.deka.bookservice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "iletisim")
@Data
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column(name = "adres")
    private String  address;


    @Column(name = "sehir")
    private String  city;


    @Column(name = "telefonno")
    private  int   phoneNumber;


    @OneToOne(mappedBy = "contact")
    private Writer writer;


    @OneToMany
    private List<Books> books;




}
