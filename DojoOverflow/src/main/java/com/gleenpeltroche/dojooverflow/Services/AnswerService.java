package com.gleenpeltroche.dojooverflow.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gleenpeltroche.dojooverflow.models.Answer;
import com.gleenpeltroche.dojooverflow.repositories.AnswerRepository;


@Service
public class AnswerService {
	@Autowired
	AnswerRepository answerRepository;
	public Answer saveAnswer(Answer answer) {
		return answerRepository.save(answer);
	}
}
