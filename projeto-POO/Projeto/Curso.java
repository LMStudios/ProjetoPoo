package Projeto;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Curso 
{
    private String nomeCurso;
    private String codigoCurso;
    private int cargaHorariaCurso;
    private String ementa;
    private String dateInicio; 
    private String dateFim; 
    private String horario;
    private Professor professor; 
    private int quantidadeAtualAlunos;
    private boolean status;
    private Aluno[] alunosMatriculados;
    private double[] notas;
    private final int quantidadeMaximaAlunos = 40;
   
    
    private static int indiceNotas = 0;


    public Curso(String nomeCurso, String codigoCurso, int cargaHorariaCurso, String ementa, String dateInicio, String dateFim, String horario, Professor professor) 
    {
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso; 
        this.cargaHorariaCurso = cargaHorariaCurso; 
        this.ementa = ementa; 
        this.dateInicio = dateInicio; 
        this.dateFim = dateFim; 
        this.horario = horario; 
        this.professor = professor;
        this.status = true;
        this.quantidadeAtualAlunos = 0; 
        alunosMatriculados = new Aluno[getQuantidadeMaximaAlunos()];
        notas = new double[getQuantidadeMaximaAlunos()];
    }

    public Curso(String nomeCurso2, String codigoCurso2, int cargaHoraria, String ementa2, String dataInicio,
            String dataFim, int quantidadeAtualAlunos2, Professor professor2, Aluno[] alunos, int capacidade) {
        //TODO Auto-generated constructor stub
    }

    public Curso(String nomeCurso2, String codigoCurso2, String cargaHoraria, String ementa2, String dataInicio,
            String dataFim, int quantidadeAtualAlunos2, Professor professor2, Aluno[] alunos, int capacidade) {
        //TODO Auto-generated constructor stub
    }

    public void setNomeCurso(String nomeCurso) 
    {
        this.nomeCurso = nomeCurso;
    }

    public String getNomeCurso() 
    {
        return nomeCurso;
    }

    public void setCodigoCurso(String codigoCurso) 
    {
        this.codigoCurso = codigoCurso;
    }

    public String getCodigoCurso() 
    {
        return codigoCurso;
    }

    public void setCargaHorariaCurso(int cargaHorariaCurso) 
    {
        this.cargaHorariaCurso = cargaHorariaCurso;
    }

    public int getCargaHorariaCurso() 
    {
        return cargaHorariaCurso;
    }

    public void setEmenta(String ementa) 
    {
        this.ementa = ementa;
    }

    public String getEmenta() 
    {
        return ementa;
    }

    public void setDateInicio(String dateInicio) 
    {
        this.dateInicio = dateInicio;
    }

    public String getDateInicio() 
    {
        return dateInicio;
    } 

    public void setDateFim(String dateFim) 
    {
        this.dateFim = dateFim;
    }

    public String getDateFim() 
    {
        return dateFim;
    }

    public void setHorario(String horario) 
    {
        this.horario = horario;
    }

    public String getHorario() 
    {
        return horario;
    }

    public void setProfessor(Professor professor) 
    {
        this.professor = professor;
    }

    public Professor getProfessor() 
    {
        return professor;
    }

    public void setStatus(boolean status) 
    {
        this.status = status;
    }

    public boolean getStatus() 
    {
        return status;
    }

    public void setQuantidadeAtualAlunos(int quantidadeAtualAlunos) 
    {
        this.quantidadeAtualAlunos = quantidadeAtualAlunos;
    }

    public int getQuantidadeAtualAlunos() 
    {
        return quantidadeAtualAlunos;
    }

    public void setAlunosMatriculados(Aluno aluno) 
    {
        this.alunosMatriculados[quantidadeAtualAlunos] = aluno;
        setQuantidadeAtualAlunos(getQuantidadeAtualAlunos() + 1);
    }

    public Aluno getAlunosMatriculados(int indiceAluno) 
    {
        return alunosMatriculados[indiceAluno];
    }

    public void setNota(double nota)
     {
        if(nota < 0.0) {
            throw new IllegalArgumentException("A nota não pode ser menor que zero!");
        } else {
            this.notas[indiceNotas] = nota;
            indiceNotas++; 
        }
    }

    public double getNota(int indiceNotas) 
    {
        return notas[indiceNotas];
    }

    public int getQuantidadeMaximaAlunos() 
    {
        return quantidadeMaximaAlunos;
    }

    public String salvaAluno() 
    {
        try 
        {
            FileWriter fw = new FileWriter("Curso.txt");
            PrintWriter pw = new PrintWriter("fw");
            pw.println("Nome do curso: "+this.nomeCurso);
            pw.println("Codigo do curso: "+this.codigoCurso);
            pw.println("Status: "+this.status);
            pw.println("Quantidade máxima de alunos: "+this.quantidadeMaximaAlunos);
            pw.println("Finalização do curso: "+this.dateFim);
            pw.println("Início do Curso: "+this.dateInicio);
            pw.println("Carga horária: "+this.cargaHorariaCurso);
            pw.flush();
            pw.close();
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}