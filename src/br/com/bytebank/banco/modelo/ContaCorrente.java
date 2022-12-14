package br.com.bytebank.banco.modelo;

import java.io.Serializable;

import br.com.bytebank.banco.testes.Tributavel;

public class ContaCorrente extends Conta implements Tributavel, Serializable {

	
	public ContaCorrente(int agencia, int numero) {
			super(agencia, numero);	
	}
	
	@Override
	public void saque(double valor) {
		double valorSaque = valor + 0.2;
		super.saque(valorSaque);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente, " + super.toString();
	}
	
}
 