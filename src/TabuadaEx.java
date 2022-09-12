package br.com.fecaf.tabuada;

import java.util.Scanner;

public class TabuadaEx  {

    public static void main(String[] args) {
        int tabuadaCom = 0;
        int tabuadaMid = 0;
        int contCom = 0;
        int contFim = 0;
        int resultado = 0;
        int cont = 0;
        Scanner entraDados = new Scanner(System.in);

        System.out.println("Digite um número entre 2 e 100 para definir o número de começo da Tabuada");
        tabuadaCom = entraDados.nextInt();
        while (tabuadaCom < 2 || tabuadaCom > 100) {
            System.out.println("ERRO digite um dado Vàlido");
            tabuadaCom = entraDados.nextInt();
        }
        ;
        System.out.println("Favor digiter um número entre 0 e 50");
        contCom = entraDados.nextInt();
        while (contCom < 1 || contCom >50) {
        	System.out.println("ERRO digite um dado Vàlido");
            contCom = entraDados.nextInt();
        }
        ;
        System.out.println("Digite um número entre 2 e 100 para definir o número de começo da Tabuada");
        tabuadaMid = entraDados.nextInt();
        while (tabuadaMid < 2 || tabuadaMid >100) {
        	System.out.println("ERRO digite um dado Vàlido");
            tabuadaMid = entraDados.nextInt();
        }
        ;
        System.out.println("Favor digiter um número entre 0 e 50");
        contFim = entraDados.nextInt();
        while (contFim < 0|| contFim > 50) {
        	System.out.println("ERRO digite um dado Vàlido");
            contFim = entraDados.nextInt();
        }
        ;
        cont = contCom;
        while (tabuadaCom <= tabuadaMid) {
        	System.out.println("\n Tabuada do"+"["+tabuadaCom+"]"+"\n");
            while (contCom <= contFim) {
                resultado = tabuadaCom * contCom;
                System.out.println(tabuadaCom + "x" + contCom + "=" + resultado);
                contCom++;
            }
            contCom = cont;
            tabuadaCom++; 
            }
        
    };
}