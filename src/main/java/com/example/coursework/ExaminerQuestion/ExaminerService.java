package com.example.coursework.ExaminerQuestion;

import com.example.coursework.Exceptions.QuestionException;
import com.example.coursework.Question.Question;

import java.util.List;

public interface ExaminerService {
    List<Question> getQuestions(int amount) throws QuestionException;
}
