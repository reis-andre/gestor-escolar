/*
    Adrian Machado - 201965001AB
    Mário José - 201965507B

*/ 
package controller;

import java.util.ArrayList;
import java.util.List;

/**
* Representa o usuário aluno;
* Possui única finalidade de consultar as notas de suas disciplinas através do método exibirnotas();
* As notas são inseridas pelo usário professor através do método setNotas(List notas);
*/

public class Aluno extends Pessoa {

    private ArrayList<String> notas = new ArrayList(); 

    public Aluno(int id, String senha, String login, String cpf, String nome, String telefone, int tipoUsuario,ArrayList<String> nota) {
        super(id, senha, login, cpf, nome, telefone, tipoUsuario);
        notas.addAll(nota);
    }

    public Aluno() {
    }

    public ArrayList<String> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<String> notas) {
        this.notas = notas;
    }
}
