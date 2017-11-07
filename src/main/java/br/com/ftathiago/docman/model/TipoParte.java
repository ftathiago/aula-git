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
 * TipoParte generated by hbm2java
 */
@Entity
@Table(name = "tipo_parte")
public class TipoParte implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer tpprId;
	private String tpprDescricaol;
	private Set<ProcParte> procPartes = new HashSet<ProcParte>(0);

	public TipoParte() {
	}

	public TipoParte(String tpprDescricaol) {
		this.tpprDescricaol = tpprDescricaol;
	}

	public TipoParte(String tpprDescricaol, Set<ProcParte> procPartes) {
		this.tpprDescricaol = tpprDescricaol;
		this.procPartes = procPartes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "TPPR_ID", unique = true, nullable = false)
	public Integer getTpprId() {
		return this.tpprId;
	}

	public void setTpprId(Integer tpprId) {
		this.tpprId = tpprId;
	}

	@Column(name = "TPPR_DESCRICAOl", nullable = false, length = 45)
	public String getTpprDescricaol() {
		return this.tpprDescricaol;
	}

	public void setTpprDescricaol(String tpprDescricaol) {
		this.tpprDescricaol = tpprDescricaol;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoParte")
	public Set<ProcParte> getProcPartes() {
		return this.procPartes;
	}

	public void setProcPartes(Set<ProcParte> procPartes) {
		this.procPartes = procPartes;
	}

}
