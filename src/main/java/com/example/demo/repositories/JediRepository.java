package com.example.demo.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Jedi;

@Repository
public class JediRepository {
	
	private List<Jedi> jedi;
	
	public JediRepository() {
		jedi = new ArrayList<>();
		jedi.add(new Jedi("Luke", "SkyWalker"));
	}

	public List<Jedi> getAllJedi(){
		return this.jedi;
	}
	
	public void add (final Jedi jedi) {
		this.jedi.add(jedi);
	}
}
