// Gabriel de Melo Tizziani e Renan Delalibera Gomes :)
public abstract class Usuario implements Postagens {
    private String nome;
    private String senha;
    private int numSeguidores;
    private Post[] posts;

    public Usuario(String nome, String senha, int numSeguidores) {
        this.nome = nome;
        this.senha = senha;
        this.numSeguidores = numSeguidores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumSeguidores() {
        return numSeguidores;
    }

    public void setNumSeguidores(int numSeguidores) {
        this.numSeguidores = numSeguidores;
    }

    public abstract void exibirTagUsuario();

    public void postar(Usuario usuario, String legenda) {
        System.out.println("Usuário: " + this.getNome() + " fez uma postagem!" + " | Legenda: " + legenda);
    }
}

