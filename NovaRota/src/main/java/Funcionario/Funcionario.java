/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionario;

import Usuario.Usuario;

/**
 *
 * @author Teixas
 */
public class Funcionario extends Usuario{
    private int idfuncionario;
    private String senha;
    
    public int getIDFuncionario() {
        return idfuncionario;
    }
    public void setIDFuncionario(int idfuncionario) {
        this.idfuncionario = idfuncionario;
    }
    
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
}
