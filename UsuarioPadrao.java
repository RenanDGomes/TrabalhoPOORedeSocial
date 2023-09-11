// Gabriel de Melo Tizziani e Renan Delalibera Gomes :)
public class UsuarioPadrao extends Usuario {
    private int numPostagem;
    private boolean numPostagemAtingido;

    public UsuarioPadrao(String nome, String senha, int numSeguidores) {
        super(nome, senha, numSeguidores);
        this.numPostagem = 0;
        this.numPostagemAtingido = false;
    }

    @Override
    public void exibirTagUsuario() {
        System.out.println("Usuário: " + this.getNome() + "| Seguidores: " + this.getNumSeguidores());
    }


    public int getNumPostagem() {
        return numPostagem;
    }

    public void setNumPostagem(int numPostagem) {
        this.numPostagem = numPostagem;
    }

    public boolean isNumPostagemAtingido() {
        return numPostagemAtingido;
    }

    public void setNumPostagemAtingido(boolean numPostagemAtingido) {
        this.numPostagemAtingido = numPostagemAtingido;
    }

}
