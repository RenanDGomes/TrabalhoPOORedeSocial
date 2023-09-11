// Gabriel de Melo Tizziani e Renan Delalibera Gomes :)
public class UsuarioPremium extends Usuario {
    private int valorMensalidade;

    public UsuarioPremium(String nome, String senha, int numSeguidores, int valorMensalidade) {
        super(nome, senha, numSeguidores);
        this.valorMensalidade = valorMensalidade;
    }

    public int getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(int valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    @Override
    public void exibirTagUsuario() {
        System.out.println("Usuário: " + this.getNome() + "| Seguidores: " + this.getNumSeguidores() + " PLUS ★");
    }
}
