package com.maiorIdade.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.maiorIdade.Model.Anterfato;
import com.maiorIdade.Repository.AnterfatoRepository;

@RequestMapping("/anterfato")
@RestController
public class AnterfatoController {
	
	@Autowired
	private AnterfatoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Anterfato>> get() {
		return ResponseEntity.ok(repository.findAll());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Anterfato> getById(@PathVariable int id) {
		Optional<Anterfato> anterfatoExist = repository.findById(id);
		
		if (anterfatoExist.isEmpty())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		return ResponseEntity.ok(anterfatoExist.get());
	}
	
	@PostMapping	 
	public ResponseEntity<Anterfato> post(@RequestBody Anterfato anterfato) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(anterfato));
	}
	
	@PutMapping
	public ResponseEntity<Anterfato> put(@RequestBody Anterfato anterfato) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(anterfato));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> anterfato(@PathVariable int id) {
		repository.deleteById(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
	
}
