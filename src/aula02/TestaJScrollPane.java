/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author 1714290026
 */
public class TestaJScrollPane {
    public static void main(String[] args) {
        JPanel painel = new JPanel();
        painel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        painel.setPreferredSize(new Dimension(400,600));
        
        JScrollPane painelRolagem = new JScrollPane();
        painelRolagem.setViewportView(painel);
        
        JFrame janela = new JFrame();
        janela.add(painelRolagem);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
