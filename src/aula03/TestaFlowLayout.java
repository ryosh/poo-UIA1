/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 1714290026
 */
public class TestaFlowLayout {
    public static void main(String[] args) {
        
        JPanel painel1 = new JPanel();
        painel1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        JPanel painel2 = new JPanel();
        painel2.setBorder(BorderFactory.createLineBorder(Color.RED));
        JPanel painel3 = new JPanel();
        painel3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JPanel painel4 = new JPanel();
        painel4.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        JPanel painel5 = new JPanel();
        painel5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel painel6 = new JPanel();
        painel6.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        JPanel painel7 = new JPanel();
        painel7.setBorder(BorderFactory.createLineBorder(Color.RED));
        JPanel painel8 = new JPanel();
        painel8.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JPanel painel9 = new JPanel();
        painel9.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        JPanel painel10 = new JPanel();
        painel10.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        FlowLayout leiaute = new FlowLayout(FlowLayout.RIGHT);
        
        JPanel conteiner = new JPanel();
        conteiner.setLayout(leiaute);
        conteiner.add(painel1);
        conteiner.add(painel2);
        conteiner.add(painel3);
        conteiner.add(painel4);
        conteiner.add(painel5);
        conteiner.add(painel6);
        conteiner.add(painel7);
        conteiner.add(painel8);
        conteiner.add(painel9);
        conteiner.add(painel10);
        
        JFrame janela = new JFrame();
        janela.add(conteiner);
        janela.setSize(150, 500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
