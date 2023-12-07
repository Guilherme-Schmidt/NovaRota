/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import Administrador.GerenciadorAdministrador;
import Cliente.GerenciadorCliente;
import Funcionario.GerenciadorFuncionario;
import Locacao.GerenciadorLocacao;
import Veiculo.GerenciadorVeiculo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Felipe
 */
public class MenuAdministrador implements ActionListener{
    private GUIMenuAdministrador guimenuadministrador;
    
    public MenuAdministrador(){
        guimenuadministrador = new GUIMenuAdministrador();
        guimenuadministrador.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botaopressionado = (JButton)e.getSource();
        String opc = botaopressionado.getName();
        
        switch(opc){
            case "administrador":
                System.out.println("Administrador");
                new GerenciadorAdministrador();
                break;
                
            case "cliente":
                System.out.println("Cliente");
                new GerenciadorCliente();
                break;
                
            case "funcionario":
                System.out.println("Funcionário");
                new GerenciadorFuncionario();
                break;
            case "locacao":
                System.out.println("Locação");
                new GerenciadorLocacao();
                break;
                
            case "veiculo":
                System.out.println("Veículo");
                new GerenciadorVeiculo();
                break;
        }
    }
}
