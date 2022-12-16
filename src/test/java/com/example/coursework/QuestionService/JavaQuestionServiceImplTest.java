package com.example.coursework.QuestionService;

import com.example.coursework.Question.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class JavaQuestionServiceImplTest {

    JavaQuestionServiceImpl javaQuestionService;


    @BeforeEach
    public void setUp() {
        javaQuestionService = new JavaQuestionServiceImpl();

    }

    @Test
    void questionAddTest() {
        Question question = new Question("Test1",
                "Test1");
        javaQuestionService.add(question);
        assertTrue(javaQuestionService.getAll().contains(question));
    }

    @Test
    void questionRemove() {
        Question question = new Question("Test",
                "Test");
        javaQuestionService.questions.add(question);
        System.out.println("Размер листа перед удалением объекта " + javaQuestionService.questions.size());
        javaQuestionService.remove(question);
        System.out.println("После удаления " + javaQuestionService.questions.size());
        assertEquals(5, javaQuestionService.questions.size());
    }

    @Test
    void questionRemove2() {
        Question question = new Question("Test",
                "Test");
        javaQuestionService.add(question);
        javaQuestionService.remove(question);
        assertFalse(javaQuestionService.getAll().contains(question));
    }

    @Test
    void getAll() {
        Collection<Question> expected = javaQuestionService.getAll();
        assertEquals(javaQuestionService.getAll(), expected);
    }


}