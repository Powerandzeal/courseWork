package com.example.coursework.QuestionService;

import com.example.coursework.Question.Question;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class JavaQuestionServiceImpl implements QuestionService {


    List<Question> questions = new ArrayList<>();

    public JavaQuestionServiceImpl(List<Question> questions) {
        questions.add(new Question("Кто был первый в космосе",
                "Юрий Гагари"));
        questions.add(new Question("Секретный вопрос ",
                "Пес"));
        questions.add(new Question("Самая высокая точка на земле ",
                "Эверест"));
        questions.add(new Question("Самая глубокая точка на земле",
                "Марианская впадина"));
        questions.add(new Question(
                "Что такое модификаторы доступа в Java? Назовите их. Для чего используются?",
                "Модификаторы доступа позволяют ограничить доступ к данным для защиты "));
        questions.add(new Question(
                "Какая функция у оператора return?",
                "возвращать результат или использовать для прекращения работы метода"));
        questions.add(new Question(
                "Когда применяется цикл while?",
                "когда нам нужен цикл"));
        questions.add(new Question(
                "Какие есть типы данных в Java?",
                "примитивные и ссылочные"));
        questions.add(new Question(
                "Дайте определение классу в Java",
                "класс это чертеж объекта"));
        questions.add(new Question(
                "Какие методы называются геттерами? Что они делают?",
                "позволяют получить данные объекта"));
        this.questions = questions;

    }

    @Override
    public void QuestionAdd(String describeQuestion, String describeAnswer) {
//        Question question = new Question(describeQuestion,describeAnswer);
        questions.add(new Question(describeQuestion,describeAnswer));
    }

    @Override
    public void QuestionAdd(Question question) {
        questions.add(question);

    }

    @Override
    public void QuestionRemove(String describeQuestion, String describeAnswer) {

        questions.removeIf(question -> question.getQuestion().equals(describeQuestion));
    }

    @Override
    public List<Question> getAll() {
            return questions.stream().collect(Collectors.toList());
    }

    @Override
    public String getRandomQuestion() {
        Random random = new Random();
        String randomQuestion = questions.get(random.nextInt(questions.size())).getQuestion();
        return Collections.singleton(randomQuestion).toString();
    }
    public List<Question>  listOfQuestions(){
        return questions;
    }

    @Override
    public String toString() {
        return "JavaQuestionServiceImpl{" +
                "questions=" + questions +"\n"+
                '}';
    }
}
