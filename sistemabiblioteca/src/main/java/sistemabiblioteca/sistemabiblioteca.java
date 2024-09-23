import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sistemabiblioteca {
    public static void main(String[] args) {

class Livro { 
    private String titulo;  
    private String autor;  
    private boolean emprestado;  

    public Livro(String titulo, String autor) {  
        this.titulo = titulo;  
        this.autor = autor;  
        this.emprestado = false;  
    }  

    public String getTitulo() {  
        return titulo;  
    }  

    public String getAutor() {  
        return autor;  
    }  

    public boolean isEmprestado() {  
        return emprestado;  
    }  

    public void emprestar() {  
        emprestado = true;  
    }  

    public void devolver() {  
        emprestado = false;  
    }  

    @Override  
    public String toString() {  
        return "Título: " + titulo + ", Autor: " + autor + ", Emprestado: " + (emprestado ? "Sim" : "Não");  
    }  
}  

class Biblioteca {  
    private List<Livro> livros;  

    public Biblioteca() {  
        livros = new ArrayList<>();  
    }  

    public void adicionarLivro(Livro livro) {  
        livros.add(livro);  
    }  

    public void listarLivros() {  
        for (Livro livro : livros) {  
            System.out.println(livro);  
        }  
    }  

    public void emprestarLivro(String titulo) {  
        for (Livro livro : livros) {  
            if (livro.getTitulo().equalsIgnoreCase(titulo) && !livro.isEmprestado()) {  
                livro.emprestar();  
                System.out.println("Livro emprestado: " + livro.getTitulo());  
                return;  
            }  
        }  
        System.out.println("Livro não encontrado ou já emprestado.");  
    }  

    public void devolverLivro(String titulo) {  
        for (Livro livro : livros) {  
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.isEmprestado()) {  
                livro.devolver();  
                System.out.println("Livro devolvido: " + livro.getTitulo());  
                return;  
            }  
        }  
        System.out.println("Livro não encontrado ou não estava emprestado.");  
    }  
}  

public class sistemabiblioteca {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        Biblioteca biblioteca = new Biblioteca();  

        while (true) {  
            System.out.println("\nGerenciamento de Biblioteca");  
            System.out.println("1. Adicionar Livro");  
            System.out.println("2. Listar Livros");  
            System.out.println("3. Emprestar Livro");  
            System.out.println("4. Devolver Livro");  
            System.out.println("5. Sair");  
            System.out.print("Escolha uma opção: ");  

            int opcao = scanner.nextInt();  
            scanner.nextLine();  // Consumir a nova linha  

            switch (opcao) {  
                case 1:  
                    System.out.print("Título do livro: ");  
                    String titulo = scanner.nextLine();  
                    System.out.print("Autor do livro: ");  
                    String autor = scanner.nextLine();  
                    biblioteca.adicionarLivro(new Livro(titulo, autor));  
                    break;  
                case 2:  
                    biblioteca.listarLivros();  
                    break;  
                case 3:  
                    System.out.print("Título do livro para emprestar: ");  
                    String tituloEmprestimo = scanner.nextLine();  
                    biblioteca.emprestarLivro(tituloEmprestimo);  
                    break;  
                case 4:  
                    System.out.print("Título do livro para devolver: ");  
                    String tituloDevolucao = scanner.nextLine();  
                    biblioteca.devolverLivro(tituloDevolucao);  
                    break;  
                case 5:  
                    System.out.println("Saindo...");  
                    scanner.close();  
                    return;  
                default:  
                    System.out.println("Opção inválida. Tente novamente.");  
            }  
        }  
    

    }

    @Override
    public boolean equals(Object obj) {
        // Auto-generated method stub
        return super.equals(obj);
    }}}
}
