package org.testeunidade.ValidadorSenha;

public class ValidarSenha {

    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String validarSenha(String senha) {
        if (senha.length() < 8) {
            return "Senha inválida";
        }
        if (!senha.matches(".*[!@#$%^&*(),.?\":{}|<> ].*")) {
            return "Senha inválida";
        }
        if (!senha.matches(".*[A-Z].*")) {
            return "Senha inválida";
        }
        if (!senha.matches(".*[a-z].*")) {
            return "Senha inválida";
        }
        if (!senha.matches(".*[0-9].*")) {
            return "Senha inválida";
        }
        if (senha.isEmpty()) {
            return "Senha inválida";
        }
        if (senha.contains(" ")) {
            return "Senha inválida";
        }
        return "senha válida";
    }
}
