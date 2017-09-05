package br.bel.SysApac.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import br.bel.SysApac.controladores.interfaces.IntPrincipalUI;
import br.bel.SysApac.enums.AcaoMenuPainelPrincipal;

/**
 * @author Belgrano
 * @Data 02/08/2017
 */
public class PainelPrincipalUI extends AbstractPanelUI{
	
	IntPrincipalUI controlePainel;
	JButton btnNewButton;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	public PainelPrincipalUI() {
		super();
		setLayout(null);
	}
	public PainelPrincipalUI(IntPrincipalUI controlePainel)
	{
		super();
		this.controlePainel = controlePainel;
		init();
	}
	private void init(){
		initComponetes();
	}
	private void initComponetes(){
		btnNewButton = new JButton("Black");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlePainel.acaoMenu(AcaoMenuPainelPrincipal.ACAO_MENU_GERAR_RELATORIO);
			}
		});
		btnNewButton.setBounds(59, 175, 89, 23);
		this.add(btnNewButton);
	}
	
}
