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
public class ATV4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vet[] = new int[20];
        int i, j;
        boolean rept;

        for(i = 0; i < 20; i++) {
            System.out.println("Digite o "+(i + 1)+" valor: ");
            vet[i] = in.nextInt();
        }

        for(i = 0; i < 20; i++) {
            rept = false;
            for(j = 0; j < i; j++) {
                if(vet[i] == vet[j]) {
                    rept = true;
                    break;
                }
            }
        if(!rept) {
            System.out.println(vet[i]);
        }
        }
        }
    }
