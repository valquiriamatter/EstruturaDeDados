public class Contato {

    private int id;
    private String nome;
    private String telefone;
    private String email;

    private static int contador;

    public Contato() {
        contador ++;
        id = contador;
    }

    public Contato(int id, String nome, String telefone, String email) {

        contador ++;
        id = contador;

        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {

        return "Contato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String obterInfo() {
        return "Nome: " + this.nome + ";" +
                "Telefone: " + this.telefone + ";" +
                "Email: " + this.email + ";";
    }
}