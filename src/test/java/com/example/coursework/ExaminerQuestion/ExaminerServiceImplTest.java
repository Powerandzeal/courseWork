package com.example.coursework.ExaminerQuestion;

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
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExaminerServiceImplTest {

@ExtendWith(MockitoExtension.class)

    @Mock
ExaminerServiceImpl examinerService;

    @InjectMocks
    JavaQuestionServiceImpl javaQuestionService;
    @Test
    void getQuestions() {
        Mockito.when(javaQuestionService.)
        Mockito.when(javaQuestionService.getRandomQuestion()).thenReturn("TEst","Test");



    }
}