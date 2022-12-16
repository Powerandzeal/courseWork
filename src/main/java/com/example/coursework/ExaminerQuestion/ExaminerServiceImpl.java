package com.example.coursework.ExaminerQuestion;

import com.example.coursework.Exceptions.QuestionException;
import com.example.coursework.Question.Question;
import com.example.coursework.QuestionService.JavaQuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    protected List<Question> questionsForExam;
    protected JavaQuestionServiceImpl javaQuestionService;

    @Autowired
    public ExaminerServiceImpl(JavaQuestionServiceImpl javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @Override
    public List<Question> getQuestions(int amount) throws QuestionException {

        questionsForExam = new ArrayList<>();

        if (amount > javaQuestionService.getAll().size()) {
            throw new QuestionException("Введеено значение больше чем колличество вопросов");
        } else {
            for (int i = 0; i < amount; ) {
                Question randomQuestion = javaQuestionService.getRandomQuestion();

                if (!questionsForExam.contains(randomQuestion)) {
                    questionsForExam.add(randomQuestion);
                    i++;
                }
            }
            return questionsForExam;
        }
    }
}
