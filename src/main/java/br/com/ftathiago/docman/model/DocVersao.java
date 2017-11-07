package br.com.ftathiago.docman.model;
// Generated 03/11/2017 02:54:03 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DocVersao generated by hbm2java
 */
@Entity
@Table(name = "doc_versao")
public class DocVersao implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer dverId;
	private Documento documento;
	private Pessoa pessoa;
	private String dverComentarios;
	private Date dverDataHora;

	public DocVersao() {
	}

	public DocVersao(Documento documento, Pessoa pessoa, Date dverDataHora) {
		this.documento = documento;
		this.pessoa = pessoa;
		this.dverDataHora = dverDataHora;
	}

	public DocVersao(Documento documento, Pessoa pessoa, String dverComentarios, Date dverDataHora) {
		this.documento = documento;
		this.pessoa = pessoa;
		this.dverComentarios = dverComentarios;
		this.dverDataHora = dverDataHora;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "DVER_ID", unique = true, nullable = false)
	public Integer getDverId() {
		return this.dverId;
	}

	public void setDverId(Integer dverId) {
		this.dverId = dverId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DCMT_ID", nullable = false)
	public Documento getDocumento() {
		return this.documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PESS_ID_ENVIOU", nullable = false)
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Column(name = "DVER_COMENTARIOS", length = 3000)
	public String getDverComentarios() {
		return this.dverComentarios;
	}

	public void setDverComentarios(String dverComentarios) {
		this.dverComentarios = dverComentarios;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DVER_DATA_HORA", nullable = false, length = 19)
	public Date getDverDataHora() {
		return this.dverDataHora;
	}

	public void setDverDataHora(Date dverDataHora) {
		this.dverDataHora = dverDataHora;
	}

}
