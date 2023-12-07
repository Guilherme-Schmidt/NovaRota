/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administrador;

import Funcionario.Funcionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author USUARIO
 */
public class GerenciadorAdministrador implements ActionListener {

    private GUIAdministrador guiadministrador;
    private DAOAdministrador daoadministrador;
    private Administrador a;
    private Funcionario f;
    
    
    public GerenciadorAdministrador(){
        guiadministrador = new GUIAdministrador();
        guiadministrador.addListener(this);
        daoadministrador = new DAOAdministrador();
        a = new Administrador();
        f = new Funcionario();
    }
    
      public void actionPerformed(ActionEvent e) {
        JButton botaopressionado = (JButton)e.getSource();
        String opc = botaopressionado.getName();
        
        switch(opc){
            case "cadastrar":
                f = guiadministrador.getFuncionario();
                daoadministrador.Create(f);
                System.out.println("Entrou");
                break;
                /*
            case "deletar":
                c = guicliente.getCliente();
                daocliente.Remove(c);
                break;
                
            case "alterar":
                c = guicliente.getCliente();
                daocliente.Update(c);
                break;
                
            case "mostrar":
                int id;
                Cliente c = new Cliente();
                id = guicliente.getID();
                c = daocliente.Display(id);
                guicliente.setCliente(c);
                break;
*/
        }
    }
}
