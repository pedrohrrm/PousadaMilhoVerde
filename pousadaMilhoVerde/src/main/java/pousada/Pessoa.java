package pousada;
/**
 *
 * @author Pedro Henrique
 */
public abstract class Pessoa {
   private String nome, endereco, email, cpf, telefone;
   private boolean nivelAcesso;
   private int id;

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", endereco=" + endereco + ", email=" + email + ", cpf=" + cpf + ", telefone=" + telefone + ", nivelAcesso=" + nivelAcesso + ", id=" + id + '}';
    }

    public Pessoa() {
    }
//criar funcionário
    public Pessoa(String nome, String cpf, boolean nivelAcesso, int id) {
        this.nome = nome;
        this.cpf = cpf;
        this.nivelAcesso = nivelAcesso;
        this.id = id;
    }
    
//Criar cliente.
    public Pessoa(String nome, String endereco, String email, String cpf, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isNivelAcesso() {
        return nivelAcesso;
    }

    public boolean setNivelAcesso() {
       this.nivelAcesso = nivelAcesso;
       return false;
        
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
}
