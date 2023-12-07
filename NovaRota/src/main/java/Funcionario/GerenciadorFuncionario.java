/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionario;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Felipe
 */
public class GerenciadorFuncionario implements ActionListener {
    private GUIFuncionario guifuncionario;
    private DAOFuncionario daofuncionario;
    private Funcionario f;

    public GerenciadorFuncionario() {
        guifuncionario = new GUIFuncionario();
        guifuncionario.addListener(this);
        daofuncionario = new DAOFuncionario();
        f = new Funcionario();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botaopressionado = (JButton) e.getSource();
        String opc = botaopressionado.getName();
        switch (opc) {
            case "cadastrar":
                f = guifuncionario.getFuncionario();
                daofuncionario.Create(f);
                guifuncionario.limpar();
                break;
            case "deletar":
                int idFunc = guifuncionario.getID();
                daofuncionario.Remove(idFunc);
                guifuncionario.limpar();
                break;
            case "alterar":
                f = guifuncionario.getFuncionario();
                daofuncionario.Update(f);
                guifuncionario.limpar();
                break;
            case "mostrar":
                guifuncionario.consultar();
                break;
        }
    }
}
