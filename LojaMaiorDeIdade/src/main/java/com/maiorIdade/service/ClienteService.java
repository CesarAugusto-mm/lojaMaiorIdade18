package com.maiorIdade.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.maiorIdade.Model.Cliente;
import com.maiorIdade.Repository.AnterfatoRepository;
import com.maiorIdade.Repository.CentralRepository;
import com.maiorIdade.Repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;

	public Cliente save(Cliente cliente) {
		
		
		if(cliente.getIdade() <= 18)
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Voce não possui idade");
		
		if(cliente.getIdade() <= 21)
			cliente.setAutoricao(false);
		
		else
			cliente.setAutoricao(true);
		
		return repository.save(cliente);
	
	}
	
	
}
