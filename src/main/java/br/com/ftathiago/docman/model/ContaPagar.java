package br.com.ftathiago.docman.model;
// Generated 03/11/2017 02:54:03 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ContaPagar generated by hbm2java
 */
@Entity
@Table(name = "conta_pagar")
public class ContaPagar implements java.io.Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int cpagId;
	private ContaMovimento contaMovimento;
	private ModoPagamento modoPagamento;
	private Pessoa pessoa;
	private String cpagDescricao;
	private Date cpagCriacao;
	private Date cpagVencimento;
	private Date cpagPagamento;
	private Double cpagValor;
	private Double cpagValorPago;

	public ContaPagar() {
	}

	public ContaPagar(int cpagId) {
		this.cpagId = cpagId;
	}

	public ContaPagar(int cpagId, ContaMovimento contaMovimento, ModoPagamento modoPagamento, Pessoa pessoa,
			String cpagDescricao, Date cpagCriacao, Date cpagVencimento, Date cpagPagamento, Double cpagValor,
			Double cpagValorPago) {
		this.cpagId = cpagId;
		this.contaMovimento = contaMovimento;
		this.modoPagamento = modoPagamento;
		this.pessoa = pessoa;
		this.cpagDescricao = cpagDescricao;
		this.cpagCriacao = cpagCriacao;
		this.cpagVencimento = cpagVencimento;
		this.cpagPagamento = cpagPagamento;
		this.cpagValor = cpagValor;
		this.cpagValorPago = cpagValorPago;
	}

	@Id

	@Column(name = "CPAG_ID", unique = true, nullable = false)
	public int getCpagId() {
		return this.cpagId;
	}

	public void setCpagId(int cpagId) {
		this.cpagId = cpagId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CMOV_ID")
	public ContaMovimento getContaMovimento() {
		return this.contaMovimento;
	}

	public void setContaMovimento(ContaMovimento contaMovimento) {
		this.contaMovimento = contaMovimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MPGT_ID")
	public ModoPagamento getModoPagamento() {
		return this.modoPagamento;
	}

	public void setModoPagamento(ModoPagamento modoPagamento) {
		this.modoPagamento = modoPagamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PESS_ID_CREDOR")
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Column(name = "CPAG_DESCRICAO", length = 250)
	public String getCpagDescricao() {
		return this.cpagDescricao;
	}

	public void setCpagDescricao(String cpagDescricao) {
		this.cpagDescricao = cpagDescricao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CPAG_CRIACAO", length = 10)
	public Date getCpagCriacao() {
		return this.cpagCriacao;
	}

	public void setCpagCriacao(Date cpagCriacao) {
		this.cpagCriacao = cpagCriacao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CPAG_VENCIMENTO", length = 10)
	public Date getCpagVencimento() {
		return this.cpagVencimento;
	}

	public void setCpagVencimento(Date cpagVencimento) {
		this.cpagVencimento = cpagVencimento;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CPAG_PAGAMENTO", length = 10)
	public Date getCpagPagamento() {
		return this.cpagPagamento;
	}

	public void setCpagPagamento(Date cpagPagamento) {
		this.cpagPagamento = cpagPagamento;
	}

	@Column(name = "CPAG_VALOR", precision = 22, scale = 0)
	public Double getCpagValor() {
		return this.cpagValor;
	}

	public void setCpagValor(Double cpagValor) {
		this.cpagValor = cpagValor;
	}

	@Column(name = "CPAG_VALOR_PAGO", precision = 22, scale = 0)
	public Double getCpagValorPago() {
		return this.cpagValorPago;
	}

	public void setCpagValorPago(Double cpagValorPago) {
		this.cpagValorPago = cpagValorPago;
	}

}
