package com.example.coursework.QuestionService;

import com.example.coursework.Question.Question;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class JavaQuestionServiceImpl implements QuestionService {


    protected List<Question> questions = new ArrayList<>();

    public JavaQuestionServiceImpl() {
        Question question1 = new Question("Кто был первый в космосе",
                "Юрий Гагари");
        questions.add(question1);
        Question question2 = new Question("Секретный вопрос ",
                "Пес");
        questions.add(question2);
        Question question3 = new Question("Самая высокая точка на земле ",
                "Эверест");
        questions.add(question3);
        Question question4 = new Question("Самая глубокая точка на земле",
                "Марианская впадина");
        questions.add(question4);
        Question question5 = new Question(
                "Что такое модификаторы доступа в Java? Назовите их. Для чего используются?",
                "Модификаторы доступа позволяют ограничить доступ к данным для защиты ");
        questions.add(question5);
//        questions.add(new Question(
//                "Какая функция у оператора return?",
//                "возвращать результат или использовать для прекращения работы метода"));
//        questions.add(new Question(
//                "Когда применяется цикл while?",
//                "когда нам нужен цикл"));
//        questions.add(new Question(
//                "Какие есть типы данных в Java?",
//                "примитивные и ссылочные"));
//        questions.add(new Question(
//                "Дайте определение классу в Java",
//                "класс это чертеж объекта"));
//        questions.add(new Question(
//                "Какие методы называются геттерами? Что они делают?",
//                "позволяют получить данные объекта"));

    }

    @Override
    public Question add(String describeQuestion, String describeAnswer) {
        Question question = new Question(describeQuestion, describeAnswer);
        questions.add(question);
        return question;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }


    public Question remove(Question question) {
        if (questions.contains(question)) {
            questions.remove(question);
        }
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        return questions.get(random.nextInt(questions.size()));
    }
    //Должен возвращать объект типа question

//    public Question getRandomQuestion3() {
//        Random random = new Random();
//        Question randomQuestion = questions.get(random.nextInt(questions.size()));
//        return randomQuestion;
//    }
//    @Override
//    public String getRandomQuestion() {
//        Random random = new Random();
//        String randomQuestion = questions.get(random.nextInt(questions.size())).getQuestion();
//        return Collections.singleton(randomQuestion).toString();
//    }

    @Override
    public String toString() {
        return "JavaQuestionServiceImpl{" +
                "questions=" + questions + "\n" +
                '}';
    }
}
