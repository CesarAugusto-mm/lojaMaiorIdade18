package com.maiorIdade.Model;

import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
	
	@Entity
	@Table(name = "tb_central")
	public class CentralM {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		@NotBlank(message = "Insira o endereco")
		private String endereco;
		
		@NotBlank( message = "Insira o nome")
		private String nome;
		
		private Date anoInauguracao; 
		
		@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy = "central")
		@JsonIgnoreProperties("central")
		private List<Cliente> cliente;

		public List<Cliente> getAnterfato() {
			return cliente;
		}

		public void setAnterfato(List<Cliente> cliente) {
			this.cliente = cliente;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Date getAnoInauguracao() {
			return anoInauguracao;
		}

		public void setAnoInauguracao(Date anoInauguracao) {
			this.anoInauguracao = anoInauguracao;
		}
				
}
