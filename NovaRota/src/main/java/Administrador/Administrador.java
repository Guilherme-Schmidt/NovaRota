/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administrador;

import Funcionario.Funcionario;

/**
 *
 * @author Felipe
 */
public class Administrador extends Funcionario {
    private int idadministrador;
    private String senha;

    public int getIDAdministrador() {
        return idadministrador;
    }
    public void setIDAdministrador(int idadministrador) {
        this.idadministrador = idadministrador;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
}
