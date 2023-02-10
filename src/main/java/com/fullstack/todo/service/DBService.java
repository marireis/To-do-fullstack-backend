package com.fullstack.todo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.todo.domain.Todo;
import com.fullstack.todo.repository.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Estudar", "Estudar spring boot 2 e angular 11",sdf.parse("25/03/2022"), false);
		Todo t2 = new Todo(null, "Comprar material", "material de papelaria",sdf.parse("01/03/2022"), false);
		Todo t3 = new Todo(null, "Maquiagem", "comprar para o carnaval",sdf.parse("15/03/2022"), true);
		Todo t4 = new Todo(null, "tinta para obra", "obra de casa",	sdf.parse("10/03/2022"), true);

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));

	}

}
