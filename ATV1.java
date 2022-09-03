/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista6;

import java.util.Scanner;

/**
 *
 * @author Pedro Henrique Borba de Souza
 */
public class ATV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] num = new float[10];
        int i = 0;
        float soma = 0;

        for (i = 0; i < 10; i++){
            System.out.println("Adicione valores para os vetores: ");
            num[i] = sc.nextFloat();
        }

        for (i = 0; i < 10; i++){
            if (num[i] < 0){
                System.out.println("Negativos: " +  num[i]);
            }else{
                soma = soma + num[i];
                System.out.println("Positivos: " +  num[i]);
            }
        }
        System.out.println("A soma dos números positivos de: " + soma);
    }
}
