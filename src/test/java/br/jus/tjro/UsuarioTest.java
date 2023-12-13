package br.jus.tjro;

import br.jus.tjro.model.Usuario;
import br.jus.tjro.service.UsuarioService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

@SpringBootTest
@TestPropertySource("/application-test.yml")
public class UsuarioTest {

    @Autowired
    private UsuarioService usuarioService;

    @Test
    public void pesquisaTudo(){
        List<Usuario> usuarioList = usuarioService.findAll();
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        usuarioList.forEach(u -> System.out.println(u));
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        Assert.assertNotNull(usuarioList);
    }
}
