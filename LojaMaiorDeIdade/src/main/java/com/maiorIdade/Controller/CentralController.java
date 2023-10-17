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
import com.maiorIdade.Model.CentralM;
import com.maiorIdade.Repository.CentralRepository;

@RestController
@RequestMapping("/central")
public class CentralController {
	
	@Autowired
	private CentralRepository repository;
	
	@GetMapping
	public ResponseEntity<List<CentralM>> get() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CentralM> getById(@PathVariable int id) {
		Optional<CentralM> centralExist = repository.findById(id);
		
		if (centralExist.isEmpty())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		
		return ResponseEntity.ok(centralExist.get());
		
	}
		@PostMapping
		public ResponseEntity<CentralM> post(@RequestBody CentralM central) {
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(central));
		}
		
		@PutMapping
		public ResponseEntity<CentralM> put(@RequestBody CentralM central) {
			return ResponseEntity.status(HttpStatus.OK).body(repository.save(central));
			
		}
		
		@DeleteMapping("/{id}")
		public ResponseEntity<?> delete(@PathVariable int id) {
			repository.deleteById(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		
		
	}


