package com.deka.bookservice.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "yazar")
@Data
public class Writer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "isim")
    private String  writerName;

    @Column(name = "soyisim")
    private String  writerLastName;

    @Column(name = "yas")
    private  int   writerAge;


    @OneToOne()
    private Contact contact;
}
