package com.halilyildiz.quizzapp.model;

import lombok.Data;

@Data
public class QuestionWrapper {
    private Long id;
    private String category;
    private String difficultylevel;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    public QuestionWrapper(Long id, String category, String difficultylevel, String option1, String option2, String option3, String option4){
        this.id=id;
        this.category = category;
        this.difficultylevel = difficultylevel;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }
    
}
