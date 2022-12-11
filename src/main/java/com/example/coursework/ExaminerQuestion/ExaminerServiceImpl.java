package com.example.coursework.ExaminerQuestion;

import com.example.coursework.Exceptions.QuestionException;
import com.example.coursework.Question.Question;
import com.example.coursework.QuestionService.JavaQuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class ExaminerServiceImpl implements ExaminerService {


    JavaQuestionServiceImpl javaQuestionService;
@Autowired
    public ExaminerServiceImpl(JavaQuestionServiceImpl javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @Override
    public Collection<String> getQuestions(int amount) throws QuestionException {

        Collection<String> questionsForExam= new ArrayList<>();
        if(amount>javaQuestionService.getAll().size()) {
            throw new QuestionException("Введеено значение больше чем колличество вопросов");


        }else {
            for (int i = 0; i < amount; ) {
                String randomQuestion = javaQuestionService.getRandomQuestion();

                if (!questionsForExam.contains(randomQuestion)) {
                    questionsForExam.add(randomQuestion);
                    i++;
                }
            }
            return questionsForExam;
        }
    }
}
