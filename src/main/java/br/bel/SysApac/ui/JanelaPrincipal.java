package br.bel.SysApac.ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import br.bel.SysApac.controladores.interfaces.IntControleJFramePrincipal;

/**
 * @author Belgrano
 * @Data 26/07/2017
 */
public class JanelaPrincipal extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JanelaPrincipal(IntControleJFramePrincipal controleJanela) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1296, 758);
		getContentPane().setLayout(new BorderLayout(0, 0));
	}
	
	public void setPainelCentral(JPanel painelCentral){
		this.setContentPane(painelCentral);
		this.repaint();
		this.setVisible(true);
	}
}
