// Gabriel de Melo Tizziani e Renan Delalibera Gomes :)
public class Main {
    public static void main(String[] args) {
        UsuarioPadrao usuario1 = new UsuarioPadrao("Renan", "123", 3);
        UsuarioPadrao usuario2 = new UsuarioPadrao("Gustavo", "123123", 10);
        UsuarioPremium usuario3 = new UsuarioPremium("Gabriel", "senha123", 100, 30);
        UsuarioPadrao usuario4 = new UsuarioPadrao("Ricardo", "112233", 1000);
        UsuarioPremium usuario5 = new UsuarioPremium("Pedro", "123456", 1111, 30);
        Post post1 = new Post("Londrina", 100, usuario1);
        Post post2 = new Post("Curitiba", 8, usuario2);
        Post post3 = new Post("SP", 100, usuario3);


        System.out.println(usuario2.getNome());
        post2.curtirPost(usuario4);
        post2.comentarPost(usuario1, " NOSSA GUSTAVO");
        post2.comentarPost(usuario4, " muito bom gustavo");
        System.out.println("");
        usuario1.exibirTagUsuario();
        usuario3.exibirTagUsuario();
        System.out.println("");
        usuario4.postar(usuario4, "Curtindo a praia com os amigos! #muitofeliz");

    }
}