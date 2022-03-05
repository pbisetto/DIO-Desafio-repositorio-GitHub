package com.dio;

/* Classe principal que executa as outras classe dos exercícios */

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println();
        System.out.println("Exercício calculadora");
        System.out.println();
        CalculadoraSimples.soma(6, 8);
        CalculadoraSimples.subtracao(10, 6.5);
        CalculadoraSimples.multiplicacao(7, 15);
        CalculadoraSimples.divisao(5, 2.5);

        // Mensagem
        System.out.println();
        System.out.println("Exercício mensagem hora");
        System.out.println();
        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(23);

        // Empréstimo
        System.out.println();
        System.out.println("Exercício empréstimo");
        System.out.println();
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(10000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(5000, 5);

    }

}
//fim//