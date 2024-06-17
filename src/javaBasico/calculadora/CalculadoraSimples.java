package javaBasico.calculadora;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Escolha uma operação: +, -, *, / ou 'sair' para terminar");
            String operacao = scanner.nextLine();

            if (operacao.equalsIgnoreCase("sair")){
                break;
            }

            System.out.println("Entre com o primeiro número: ");
            Double primeiroNumero = scanner.nextDouble();

            System.out.println("Entre com o segundo número: ");
            Double segundoNumero = scanner.nextDouble();

            scanner.nextLine(); //Consumir a nova linha, que sobra ao digitarmos um número.. \n

            double resultado;

            switch (operacao){
                case "+":
                    resultado = primeiroNumero + segundoNumero;
                    break;
                case "-":
                    resultado = primeiroNumero - segundoNumero;
                    break;
                case "*":
                    resultado = primeiroNumero * segundoNumero;
                    break;
                case "/":
                    if (segundoNumero != 0){
                        resultado = primeiroNumero / segundoNumero;
                    }else {
                        System.out.println("Erro: Divisão por zero!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Operação inválida!");
                    continue;
            }
            System.out.println("O resultado é : "+ resultado);

        }
    }
}
