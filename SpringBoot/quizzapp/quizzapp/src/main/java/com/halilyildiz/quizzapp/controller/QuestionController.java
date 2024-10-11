package com.halilyildiz.quizzapp.controller;

import com.halilyildiz.quizzapp.model.Question;
import com.halilyildiz.quizzapp.service.QuestionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("question7")
//http://localhost:8085/question/allQuestions  resource/properties'de ana URL görülebilir. onun yanına / işareti ile request mapping ve GetMapping eklenmelidir.

public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){

        return questionService.getAllQuestions();

    }


    //category arastırması icin yeni bir service bağlantısı yarattık.
    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){

        return questionService.getQuestionsByCategory(category);

    }
    
    @PostMapping("add")
    public ResponseEntity<String> addQuestion (@RequestBody Question question){

        return questionService.addQuestion(question);
    }


}

