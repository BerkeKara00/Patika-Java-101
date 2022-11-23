package Diziler_Ödevleri;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matris {

    public static void matrisYazdır(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + "\t");

            }
            System.out.println();
        }

    }

    public static void terstenYazdir(int[][] matris) {
        for (int i = 0; i < matris[0].length; i++) {
            for (int j = 0; j < matris.length; j++) {
                System.out.print(matris[j][i] + "\t");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Matrislerin satır sayısını girin : ");
        int satir = scanner.nextInt();

        System.out.print("Matrislerin sutun sayısını girin : ");
        int sutun = scanner.nextInt();

        int[][] matris = new int[satir][sutun];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                matris[i][j] = (int) (Math.random() * 10) + 1;

            }
        }

        System.out.println("Matris : ");
        matrisYazdır(matris);

        System.out.println("Transpozu : ");
        terstenYazdir(matris);

    }

}
