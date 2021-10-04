package testes;

import modelos.Aluno;

public class ClienteTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno( "A1","Samara", 7.0, 7.0); //String matricula, String nome, double p1, double p2
        System.out.println(aluno);
    }
}
