/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Locacao;


/**
 *
 * @author Felipe
 */
public class Locacao {
    private int idlocacao;
    private int idcliente;
    private int idfuncionario;
    private String placa;
    private int datalocacao;
    private int datadevolucao;

    public int getIdlocacao() {
        return idlocacao;
    }
    public void setIdlocacao(int idlocacao) {
        this.idlocacao = idlocacao;
    }

    public int getIdcliente() {
        return idcliente;
    }
    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdfuncionario() {
        return idfuncionario;
    }
    public void setIdfuncionario(int idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getDatalocacao() {
        return datalocacao;
    }
    public void setDatalocacao(int datalocacao) {
        this.datalocacao = datalocacao;
    }

    public int getDatadevolucao() {
        return datadevolucao;
    }
    public void setDatadevolucao(int datadevolucao) {
        this.datadevolucao = datadevolucao;
    }
}
