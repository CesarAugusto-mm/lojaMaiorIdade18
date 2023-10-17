package com.maiorIdade.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_clinte")
public class Cliente {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = " Insira o nome")
	private String nome;
	
	@Min(value = 18)
	@Max(value = 55)
	private Integer idade;
	
	private boolean autoricao;
	
	private Boolean antecedentes;
	
	@ManyToOne
	@JsonIgnoreProperties("central")
	private CentralM centralM;

	
	
	public boolean isAutoricao() {
		return autoricao;
	}

	public void setAutoricao(boolean autoricao) {
		this.autoricao = autoricao;
	}

	public CentralM getCentralM() {
		return centralM;
	}

	public void setCentralM(CentralM centralM) {
		this.centralM = centralM;
	}

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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Boolean getAntecedentes() {
		return antecedentes;
	}

	public void setAntecedentes(Boolean antecedentes) {
		this.antecedentes = antecedentes;
	}
	
	
	

}
