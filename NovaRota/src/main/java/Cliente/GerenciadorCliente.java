/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Felipe
 */
public class GerenciadorCliente implements ActionListener{
    private GUICliente guicliente;
    private DAOCliente daocliente;
    private Cliente c;
    
    public GerenciadorCliente(){
        guicliente = new GUICliente();
        guicliente.addListener(this);
        daocliente = new DAOCliente();
        c = new Cliente();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botaopressionado = (JButton)e.getSource();
        String opc = botaopressionado.getName();
        
        switch(opc){
            case "cadastrar":
                c = guicliente.getCliente();
                daocliente.Create(c);
                break;
                
            case "deletar":
                c = guicliente.getCliente();
                daocliente.Remove(c);
                break;
                
            case "alterar":
                c = guicliente.getCliente();
                daocliente.Update(c);
                break;
            case "mostrar":
                c = guicliente.getCliente();
                daocliente.Display();
                break;
        }
    }
    
}
