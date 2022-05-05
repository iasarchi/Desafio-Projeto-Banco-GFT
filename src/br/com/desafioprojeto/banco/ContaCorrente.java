package br.com.desafioprojeto.banco;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Conta Corrente===");
        super.imprimirDadosDaConta();
    }

}
