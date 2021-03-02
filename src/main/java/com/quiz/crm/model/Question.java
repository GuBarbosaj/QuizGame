package com.quiz.crm.model;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String question;
	@Column(length=5000)
	private String [] answers = new String[4];
	private int correct = -1;
	
	//Question scrambling method of answers
	public void shuffleAnswers() {
		Random random = new Random();

		for (int i=0; i < (answers.length - 1); i++) {
			int j = random.nextInt(answers.length);
			String temp = answers[i];
			answers[i] = answers[j];
			answers[j] = temp;
		}
	}
	
	//Getters and Setters
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String[] getAnswers() {
		return answers;
	}
	public void setAnswers(String[] answers) {
		this.answers = answers;
	}
	public int getCorrect() {
		return correct;
	}
	//Set correct answer
	public void setCorrect(String answerCorrect) {
		for (int i=0; i < answers.length; i++) {
			if(answers[i].equals(answerCorrect)) {
				this.correct = i;
				break;
			}
		}
	}
	
}
