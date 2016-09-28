package tn.esprit.laboratoire.services;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.laboratoire.persistence.Todo;

@Local
public interface TodoServiceLocal {
	
	void create(Todo todo);
	List<Todo> findAll();

}
