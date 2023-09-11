// Gabriel de Melo Tizziani e Renan Delalibera Gomes :)
public class Post {
    private String localizacao;
    private int numCurtidas;
    private Usuario nomeUsuario;
    private int numComentario;
    private String[] comentario;

    public Post(String localizacao, int numCurtidas, Usuario nomeUsuario) {
        this.localizacao = localizacao;
        this.numCurtidas = numCurtidas;
        this.nomeUsuario = nomeUsuario;
        this.numComentario = 0;
        this.comentario = new String[100];
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getNumCurtidas() {
        return numCurtidas;
    }

    public void setNumCurtidas(int numCurtidas) {
        this.numCurtidas = numCurtidas;
    }

    public Usuario getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(Usuario nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getNumComentario() {
        return numComentario;
    }

    public void setNumComentario(int numComentario) {
        this.numComentario = numComentario;
    }

    public String[] getComentario() {
        return comentario;
    }

    public void setComentario(String[] comentario) {
        this.comentario = comentario;
    }

    public void curtirPost(Usuario usuario) {
        this.numCurtidas ++;
        System.out.println("Curtidas: " + this.numCurtidas);
        System.out.println(usuario.getNome() + " curtiu o post do " + this.nomeUsuario.getNome());
    }
    public void comentarPost(Usuario usuario, String comentario){
        this.comentario[this.numComentario] = comentario;
        this.numComentario ++;
        System.out.println("O post tem " + this.numComentario + " comentário");
        for (int i = 0; i < this.numComentario; i++) {
            System.out.println(this.comentario[i]);
        }
        //System.out.println(usuario.getNome() + " comentou no post do " + this.nomeUsuario.getNome() + ": " + comentario);



    }



}
