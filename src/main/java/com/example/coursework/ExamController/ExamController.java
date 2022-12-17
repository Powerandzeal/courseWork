package com.example.coursework.ExamController;

import com.example.coursework.ExaminerQuestion.ExaminerServiceImpl;
import com.example.coursework.Exceptions.QuestionException;
import com.example.coursework.Question.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping
public class ExamController {

    private ExaminerServiceImpl examinerService;

    public ExamController(ExaminerServiceImpl examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/exam/get/{amount}")
    public Collection<Question> getQuestions(@PathVariable("amount") int amount) throws QuestionException {
        return examinerService.getQuestions(amount);
    }
}
