package com.example.coursework.QuestionService;

import com.example.coursework.Question.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class JavaQuestionServiceImplTest {

    JavaQuestionServiceImpl javaQuestionService;



    List <Question> listOfQuestion = new ArrayList<>();
    List <Question> listOfQuestion1 = new ArrayList<>();
//    Question question1; Question question2; Question question3; Question question4;
//    Question question5; Question question6; Question question7; Question question8;
//    Question question9; Question question10;


    public static String QUESTION = "question test";
    public static String ANSWER = "answer test";

    @BeforeEach
    public void setUp() {
        javaQuestionService = new JavaQuestionServiceImpl();


    }

    @Test
    void questionAdd2() {

        Question question = new Question("Test1",
                "Test1");
        javaQuestionService.questionAdd(question);
        assertTrue(javaQuestionService.getAll().contains(question));
    }


    @Test
    void questionRemove() {


        System.out.println("Размер листа перед удалением объекта " + javaQuestionService.questions.size());
        javaQuestionService.questionRemove("Кто был первый в космосе","Юрий Гагарин");
        System.out.println("После удаления "+javaQuestionService.questions.size());
        assertEquals(9,javaQuestionService.questions.size());


    }
    @Test
    void questionRemove2() {

        Question question = new Question("Test",
                "Test");
        javaQuestionService.questionAdd(question);
        javaQuestionService.questionRemove("Test","Test");
        assertFalse(javaQuestionService.getAll().contains(question));
    }


    @Test
    void getAll() {

        Collection<Question> expected = javaQuestionService.getAll();
        assertEquals(javaQuestionService.getAll(),expected);

    }

    @Test
    void getRandomQuestion() {
        String test = javaQuestionService.getRandomQuestion();
        javaQuestionService.questions.contains(test);
        when
        System.out.println(test);
        System.out.println(javaQuestionService.questions.stream());
        assertEquals(javaQuestionService.getRandomQuestion(),test);




    }
}