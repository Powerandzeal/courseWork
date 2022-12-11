package com.example.coursework.QuestionController;

import com.example.coursework.Question.Question;
import com.example.coursework.QuestionService.JavaQuestionServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class JavaQuestionController {
    private final JavaQuestionServiceImpl javaQuestionServiceImpl;

    public JavaQuestionController(JavaQuestionServiceImpl javaQuestionServiceImpl) {
        this.javaQuestionServiceImpl = javaQuestionServiceImpl;
    }

    @GetMapping("/exam")
    public String greeting() {
        return "Привет студент, удачи на экзамене";
    }

    @GetMapping("/exam/java/add")
    public String addQuestion
            (@RequestParam("Question") String question,
             @RequestParam("Answer") String answer) {
        javaQuestionServiceImpl.QuestionAdd(question,answer);
        return "Был добавлен вопрос " +question+" и ответ " + answer;
    }

    @GetMapping("/exam/java/remove")
    public String removeQuestion
            (@RequestParam("Question") String question,
             @RequestParam("Answer") String answer) {
        javaQuestionServiceImpl.QuestionRemove(question,answer);
        return "Удален вопрос " +question+" и ответ " + answer;
    }

    @GetMapping("/exam/java/")
    public List<Question> getAllQuestions() {
        return this.javaQuestionServiceImpl.getAll();
    }

    @GetMapping("/exam/java/createList")
    public List<Question> createListOfQuestions() {
        return this.javaQuestionServiceImpl.listOfQuestions();
    }
    @GetMapping("/exam/java/getRandomQuestion")
    public String getRandomQuestion() {
        return this.javaQuestionServiceImpl.getRandomQuestion();
    }


}
