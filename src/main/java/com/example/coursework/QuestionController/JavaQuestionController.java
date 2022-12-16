package com.example.coursework.QuestionController;

import com.example.coursework.Question.Question;
import com.example.coursework.QuestionService.JavaQuestionServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exam")
public class JavaQuestionController {
    private final JavaQuestionServiceImpl javaQuestionServiceImpl;

    public JavaQuestionController(JavaQuestionServiceImpl javaQuestionServiceImpl) {
        this.javaQuestionServiceImpl = javaQuestionServiceImpl;
    }

    @GetMapping("/java/add")
    public String addQuestion
            (@RequestParam("Question") String question,
             @RequestParam("Answer") String answer) {
        javaQuestionServiceImpl.add(question, answer);
        return "Был добавлен вопрос " + question + " и ответ " + answer;
    }

    @GetMapping("/java/remove")
    public Question removeQuestion
            (@RequestParam("Question") String question,
             @RequestParam("Answer") String answer) {
        Question tmp = new Question(question, answer);
        return javaQuestionServiceImpl.remove(tmp);
    }

    @GetMapping("/java")
    public List<Question> getAllQuestions() {
        return (List<Question>) this.javaQuestionServiceImpl.getAll();
    }

    @GetMapping("/java/getRandomQuestion")
    public Question getRandomQuestion() {
        return this.javaQuestionServiceImpl.getRandomQuestion();
    }

}
