package Projeto;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Aluno extends Pessoa 
{
    private String cpf;

    public Aluno(String nome, int codigoUsuario, String email, String senhaPessoal, String nivelAcesso, String cpf) 
    {
        super(nome, codigoUsuario, email, senhaPessoal, nivelAcesso);
        this.cpf = cpf;
    }

    public void setCPF(String cpf) 
    {
        this.cpf = cpf;
    }

    public String getCPF() 
    {
        return cpf;
    }
    
    public String salvaAluno() 
    {
        try 
        {
            FileWriter fw = new FileWriter("Aluno.txt");
            PrintWriter pw = new PrintWriter("fw");
            pw.println("CPF: "+this.cpf);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex)
        {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}