package br.com.ftathiago.docman.model;
// Generated 03/11/2017 02:54:03 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ContaMovimento generated by hbm2java
 */
@Entity
@Table(name = "conta_movimento")
public class ContaMovimento implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cmovDescricao == null) ? 0 : cmovDescricao.hashCode());
		result = prime * result + cmovId;
		result = prime * result + ((contaPagars == null) ? 0 : contaPagars.hashCode());
		result = prime * result + ((contaRecebers == null) ? 0 : contaRecebers.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaMovimento other = (ContaMovimento) obj;
		if (cmovDescricao == null) {
			if (other.cmovDescricao != null)
				return false;
		} else if (!cmovDescricao.equals(other.cmovDescricao))
			return false;
		if (cmovId != other.cmovId)
			return false;
		if (contaPagars == null) {
			if (other.contaPagars != null)
				return false;
		} else if (!contaPagars.equals(other.contaPagars))
			return false;
		if (contaRecebers == null) {
			if (other.contaRecebers != null)
				return false;
		} else if (!contaRecebers.equals(other.contaRecebers))
			return false;
		return true;
	}

	private int cmovId;
	private String cmovDescricao;
	private Set<ContaPagar> contaPagars = new HashSet<ContaPagar>(0);
	private Set<ContaReceber> contaRecebers = new HashSet<ContaReceber>(0);

	public ContaMovimento() {
	}

	public ContaMovimento(int cmovId) {
		this.cmovId = cmovId;
	}

	public ContaMovimento(int cmovId, String cmovDescricao, Set<ContaPagar> contaPagars,
			Set<ContaReceber> contaRecebers) {
		this.cmovId = cmovId;
		this.cmovDescricao = cmovDescricao;
		this.contaPagars = contaPagars;
		this.contaRecebers = contaRecebers;
	}

	@Id

	@Column(name = "CMOV_ID", unique = true, nullable = false)
	public int getCmovId() {
		return this.cmovId;
	}

	public void setCmovId(int cmovId) {
		this.cmovId = cmovId;
	}

	@Column(name = "CMOV_DESCRICAO", length = 45)
	public String getCmovDescricao() {
		return this.cmovDescricao;
	}

	public void setCmovDescricao(String cmovDescricao) {
		this.cmovDescricao = cmovDescricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contaMovimento")
	public Set<ContaPagar> getContaPagars() {
		return this.contaPagars;
	}

	public void setContaPagars(Set<ContaPagar> contaPagars) {
		this.contaPagars = contaPagars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contaMovimento")
	public Set<ContaReceber> getContaRecebers() {
		return this.contaRecebers;
	}

	public void setContaRecebers(Set<ContaReceber> contaRecebers) {
		this.contaRecebers = contaRecebers;
	}

}
