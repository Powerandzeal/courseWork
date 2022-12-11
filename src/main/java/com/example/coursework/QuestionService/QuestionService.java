package com.example.coursework.QuestionService;

import com.example.coursework.Question.Question;

import java.util.Collection;

public interface QuestionService {
    void QuestionAdd(String question,String answer);

    void QuestionAdd(Question question);

    void QuestionRemove (String  question,String answer);


    Collection<Question> getAll();

    String getRandomQuestion();
}
