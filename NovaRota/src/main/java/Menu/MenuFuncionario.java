/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import Cliente.GerenciadorCliente;
import Locacao.GerenciadorLocacao;
import Veiculo.GerenciadorVeiculo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Felipe
 */
public class MenuFuncionario implements ActionListener{
    private GUIMenuFuncionario guimenufuncionario;
    
    public MenuFuncionario(){
        guimenufuncionario = new GUIMenuFuncionario();
        guimenufuncionario.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botaopressionado = (JButton)e.getSource();
        String opc = botaopressionado.getName();
        
        switch(opc){
            case "cliente":
                new GerenciadorCliente();
                break;
                
            case "veiculo":
                new GerenciadorVeiculo();
                break;
                
            case "locacao":
                new GerenciadorLocacao();
                break;
        }
    }
}
