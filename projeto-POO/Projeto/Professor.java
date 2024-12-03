package Projeto;

public class Professor extends Pessoa 
{
    private int cargaHorariaAtual;
    private final int cargaHorariaMaxima = 80; 

    public Professor(String nome, int codigoUsuario, String email, String senhaPessoal, String nivelAcesso) 
    {
        super(nome, codigoUsuario, email, senhaPessoal, nivelAcesso); 
        this.cargaHorariaAtual = 0;
    }

    public void setCargaHorariaAtual(int cargaHorariaAtual) 
    {
        this.cargaHorariaAtual = cargaHorariaAtual;
    }

    public int getCargaHorariaAtual() 
    {
        return cargaHorariaAtual;
    }

    public int getCargaHorariaMaxima() 
    {
        return cargaHorariaMaxima; 
    }
}