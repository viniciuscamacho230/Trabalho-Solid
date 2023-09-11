package br.edu.umfg.conta;

import br.edu.umfg.TelaInicial;

import java.io.IOException;

public class ContaCorrente extends Conta{
    public ContaCorrente(String nome, long cpf, int codigoDaAgencia, int senha, Double valorDeDinheiroEmConta, int numeroDaConta) {
        super(nome, cpf, codigoDaAgencia, senha, valorDeDinheiroEmConta, numeroDaConta);
    }

    @Override
    public void sacar(Double valorSacado) throws IOException {
        if (valorSacado <= 0){
            throw new IllegalArgumentException("|              Valor de saque invalido                    |");

        } else if (valorSacado > getValorDeDinheiroEmConta()) {
            throw new IllegalArgumentException("|             Valor nao disponivel em conta               |");
        } else {
            System.out.println("|                        Sacando                          |");
            setValorDeDinheiroEmConta(getValorDeDinheiroEmConta() - valorSacado);
            TelaInicial.menuDeOpcoes();
        }
    }
}
