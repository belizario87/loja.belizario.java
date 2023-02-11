package br.com.loja.projeto.cliente;

import java.util.Date;

public class Usuario {
    private String usuario;
    private String senha;
    private String estadoLogin;

    private Date dataCadastro;

    public Usuario(String usuario, String senha, Date dataCadastro, String estadoLogin) {
        this.usuario = usuario;
        this.senha = senha;
        this.estadoLogin = estadoLogin;

        this.dataCadastro = dataCadastro;
    }


    public String getEstadoLogin(){
        return estadoLogin;
    }

    public void setEstadoLogin(String estadoLogin){
        this.estadoLogin = estadoLogin;
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }





    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                ", estadoLogin='" + estadoLogin + '\'' +
                ", dataCadastro=" + dataCadastro +
                '}';
    }

    public void verificarLogin(String usuario, String senha){
        if(usuario.equals(this.usuario) && senha.equals(this.senha)){
            setEstadoLogin("Conectado");
            System.out.printf("Seja bem vindo %s%n ", this.usuario);
            System.out.println("Status: " + this.estadoLogin);
        }
        else {
            System.out.println("O login ou a senha podem estar incorretos");
        }


    }
}