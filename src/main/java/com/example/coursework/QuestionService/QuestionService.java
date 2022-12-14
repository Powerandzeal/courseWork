package com.example.coursework.QuestionService;

import com.example.coursework.Question.Question;

import java.util.Collection;

public interface QuestionService {
    Question questionAdd(String question, String answer);

    Question questionAdd(Question question);

    void questionRemove(String  question, String answer);


    Collection<Question> getAll();

    String getRandomQuestion();
}
