package com.mycompany.calculadoraprojeto;

import java.util.Scanner;

public class CalculadoraProjeto {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int opc;

        do {
            showMenu();
            while (true) {
                System.out.print("Opção-> ");

                while (!scanner.hasNextInt()) {
                    scanner.nextLine(); // Consumir entrada incorreta
                    System.out.println("Digite uma opção Inválida!");
                    System.out.print("Opção-> ");
                }
                opc = scanner.nextInt();
                scanner.nextLine();
                if (opc >= 0 && opc <= 4) {
                    float float1;
                    float float2;
                    switch (opc) {
                        case 1 -> {
                            float1 = getFloat(scanner, "Num1:");
                            float2 = getFloat(scanner, "Num2:");
                            System.out.println("Resultado: " + somar(float1, float2));
                            pause(scanner);
                        }
                        case 2 -> {
                            float1 = getFloat(scanner, "Num1:");
                            float2 = getFloat(scanner, "Num2:");
                            System.out.println("Resultado: " + subtarir(float1, float2));
                            pause(scanner);
                        }
                        case 3 -> {
                            float1 = getFloat(scanner, "Num1:");
                            float2 = getFloat(scanner, "Num2:");
                            System.out.println("Resultado: " + multiplicar(float1, float2));
                            pause(scanner);
                        }
                        case 4 -> {
                            float1 = getFloat(scanner, "Num1:");
                            float2 = getFloat(scanner, "Num2:");
                            System.out.println("Resultado: " + dividir(float1, float2));
                            pause(scanner);
                        }
                        case 0 -> {
                        }
                        default -> System.out.println("Digite uma opção válida");
                    }
                    break;
                } else {
                    System.out.println("Digite uma opção válida");
                }
            }

        } while (opc != 0);

        scanner.close();
    }

     public static float somar(float num1, float num2){
        return num1/num2;
    }

    public static float multiplicar(float num1, float num2){
        return num1*num2;
    }

    public static float subtarir(float num1, float num2){
        return num1-num2;
    }

    public static float dividir(float num1, float num2){
        return num1/num2;
    }

    private static void showMenu(){
        System.out.println("------------------");
        System.out.println("   Calculadora");
        System.out.println("------------------");
        System.out.println("[1] Somar");
        System.out.println("[2] Subtrair");
        System.out.println("[3] Multiplicar");
        System.out.println("[4] Dividir");
        System.out.println("[0] Sair");
        System.out.println("------------------");

    }

    public static float getFloat(Scanner scanner, String pergunta) {
        float num;
        System.out.print(pergunta + " ");
        while (!scanner.hasNextFloat()) {
            scanner.nextLine();
            System.out.println("Número Inválido!");
            System.out.print(pergunta + " ");
        }
        num = scanner.nextFloat();
        scanner.nextLine();
        return num;
    }

    public static void pause(Scanner scanner) {
        System.out.println("      [ Enter para avançar ]");
        scanner.nextLine();
    }
}