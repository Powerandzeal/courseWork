package com.example.coursework.ExaminerQuestion;

import com.example.coursework.Exceptions.QuestionException;

import java.util.Collection;

public interface ExaminerService {

    Collection<String> getQuestions(int amount) throws QuestionException;
}
