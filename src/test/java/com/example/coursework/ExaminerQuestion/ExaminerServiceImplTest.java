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
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ExaminerServiceImplTest {

    @ExtendWith(MockitoExtension.class)

    @Mock
    JavaQuestionServiceImpl javaQuestionService;


    @InjectMocks
    ExaminerServiceImpl examinerService;



    @BeforeEach
    void setUp() {
        examinerService = new ExaminerServiceImpl(javaQuestionService);
        Set<Question> tmp = new HashSet<>(List.of(
                new Question("Test1", "Test1"),
                new Question("Test2", "Test2"),
                new Question("Test3", "Test4")
        ));
        when(javaQuestionService.getAll()).thenReturn(tmp);
        when(javaQuestionService.getRandomQuestion()).thenReturn(new Question(
                "question1", "answer1"));
    }

    @Test
    void shouldGetQuestions1() throws QuestionException {
        assertEquals(examinerService.getQuestions(1),
                new ArrayList<>(Set.of(new Question("question1", "answer1"))));

    }

    @Test
    void shouldGetQuestions2() throws QuestionException {
        Collection<Question> list = examinerService.getQuestions(1);

        assertEquals(list.size(), examinerService.questionsForExam.size());
    }

}