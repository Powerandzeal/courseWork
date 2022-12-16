package com.example.coursework.Exceptions;

import com.example.coursework.ExaminerQuestion.ExaminerServiceImpl;
import com.example.coursework.QuestionService.JavaQuestionServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class ControllerExceptionHandlerTest {
    JavaQuestionServiceImpl javaQuestionService;
    ExaminerServiceImpl examinerService;

    @BeforeEach
    void setUp() {
        javaQuestionService = new JavaQuestionServiceImpl();
        examinerService = new ExaminerServiceImpl(javaQuestionService);

    }

    @Test
    void shouldThrowsException() throws QuestionException {
        assertThrows(QuestionException.class, () -> examinerService.getQuestions(8),
                "в строку amount ведено значение больше чем есть вопросов в списке"
        );
    }
}