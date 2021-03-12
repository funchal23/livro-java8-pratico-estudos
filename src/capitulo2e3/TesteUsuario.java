package capitulo2e3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TesteUsuario {

    public static void main(String[] args) {
        Usuario user1 = new Usuario("Lucas Funchal", 100);
        Usuario user2 = new Usuario("Bruno Luciano", 150);
        Usuario user3 = new Usuario("Evellen Barbosa", 200);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3); // Sem a necessidade de incluir um por um

        for (Usuario user:usuarios) {
            System.out.println(user.getNome());
        }

        Mostrador mostrador1 = new Mostrador(); // Uma maneira de fazer de implementar interface Consumer para utilizar o forEach

        Consumer<Usuario> mostrador2 = new Consumer<Usuario>() { // Outra maneira de fazer, não tendo a necessidade de criar classe separada
            @Override
            public void accept(Usuario usuario) {
                System.out.println(usuario.getNome());
            }
        };

        usuarios.forEach(mostrador1);
        usuarios.forEach(mostrador2);
        usuarios.forEach(new Consumer<Usuario>() {   // Outra maneira de fazer
            @Override
            public void accept(Usuario usuario) {
                System.out.println(usuario.getPontos());
            }
        });


        // Entrada no LAMBDA para facilitar a verbosidade do codigo

        Consumer<Usuario> mostrador3 = (Usuario usuario) -> {
            System.out.println(usuario.getNome());
        };

        Consumer<Usuario> mostrador4 = u -> {
            System.out.println(u.getNome());
        };

        Consumer<Usuario> mostrador5 = u -> System.out.println(u.getNome());

        usuarios.forEach(u -> System.out.println(u.getPontos()));

        // Tornando todos os usuários moderadores

        usuarios.forEach(u -> u.tornarModerador());

    }
}
