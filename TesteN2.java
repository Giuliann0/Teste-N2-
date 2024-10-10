/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testen2;

/**
 *
 * @author giulianno.milione
 */
class ProvaUniversidade {
    private double av1;
    private double av2;

    
    public ProvaUniversidade(double av1, double av2) {
        this.av1 = av1;
        this.av2 = av2;
    }


    protected double calcularMedia() {
        return (av1 + av2) / 2;
    }
}


class ProvaUCB extends ProvaUniversidade {

    public ProvaUCB(double av1, double av2) {
        super(av1, av2);
    }


    public boolean True() {
        return calcularMedia() >= 7;
    }
}


class ProvaFafifo extends ProvaUniversidade {

    public ProvaFafifo(double av1, double av2) {
        super(av1, av2);
    }


    public boolean True() {
        return calcularMedia() >= 6;
    }
}


public class TesteN2 {
    public static void main(String[] args) {

        ProvaUCB alunoUCB = new ProvaUCB(7.5, 8.0);
        ProvaFafifo alunoFafifo = new ProvaFafifo(5.5, 6.5);


        System.out.println("Aluno UCB: " + (alunoUCB.True() ? "True" : "False"));
        System.out.println("Aluno Fafifo: " + (alunoFafifo.True() ? "True" : "False"));
    }
}
