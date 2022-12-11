package com.example.coursework.Question;

import java.util.Objects;

public class Question {
//    private int id ;

    private String describeQuestion;
    private String describeAnswer;

    public Question(String describeQuestion, String describeAnswer) {
        this.describeQuestion = describeQuestion;
        this.describeAnswer = describeAnswer;
//        id++;
    }

    public String getQuestion() {
        return describeQuestion;
    }

    public void setQuestion(String question) {
        this.describeQuestion = question;
    }

    public String getAnswer() {
        return describeAnswer;
    }

    public void setAnswer(String answer) {
        this.describeAnswer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return Objects.equals(describeQuestion, question1.describeQuestion)
                && Objects.equals(describeAnswer, question1.describeAnswer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(describeQuestion, describeAnswer);
    }

    @Override
    public String  toString() {
        return "Question{" +
                "question='" + describeQuestion + '\'' +
                ", answer='" + describeAnswer + '\'' +
                '}'+"\n";
    }
}
