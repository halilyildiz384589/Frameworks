package com.halilyildiz.quizzapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;

    @ManyToMany
    private List<Question> questions;

}


//http://localhost:8106/quiz/create?category=General&numQ=5&title=JQuiz sorgusu ile title'ı JQuiz olarak ayarlarken, numQ ile 5 adet sorgu satırı sonucunu almasını istiyoruz.
