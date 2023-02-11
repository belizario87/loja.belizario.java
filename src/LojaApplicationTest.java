import br.com.loja.projeto.cliente.Usuario;

import java.util.Date;

public class LojaApplicationTest {
    public static void main(String[] args) {

        Usuario user1 = new Usuario("belizario", "lelecobolado22", new Date(19, 4, 21),"Desconectado" );

        System.out.println(user1);
        user1.verificarLogin("belizario", "lelecobolado22");

    }
}