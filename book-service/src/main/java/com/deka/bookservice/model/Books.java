package com.deka.bookservice.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "kitaplar")
@Data

public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;


    @Column(name = "kitapadi")
    private String  bookName;

    @Column(name = "yazaradi")
    private String  writerName;

    @Column(name = "sayfasayisi")
    private  int   pagesNumber;



}
