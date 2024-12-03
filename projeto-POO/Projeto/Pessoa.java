package Projeto;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Pessoa 
{
    private String nome; 
    private int codigoUsuario;
    private String email; 
    private String senhaPessoal;
    private String nivelAcesso;

    public Pessoa(String nome, int codigoUsuario, String email, String senhaPessoal, String nivelAcesso) {
        this.nome = nome;
        this.codigoUsuario = codigoUsuario;
        this.email = email;
        this.senhaPessoal = senhaPessoal;
        this.nivelAcesso = nivelAcesso;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setCodigoUsuario(int codigoUsuario) 
    {
        this.codigoUsuario = codigoUsuario;
    }

    public int getCodigoUsuario() 
    {
        return codigoUsuario;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setSenhaPessoal(String senhaPessoal) 
    {
        this.senhaPessoal = senhaPessoal;
    }

    public String getSenhaPessoal() 
    {
        return senhaPessoal;
    }

    public void setNivelAcesso(String nivelAcesso) 
    {
        this.nivelAcesso = nivelAcesso; 
    }

    public String getNivelAcesso() 
    {
        return nivelAcesso; 
    }
    
    public String salvaPessoa()
    {
        try 
        {
            FileWriter fw = new FileWriter("Pessoa.txt");
            PrintWriter pw = new PrintWriter("fw");
            pw.println("Nome: "+this.nome);
            pw.println("Email: "+this.email);
            pw.println("Senha: "+this.senhaPessoal);
            pw.println("Cod: "+this.codigoUsuario);
            pw.println("Perfil: "+this.nivelAcesso);
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