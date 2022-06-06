package practice;

import java.time.LocalDate;

public class Task {

	public LocalDate date;
	public String todo;

	public Task(LocalDate date, String todo) {
		super();
		this.date = date;
		this.todo = todo;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}
}