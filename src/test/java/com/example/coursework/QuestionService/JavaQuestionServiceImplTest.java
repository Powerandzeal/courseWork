package com.example.coursework.QuestionService;

import com.example.coursework.Question.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceImplTest {
    JavaQuestionServiceImpl javaQuestionService = new JavaQuestionServiceImpl();


    List <Question> listOfQuestion = new ArrayList<>();
    List <Question> listOfQuestion1 = new ArrayList<>();
    Question question1; Question question2; Question question3; Question question4;
    Question question5; Question question6; Question question7; Question question8;
    Question question9; Question question10;

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
        question1 = new Question("Кто был первый в космосе",
                "Юрий Гагари");



    }

    @Test
    void getAll() {
        question1 = new Question("Кто был первый в космосе",
                "Юрий Гагари");

        Question expected = javaQuestionService.questionAdd(question1);
        assertEquals(question1,expected);

    }
    @Test
    void getAll2() {

        List <Question> list= new ArrayList<>();
        question1 = new Question("Кто был первый в космосе",
                "Юрий Гагари");
        list.add(question1);
        question2 = new Question("Секретный вопрос ",
                "Пес");
        list.add(question2);
        question3 = new Question("Самая высокая точка на земле ",
                "Эверест");
        list.add(question3);
        question4 = new Question("Самая глубокая точка на земле",
                "Марианская впадина");
        list.add(question4);
        question5 = new Question(
                "Что такое модификаторы доступа в Java? Назовите их. Для чего используются?",
                "Модификаторы доступа позволяют ограничить доступ к данным для защиты ");
        list.add(question5);
        question6 = new Question(
                "Какая функция у оператора return?",
                "возвращать результат или использовать для прекращения работы метода");
        list.add(question6);
        question7 = new Question(
                "Когда применяется цикл while?",
                "когда нам нужен цикл");
        list.add(question7);
        question8 = new Question(
                "Какие есть типы данных в Java?",
                "примитивные и ссылочные");
        list.add(question8);
        question9 = new Question(
                "Дайте определение классу в Java",
                "класс это чертеж объекта");
        list.add(question9);
        question10 = new Question(
                "Какие методы называются геттерами? Что они делают?",
                "позволяют получить данные объекта");
        list.add(question10);

        Collection<Question> expected = javaQuestionService.getAll();
        assertEquals(list,expected);

    }

    @Test
    void getRandomQuestion() {
    }
}