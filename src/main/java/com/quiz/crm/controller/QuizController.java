package com.quiz.crm.controller;

import java.util.List;
import java.util.Collections;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.crm.model.Question;
import com.quiz.crm.repository.QuizRepository;

//API Controller
@RestController
@RequestMapping("/quiz")
public class QuizController {
	private QuizRepository repository;
	
	QuizController(QuizRepository quizRepository){
		this.repository = quizRepository;
	}
	
	//Method GET from API
	@GetMapping
	public List<Question> getQuestions() {
		List<Question> list = repository.findAll();
		int i=0;
		for(Question item : list) {
			item.shuffleAnswers();
			if(i==0) {
				item.setCorrect(" O set é um 'array' que não aceita valores repetidos, enquanto o map é uma coleção de pares: chave-valor.");
			}else if(i==1) {
				item.setCorrect(" Closure é quando uma função é capaz de 'lembrar' e acessar seu escopo léxico mesmo quando ela está sendo executada fora de seu escopo léxico.");
			}else if(i==2) {
				item.setCorrect(" Pseudo-classes são utilizadas para selecionar elementos que não podem ser expressados de outra forma a não ser usando atributos como: id's, classes, etc. Já o Pseudo-elementos são elementos 'imaginários' no qual podemos aplicar estilos relativamente como parte de outros elementos reais, porém estes elementos imaginários não fazem parte do DOM.");
			}else if(i==3) {
				item.setCorrect(" &lt;table&gt;, &lt;thead&gt;, &lt;tbody&gt, &lt;tfoot&gt;, &lt;tr&gt;, &lt;th&gt;, &lt;td&gt;, &lt;caption&gt;, &lt;colgroup&gt; e &lt;col&gt;");
			}else if(i==4) {
				item.setCorrect(" Ambos auxilia no alinhamento de grid. Porem o CSS Grid é multidimensional, ou seja, linhas E colunas. E o Flexbox é unidimensional, ou seja, linha OU coluna.");
			}
			i++;
		}
		Collections.shuffle(list);
		return list;
	}
}
