package Matrices.bin;

import java.util.Scanner;

public class MatricesAct {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingrese el número de filas de la primera matriz: ");
            int filas1 = input.nextInt();
            System.out.print("Ingrese el número de columnas de la primera matriz: ");
            int columnas1 = input.nextInt();

            System.out.print("Ingrese el número de filas de la segunda matriz: ");  
            int filas2 = input.nextInt();
            System.out.print("Ingrese el número de columnas de la segunda matriz: ");
            int columnas2 = input.nextInt();

            if (columnas1 != filas2) {
                System.out.println("No se pueden multiplicar las matrices debido a dimensiones incompatibles.");
                return;
            }

            double[][] matriz1 = new double[filas1][columnas1];
            double[][] matriz2 = new double[filas2][columnas2];

            // Ingrese los valores de la primera matriz
            System.out.println("Ingrese los valores de la primera matriz:");
            for (int i = 0; i < filas1; i++) {
                for (int j = 0; j < columnas1; j++) {
                    System.out.print("Ingrese el valor para la fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                    matriz1[i][j] = input.nextDouble();
                }
            }

            // Ingrese los valores de la segunda matriz
            System.out.println("Ingrese los valores de la segunda matriz:");
            for (int i = 0; i < filas2; i++) {
                for (int j = 0; j < columnas2; j++) {
                    System.out.print("Ingrese el valor para la fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                    matriz2[i][j] = input.nextDouble();
                }
            }

            // Realice la multiplicación de matrices
            double[][] resultado = multiplicarMatrices(matriz1, matriz2);

            // Imprima el resultado si es posible
            if (resultado != null) {
                System.out.println("El resultado de la multiplicación de las matrices es:");
                imprimirMatriz(resultado);
            } else {
                System.out.println("No se pueden multiplicar las matrices debido a dimensiones incompatibles.");
            }
        }
    }

    public static double[][] multiplicarMatrices(double[][] matriz1, double[][] matriz2) {
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int columnas2 = matriz2[0].length;

        double[][] resultado = new double[filas1][columnas2];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                double suma = 0;
                for (int k = 0; k < columnas1; k++) {
                    suma += matriz1[i][k] * matriz2[k][j];
                }
                resultado[i][j] = suma;
            }
        }

        return resultado;
    }

    public static void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
