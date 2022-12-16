package com.example.coursework.ExaminerQuestion;

import com.example.coursework.Exceptions.QuestionException;
import com.example.coursework.Question.Question;
import com.example.coursework.QuestionService.JavaQuestionServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExaminerServiceImplTest {

    @ExtendWith(MockitoExtension.class)

    @Mock
    JavaQuestionServiceImpl javaQuestionService;


    @InjectMocks
    ExaminerServiceImpl examinerService;

    @BeforeEach
    void setUp() {
        javaQuestionService = new JavaQuestionServiceImpl();
        examinerService = new ExaminerServiceImpl(javaQuestionService);

    }


    @Test
    void shouldGetQuestions() throws QuestionException {
        List<Question> list = examinerService.getQuestions(2);

        assertEquals(list.size(), examinerService.questionsForExam.size());
    }

    @Test
    void shouldThrowsException() throws QuestionException {

        assertThrows(QuestionException.class, () -> examinerService.getQuestions(8), "в строку amount " +
                "введено число больше чем имееться вопросов");
    }

}