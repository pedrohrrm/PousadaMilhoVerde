package pousada;
/**
 *
 * @author Pedro Henrique
 */
public abstract class Pessoa {

    String nome;
    String endereco;
    String email;
    String cpf;

  
   private String telefone, senha;
   private boolean nivelAcesso;
   private int id;

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", endereco=" + endereco + ", email=" + email + ", cpf=" + cpf + ", telefone=" + telefone + ", nivelAcesso=" + nivelAcesso + ", id=" + id + '}';
    }

    public Pessoa() {
    }
    //criar proprietario

    public Pessoa(String nome, String cpf, String senha, boolean nivelAcesso, int id) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
        this.id = id;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
public void setNivelAcesso(boolean nivelAcesso) {
    this.nivelAcesso = nivelAcesso;
}


    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
}
