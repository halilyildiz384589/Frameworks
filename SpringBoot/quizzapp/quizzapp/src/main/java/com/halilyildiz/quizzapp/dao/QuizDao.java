package com.halilyildiz.quizzapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.halilyildiz.quizzapp.model.Quiz;


public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
