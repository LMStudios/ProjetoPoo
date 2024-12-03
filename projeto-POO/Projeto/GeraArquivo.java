package Projeto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeraArquivo {

    //Método para salvar um curso no arquivo cursos.csv
    
    public static void salvarCurso(Curso curso) {
        try {
            File arquivo = new File("cursos.csv");
            boolean arquivoNovo = !arquivo.exists();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
                // Adiciona cabeçalho se o arquivo for novo
                if (arquivoNovo) {
                    writer.write("Nome,Código do Curso,Descrição,Professor Responsável");
                    writer.newLine();
                }
                // Escreve os dados do curso
                writer.write(curso.getNomeCurso() + "," +
                             curso.getCodigoCurso() + "," +
                             curso.getCargaHorariaCurso() + "," +
                             curso.getDateFim() + "," +
                             curso.getDateInicio() + "," +
                             curso.getEmenta() + "," +
                                         curso.getHorario() + ",");
            
                            if (curso.getProfessor() != null) {
                                writer.write(curso.getProfessor().getNome());
                            } else {
                                // Trate o caso onde o professor é nulo
                                System.out.println("O curso não possui um professor atribuído.");
                            }

                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar curso: " + e.getMessage());
        }
    }

    // Método para salvar um aluno no arquivo alunos.csv
    public static void salvarAluno(Aluno aluno) {
        try {
            File arquivo = new File("alunos.csv");
            boolean arquivoNovo = !arquivo.exists();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
                // Adiciona cabeçalho se o arquivo for novo
                if (arquivoNovo) {
                    writer.write("Nome,CPF,Código do Usuário,Email,Senha,Nível de Acesso");
                    writer.newLine();
                }
                // Escreve os dados do aluno
                writer.write(aluno.getNome() + "," +
                             aluno.getCPF() + "," +
                             aluno.getCodigoUsuario() + "," +
                             aluno.getEmail() + "," +
                             aluno.getSenhaPessoal() + "," +
                             aluno.getNivelAcesso());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar aluno: " + e.getMessage());
        }
    }

    // Método para salvar um administrador no arquivo administradores.csv
    public static void salvarAdministrador(Administrador administrador) {
        try {
            File arquivo = new File("administradores.csv");
            boolean arquivoNovo = !arquivo.exists();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
                // Adiciona cabeçalho se o arquivo for novo
                if (arquivoNovo) {
                    writer.write("Nome,Código do Usuário,Email,Senha,Nível de Acesso");
                    writer.newLine();
                }
                // Escreve os dados do administrador
                writer.write(administrador.getNome() + "," +
                             administrador.getCodigoUsuario() + "," +
                             administrador.getEmail() + "," +
                             administrador.getSenhaPessoal() + "," +
                             administrador.getNivelAcesso());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar administrador: " + e.getMessage());
        }
    }

    // Método para salvar um professor no arquivo professores.csv
    public static void salvarProfessor(Professor professor) {
        try {
            File arquivo = new File("professores.csv");
            boolean arquivoNovo = !arquivo.exists();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
                // Adiciona cabeçalho se o arquivo for novo
                if (arquivoNovo) {
                    writer.write("Nome,Código do Usuário,Email,Senha,Nível de Acesso");
                    writer.newLine();
                }
                // Escreve os dados do professor
                writer.write(professor.getNome() + "," +
                             professor.getCodigoUsuario() + "," +
                             professor.getEmail() + "," +
                             professor.getSenhaPessoal() + "," +
                             professor.getNivelAcesso());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar professor: " + e.getMessage());
        }
    }

    public static void salvarCurso(String nomeCurso, String codigoCurso, String ementa, String dateInicio,
            String dateFim, String horario, int cargaHorariaCurso, Professor professor, Aluno[] alunosMatriculados,
            int quantidadeAtualAlunos) {
                if (professor != null) {
                    @SuppressWarnings("unused")
                    String nomeProfessor = professor.getNome();
                    // Continue com o processamento
                } else {
                    // Trate o caso onde o professor é nulo
                    System.out.println("O curso não possui um professor atribuído.");
                }
        throw new UnsupportedOperationException("Unimplemented method 'salvarCurso'");
    }
}
