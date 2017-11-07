package br.com.ftathiago.docman.model;
// Generated 03/11/2017 02:54:03 by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * UsuarioRegrasSistema generated by hbm2java
 */
@Entity
@Table(name = "usuario_regras_sistema")
public class UsuarioRegrasSistema implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsuarioRegrasSistemaId id;
	private RegrasSistema regrasSistema;
	private Usuario usuario;

	public UsuarioRegrasSistema() {
	}

	public UsuarioRegrasSistema(UsuarioRegrasSistemaId id, RegrasSistema regrasSistema, Usuario usuario) {
		this.id = id;
		this.regrasSistema = regrasSistema;
		this.usuario = usuario;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "usuarioPessId", column = @Column(name = "Usuario_PESS_ID", nullable = false)),
			@AttributeOverride(name = "regrasSistemasNome", column = @Column(name = "regrasSistemas_nome", nullable = false)) })
	public UsuarioRegrasSistemaId getId() {
		return this.id;
	}

	public void setId(UsuarioRegrasSistemaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "regrasSistemas_nome", nullable = false, insertable = false, updatable = false)
	public RegrasSistema getRegrasSistema() {
		return this.regrasSistema;
	}

	public void setRegrasSistema(RegrasSistema regrasSistema) {
		this.regrasSistema = regrasSistema;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Usuario_PESS_ID", nullable = false, insertable = false, updatable = false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
