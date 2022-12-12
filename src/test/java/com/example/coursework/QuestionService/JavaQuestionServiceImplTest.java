package com.example.coursework.QuestionService;

import com.example.coursework.Question.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceImplTest {
    JavaQuestionServiceImpl javaQuestionService = new JavaQuestionServiceImpl();


    List <Question> listOfQuestion = new ArrayList<>();
    List <Question> listOfQuestion1 = new ArrayList<>();
    Question question1;

    public static String QUESTION = "question test";
    public static String ANSWER = "answer test";

    @BeforeEach
    public void setUp() {
        Question question1 = new Question("Кто был первый в космосе",
                "Юрий Гагари");
        Question question2 = new Question("Секретный вопрос ",
                "Пес");
        Question question3 = new Question("Самая высокая точка на земле ",
                "Эверест");


    }

    @Test
    void questionAdd() {
        Question question = new Question("Кто был первый в космосе",
                "Юрий Гагарин");

        assertEquals(question,javaQuestionService.questionAdd(question));

    }

    @Test
    void testQuestionAdd() {
    }

    @Test
    void questionRemove() {

    }

    @Test
    void getAll() {
        question1 = new Question("Кто был первый в космосе",
                "Юрий Гагари");

        Question expected = javaQuestionService.questionAdd(question1);
        assertEquals(question1,expected);

    }

    @Test
    void getRandomQuestion() {
    }
}