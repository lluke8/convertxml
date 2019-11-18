package com.example.demo;

import models.Question;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		File file = new File("question.xml");

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Question.class);
			Unmarshaller jaxbUnmarsheller = jaxbContext.createUnmarshaller();
			Question question = (Question) jaxbUnmarsheller.unmarshal(file);

			//System.out.println(question.getAnswers().get(0).getPostedBy());
			System.out.println(question);


		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
