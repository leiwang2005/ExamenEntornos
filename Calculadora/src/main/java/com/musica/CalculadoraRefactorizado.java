package com.musica;

import java.util.Scanner;

/**
 * @author lei wang
 * clase nueva de calculadora porque el otro estaba
 * todo junto y era una tortura entenderlo, aqui hemos hecho
 * programacion modular, segmentando el codigo en metodos y tambien
 * en vez del if, else-if, else hemos puesto un switch para cada operacion
 */
public class CalculadoraRefactorizado {
    private int a, b;

    /**
     * iniciamos los atributos a y b con un constructor con dichos atributos
     * @param a
     * @param b
     */
    public CalculadoraRefactorizado(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sumar() {
        return a + b;
    }

    public int restar() {
        return a - b;
    }

    public int multiplicar() {
        return a * b;
    }

    public int dividir() {
        if (b == 0) {
            System.out.println("Error: División por cero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int a = scanner.nextInt();

        System.out.println("Introduce el segundo número:");
        int b = scanner.nextInt();

        CalculadoraRefactorizado calc = new CalculadoraRefactorizado(a, b);

        System.out.println("Elige una operación: 1) Sumar  2) Restar  3) Multiplicar  4) Dividir");
        int opcion = scanner.nextInt();

        int resultado = 0;
        switch (opcion) {
            case 1:
                resultado = calc.sumar();
                break;
            case 2:
                resultado = calc.restar();
                break;
            case 3:
                resultado = calc.multiplicar();
                break;
            case 4:
                resultado = calc.dividir();
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}

