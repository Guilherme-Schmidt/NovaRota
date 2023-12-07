/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Felipe
 */
public class GerenciadorVeiculo implements ActionListener{
    private GUIVeiculo guiveiculo;
    private DAOVeiculo daoveiculo;
    private Veiculo v;
    
    public GerenciadorVeiculo(){
        guiveiculo = new GUIVeiculo();
        guiveiculo.addListener(this);
        daoveiculo = new DAOVeiculo();
        v = new Veiculo();
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botaopressionado = (JButton)e.getSource();
        String opc = botaopressionado.getName();
        
        switch(opc){
            case "cadastrar":
                v = guiveiculo.getVeiculo();
                daoveiculo.Create(v);
                guiveiculo.limpar();
                break;                
            case "deletar":
                String vei_placa = guiveiculo.getPlaca();
                daoveiculo.Remove(vei_placa);
                guiveiculo.limpar();
                break;
            case "alterar":
                v = guiveiculo.getVeiculo();
                daoveiculo.Update(v);
                guiveiculo.limpar();
                break;
            case "mostrar":
                guiveiculo.consultar();
                break;
        }
    }    
}
