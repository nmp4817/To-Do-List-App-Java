package com.models;

import java.util.ArrayList;
import java.util.List;

public class ToDoServices {
	private static List<ToDo> todos = new ArrayList<ToDo>();
	static {
		todos.add(new ToDo("Learn Web App"));
		todos.add(new ToDo("Learn Spring MVC"));
	}
	
	public List<ToDo> getToDos() {
		return todos;
	}
	
}
