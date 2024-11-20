package org.testeunidade.validadorsenha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidarSenhaTest {

    @Test
    void deveRetornarSenhaValida() {
        ValidarSenha senha = new ValidarSenha();
        senha.setSenha("Senh@1234");
        assertEquals("senha válida", senha.validarSenha("Senh@1234"));
    }

    @Test
    void deveRetornarSenhaNaoTenha8Caracteres() {
        ValidarSenha senha = new ValidarSenha();
        senha.setSenha("Senh@12");
        assertEquals("Senha inválida", senha.validarSenha("Senh@12"));
    }

    @Test
    void deveRetornarSenhaSemLetraMaiuscula() {
        ValidarSenha senha = new ValidarSenha();
        senha.setSenha("senh@1234");
        assertEquals("Senha inválida", senha.validarSenha("senh@1234"));
    }

    @Test
    void deveRetornarSenhaSemLetraMinuscula() {
        ValidarSenha senha = new ValidarSenha();
        senha.setSenha("SENH@1234");
        assertEquals("Senha inválida", senha.validarSenha("SENH@1234"));
    }

    @Test
    void deveRetornarSenhaSemNumero() {
        ValidarSenha senha = new ValidarSenha();
        senha.setSenha("Senh@abcdef");
        assertEquals("Senha inválida", senha.validarSenha("Senh@abcdef"));
    }

    @Test
    void deveRetornarSenhaSemCaracterEspecial() {
        ValidarSenha senha = new ValidarSenha();
        senha.setSenha("Senha1234");
        assertEquals("Senha inválida", senha.validarSenha("Senha1234"));
    }

    @Test
    void deveRetornarSenhaVazia() {
        ValidarSenha senha = new ValidarSenha();
        senha.setSenha("");
        assertEquals("Senha inválida", senha.validarSenha(""));
    }

    @Test
    void deveRetornarSenhaComEspaco() {
        ValidarSenha senha = new ValidarSenha();
        senha.setSenha("Senha @1234");
        assertEquals("Senha inválida", senha.validarSenha("Senha @1234"));
    }

}