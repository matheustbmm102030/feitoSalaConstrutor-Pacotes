package Fodase;

import sefoda.Aluno;

public class TestaAluno {
    public static void main (String[]args){
        Aluno a2=new Aluno();
        Aluno a1=new Aluno("Bond James Bond","007");
        a2.setNome("Bond James Bond");
        a2.setMatricula("007");
        
        System.out.println(a1.getNome());
        System.out.println(a1.getMaricula());
    }
}
