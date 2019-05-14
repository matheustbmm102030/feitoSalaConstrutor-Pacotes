package sefoda;

public class Aluno {
    private String nome;
    private String matricula;
    
    public Aluno(){
        System.out.println("Construindo um espiao...");
    }
    public Aluno(String n, String m){
        this.setNome(n);
        this.setMatricula(m);
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome=n;
    }
    public String getMaricula(){
        return this.matricula;
    }
    public void setMatricula(String m){
        this.matricula=m;
    }

}
