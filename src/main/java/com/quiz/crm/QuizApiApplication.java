package com.quiz.crm;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.quiz.crm.model.Question;
import com.quiz.crm.repository.QuizRepository;

import java.util.Random;

@SpringBootApplication
public class QuizApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizApiApplication.class, args);
	}
	
	//Populating the database in memory with the quiz questions and answers
    @Bean
    CommandLineRunner init(QuizRepository repository) {
        return args -> {
            repository.deleteAll();
            
            String[] answers = new String[4];
            
            //Question 01
            Question q1 = new Question();
            
            answers[0] = " O set é um 'array' que não aceita valores repetidos, enquanto o map é uma coleção de pares: chave-valor.";
            answers[1] = " O set é um método que permite executar uma função em cada item de um array, enquanto o map é um metodo que percorre um array e retorna seu maior elemento.";
            answers[2] = " O set é uma estrutura de dados que não permite a exclusão de valores, enquanto o map é uma estrutura de dados que não permite a inserção de novos valores";
            answers[3] = " O set é um método que cria uma caixa de diálogo na tela, enquanto o map é um método que permite o envio de dados para a console de depuração do navegador.";                  
            
            q1.setQuestion("Em javascript, qual a diferença entre Set e Map?");     
            q1.setAnswers(answers);
            
            repository.save(q1);
            
            //Question 02
            Question q2 = new Question();
            
            answers[0] = " Closure é uma função que recebe um objeto como argumento e cria uma copia do mesmo.";
            answers[1] = " Closure é uma função que não recebe argumentos.";
            answers[2] = " Closure é quando uma função é capaz de 'lembrar' e acessar seu escopo léxico mesmo quando ela está sendo executada fora de seu escopo léxico.";
            answers[3] = " Closure é uma função que recebe um objeto como argumento e retorna a quantidade de propriedades que o mesmo possuí.";
                      
            q2.setQuestion("O que é closure em javascript?");     
            q2.setAnswers(answers);

            repository.save(q2);
            
            //Question 03
            Question q3 = new Question();
            
            answers[0] = " Pseudo-classes são classes definidas no CSS que não estão sendo utilizadas. Já o Pseudo-elementos são elementos que não altera seu estilo.";
            answers[1] = " Pseudo-classes são utilizadas para selecionar elementos que não podem ser expressados de outra forma a não ser usando atributos como: id's, classes, etc. Já o Pseudo-elementos são elementos 'imaginários' no qual podemos aplicar estilos relativamente como parte de outros elementos reais, porém estes elementos imaginários não fazem parte do DOM.";
            answers[2] = " Pseudo-classes são classes que são implementadas dentro da tag HTML &lt;style&gt;. Já o Pseudo-elementos são todos os elementos unicos que fazem parte do DOM.";
            answers[3] = " Pseudo-classes são usadas para selecionar tags HTML dentro do CSS. Já o Pseudo-elementos são os elementos que são utilizados para mostrar outros elementos.";
                      
            q3.setQuestion("No CSS, qual a diferença entre pseudo-classes e pseudo-elementos?");                   
            q3.setAnswers(answers);
            
            repository.save(q3);
            
            //Question 04
            Question q4 = new Question();
            
            answers[0] = " &lt;table&gt;, &lt;thead&gt;, &lt;tbody&gt, &lt;tfoot&gt;, &lt;tr&gt;, &lt;th&gt;, &lt;td&gt;, &lt;caption&gt;, &lt;colgroup&gt; e &lt;col&gt;";
            answers[1] = " &lt;table&gt;, &lt;headd&gt;, &lt;spand&gt;, &lt;meta&gt;, &lt;tr&gt;, &lt;th&gt;, &lt;td&gt; e &lt;body&gt;";
            answers[2] = " &lt;xmp&gt;, &lt;head&gt;, &lt;meta&gt;, &lt;link&gt;, &lt;a&gt;, &lt;title&gt;, &lt;th&gt; e &lt;td&gt;";
            answers[3] = " &lt;table&gt;, &lt;body&gt;, &lt;tbody&gt;, &lt;tfoot&gt;, &lt;foot&gt;, &lt;col&gt; e &lt;row&gt;";
                      
            q4.setQuestion("Quais tags HTML são usadas para exibir os dados na forma tabular?");                   
            q4.setAnswers(answers);
            
            repository.save(q4);
            
            //Question 05
            Question q5 = new Question();
            
            answers[0] = " Ambos auxilia no alinhamento de grid. Porem o CSS Grid é unidimensional, ou seja, linhas E colunas. E o Flexbox é multidimensional, ou seja, linha OU coluna.";
            answers[1] = " Ambos são utilizados para posicionar um elemento na tela. Porém o CSS Grid usa uma posição estática em relação a outro elemento e o Flexbox usa uma posição relativa.";
            answers[2] = " Ambos são utilizados para estilizar barras de navegação. Porém o CSS Grid estiliza barras verticais e o Flexbox barras horizontais.";
            answers[3] = " Ambos auxilia no alinhamento de grid. Porem o CSS Grid é multidimensional, ou seja, linhas E colunas. E o Flexbox é unidimensional, ou seja, linha OU coluna.";
                      
            q5.setQuestion("Qual a principal diferença entre CSS Grid e Flexbox?");                   
            q5.setAnswers(answers);
            
            repository.save(q5);
           
        };
               
    }
}
