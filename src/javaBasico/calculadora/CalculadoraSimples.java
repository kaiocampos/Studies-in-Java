package javaBasico.calculadora;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> historico = new ArrayList<>();

        while (true){
            System.out.println("Escolha uma operação: +, -, *, /, sqrt, ^ ou 'sair' para terminar");
            String operacao = scanner.nextLine();

            if (operacao.equalsIgnoreCase("sair")){
                break;
            }

            Double primeiroNumero = 0.0, segundoNumero = 0.0;

            if (!operacao.equalsIgnoreCase("sqrt")){
                System.out.println("Entre com o primeiro número: ");
                primeiroNumero = scanner.nextDouble();
            }
            if (!operacao.equalsIgnoreCase("sqrt")){
                System.out.println("Entre com o segundo número: ");
                segundoNumero = scanner.nextDouble();
            }else {
                System.out.println("Digite o número para calcular a raiz quadrada: ");
                primeiroNumero = scanner.nextDouble();
            }

            scanner.nextLine(); //Consumir a nova linha, que sobra ao digitarmos um número.. \n

            double resultado;
            String expressao;

            switch (operacao){
                case "+":
                    resultado = primeiroNumero + segundoNumero;
                    expressao = primeiroNumero + " + " + segundoNumero + " = " + resultado;
                    break;
                case "-":
                    resultado = primeiroNumero - segundoNumero;
                    expressao = primeiroNumero + " - " + segundoNumero + " = " + resultado;
                    break;
                case "*":
                    resultado = primeiroNumero * segundoNumero;
                    expressao = primeiroNumero + " * " + segundoNumero + " = " + resultado;
                    break;
                case "/":
                    if (segundoNumero != 0){
                        resultado = primeiroNumero / segundoNumero;
                        expressao = primeiroNumero + " / " + segundoNumero + " = " + resultado;
                    }else {
                        System.out.println("Erro: Divisão por zero!");
                        continue;
                    }
                    break;
                case "^":
                    resultado = Math.pow(primeiroNumero, segundoNumero);
                    expressao = primeiroNumero + " ^ " + segundoNumero + " = " + resultado;
                    break;
                case "sqrt":
                    resultado = Math.sqrt(primeiroNumero);
                    expressao = "sqrt (" + primeiroNumero + ") = " + resultado;
                    break;
                default:
                    System.out.println("Operação inválida!");
                    continue;
            }
            System.out.println("O resultado é : "+ resultado);
            historico.add(expressao);

            System.out.println("Histórico de operações: ");
            if (historico.size() > 0){
                for (String conta : historico){
                    System.out.println(conta);
                }
            }else {
                System.out.println("O histórico está vazio.");
            }

        }
        scanner.close();
    }
}
