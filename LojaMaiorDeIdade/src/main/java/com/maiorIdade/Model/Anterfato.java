package com.maiorIdade.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_anterfato")
public class Anterfato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "Insira o nome")
	private String nome;
	
	private Boolean dangerous;
	
	@ManyToOne
	@JsonIgnoreProperties("anterfato")
	private Cliente cliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getDangerous() {
		return dangerous;
	}

	public void setDangerous(Boolean dangerous) {
		this.dangerous = dangerous;
	}

	public Cliente getCentral() {
		return cliente;
	}

	public void setCentral(Cliente central) {
		this.cliente = cliente;
	}


	
}
