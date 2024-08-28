package com.ansh.quizapp.model;

import lombok.Data;

@Data
public class QuestionWrapper {

    private Integer id;
    private String question_title;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    public QuestionWrapper(String option4, String option3, String option2, String option1, String question_title, Integer id) {
        this.option4 = option4;
        this.option3 = option3;
        this.option2 = option2;
        this.option1 = option1;
        this.question_title = question_title;
        this.id = id;
    }
}
