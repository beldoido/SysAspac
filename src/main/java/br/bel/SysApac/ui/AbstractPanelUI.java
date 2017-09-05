package br.bel.SysApac.ui;

import javax.swing.JPanel;

/**
 * @author Belgrano
 * @Data 02/08/2017
 */
public abstract class AbstractPanelUI extends JPanel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

/**
 * 
 */
public AbstractPanelUI() {
	this.setBounds(0, 0, 1280, 720);
	setLayout(null);
	ini();
}
/**
 * 
 */
protected void ini() {

}
}
