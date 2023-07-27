package pousada;

/**
 *  * Classe que representa uma Pessoa da Pousada Milho Verde.
 *
 * @author Pedro Henrique - UFVJM
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
        return "Pessoa{" + "nome=" + nome + ", endereco=" + endereco + ", email=" + email + ", cpf=" + cpf + ", telefone=" + telefone + ", senha=" + senha + ", nivelAcesso=" + nivelAcesso + ", id=" + id + '}';
    }

    /**
     * Cria um novo objeto da classe.
     *
     * Este é o construtor padrão da classe. Ele cria uma instância vazia da
     * classe com os valores padrão para os atributos.
     */
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

    /**
     * Cria um novo objeto da classe Pessoa.
     *
     * @param nome O nome da pessoa.
     * @param cpf O CPF (Cadastro de Pessoas Físicas) da pessoa.
     * @param nivelAcesso é boleano
     * @param id é int
     */
    public Pessoa(String nome, String cpf, boolean nivelAcesso, int id) {
        this.nome = nome;
        this.cpf = cpf;
        this.nivelAcesso = nivelAcesso;
        this.id = id;
    }

    /**
     * Cria um novo objeto da classe Pessoa.
     *
     * @param nome O nome da pessoa.
     * @param endereco O endereço da pessoa.
     * @param email O endereço de e-mail da pessoa.
     * @param cpf O CPF (Cadastro de Pessoas Físicas) da pessoa.
     * @param telefone O número de telefone da pessoa.
     */

//Criar cliente.
    public Pessoa(String nome, String endereco, String email, String cpf, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
    }

   /**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public String getSenha() {
        return senha;
    }

    /**
     *
     * @param senha
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

 /**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

/**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public String getEndereco() {
        return endereco;
    }

    /**
     *
     * @param endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
/**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public String getCpf() {
        return cpf;
    }

    /**
     *
     * @param cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

 /**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public String getTelefone() {
        return telefone;
    }

    /**
     *
     * @param telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

   /**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public boolean isNivelAcesso() {
        return nivelAcesso;
    }

    /**
     *
     * @param nivelAcesso
     */
    public void setNivelAcesso(boolean nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
/**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

}
