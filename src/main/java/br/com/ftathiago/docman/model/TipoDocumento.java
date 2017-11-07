package br.com.ftathiago.docman.model;
// Generated 03/11/2017 02:54:03 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TipoDocumento generated by hbm2java
 */
@Entity
@Table(name = "tipo_documento")
public class TipoDocumento implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer tdocId;
	private byte tdocAtivo;
	private String tdocDescricao;
	private Set<Documento> documentos = new HashSet<Documento>(0);

	public TipoDocumento() {
	}

	public TipoDocumento(byte tdocAtivo, String tdocDescricao) {
		this.tdocAtivo = tdocAtivo;
		this.tdocDescricao = tdocDescricao;
	}

	public TipoDocumento(byte tdocAtivo, String tdocDescricao, Set<Documento> documentos) {
		this.tdocAtivo = tdocAtivo;
		this.tdocDescricao = tdocDescricao;
		this.documentos = documentos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "TDOC_ID", unique = true, nullable = false)
	public Integer getTdocId() {
		return this.tdocId;
	}

	public void setTdocId(Integer tdocId) {
		this.tdocId = tdocId;
	}

	@Column(name = "TDOC_ATIVO", nullable = false)
	public byte getTdocAtivo() {
		return this.tdocAtivo;
	}

	public void setTdocAtivo(byte tdocAtivo) {
		this.tdocAtivo = tdocAtivo;
	}

	@Column(name = "TDOC_DESCRICAO", nullable = false, length = 45)
	public String getTdocDescricao() {
		return this.tdocDescricao;
	}

	public void setTdocDescricao(String tdocDescricao) {
		this.tdocDescricao = tdocDescricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoDocumento")
	public Set<Documento> getDocumentos() {
		return this.documentos;
	}

	public void setDocumentos(Set<Documento> documentos) {
		this.documentos = documentos;
	}

}