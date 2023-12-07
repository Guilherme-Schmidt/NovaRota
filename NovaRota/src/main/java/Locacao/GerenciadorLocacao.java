/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Locacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author USUARIO
 */
public class GerenciadorLocacao implements ActionListener {
    private GUILocacao guilocacao;
    private DAOLocacao daolocacao;
    private Locacao l;
  
    public GerenciadorLocacao(){
        guilocacao = new GUILocacao();
        guilocacao.addListener(this);
        daolocacao = new DAOLocacao();
        l = new Locacao();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botaopressionado = (JButton)e.getSource();
        String opc = botaopressionado.getName();
          
        switch(opc){
            case "cadastrar":
                l = guilocacao.getLocacao();
                daolocacao.Create(l);
                guilocacao.limpar();
                break;                 
            case "deletar":
                int idLoc = guilocacao.getID();
                daolocacao.Remove(idLoc);
                guilocacao.limpar();
                break;
            case "mostrar":
                guilocacao.consultar();
                break;
        }
    }
}
