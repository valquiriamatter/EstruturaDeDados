public class Livro {

    private String nome;
    private int ano;
    private int isbn;
    private String autor;

    public Livro(String nome, int ano, int isbn, String autor) {
        this.nome = nome;
        this.ano = ano;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", isbn=" + isbn +
                ", autor='" + autor + '\'' +
                '}';
    }
}
