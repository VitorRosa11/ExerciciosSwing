public class Usuario1 {
    private String nome;
    private String email;
    private String telefone;

    public Usuario1(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nEmail: " + email + "\nTelefone: " + telefone + "\n--------------------\n";
    }
}
