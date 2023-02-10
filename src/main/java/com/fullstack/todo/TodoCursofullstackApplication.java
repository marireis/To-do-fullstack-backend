package com.fullstack.todo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.annotation.DateTimeFormat;

import com.fullstack.todo.domain.Todo;
import com.fullstack.todo.repository.TodoRepository;

@SpringBootApplication
public class TodoCursofullstackApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TodoCursofullstackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
