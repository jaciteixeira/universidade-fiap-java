package br.com.fiap.universidade.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.Valid;

@Entity
@Table(name = "discentes")
public class Discente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String rm;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_pessoa")
	@Valid
	private Pessoa pessoa;
	@Enumerated(EnumType.STRING)
	private OpcoesStatus status;
	@Enumerated(EnumType.STRING)
	private OpcoesNivel nivel;

	public class DiscenteBuilder {

		private Long id;
		private String rm;
		private Pessoa pessoa;
		private OpcoesStatus status;
		private OpcoesNivel nivel;

		public DiscenteBuilder setId(Long id) {
			this.id = id;
			return this;
		}

		public DiscenteBuilder setIdPessoa(Long id_pessoa) {
			this.pessoa.setId(id_pessoa);
			return this;

		}

		public DiscenteBuilder setRm(String rm) {
			this.rm = rm;
			return this;
		}

		public DiscenteBuilder setPessoa(Pessoa pessoa) {
			this.pessoa = pessoa;
			return this;
		}

		public DiscenteBuilder setStatus(OpcoesStatus status) {
			this.status = status;
			return this;
		}

		public DiscenteBuilder setNivel(OpcoesNivel nivel) {
			this.nivel = nivel;
			return this;
		}

		public Discente build() {
			return new Discente(this);
		}

	}

	public Discente(DiscenteBuilder db) {
		this.id = db.id;
		this.rm = db.rm;
		this.status = db.status;
		this.pessoa = db.pessoa;
		this.nivel = db.nivel;
	}

	public DiscenteBuilder toBuilder() {
		return new DiscenteBuilder().setId(this.id).setNivel(this.nivel).setPessoa(this.pessoa).setStatus(this.status)
				.setRm(this.rm);
	}

	public Discente() {

	}

	public Discente(Long id, String rm, Pessoa pessoa, OpcoesStatus status, OpcoesNivel nivel) {
		super();
		this.id = id;
		this.rm = rm;
		this.pessoa = pessoa;
		this.status = status;
		this.nivel = nivel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public OpcoesStatus getStatus() {
		return status;
	}

	public void setStatus(OpcoesStatus status) {
		this.status = status;
	}

	public OpcoesNivel getNivel() {
		return nivel;
	}

	public void setNivel(OpcoesNivel nivel) {
		this.nivel = nivel;
	}

}
