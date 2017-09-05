
package br.bel.SysApac.controladores;

import br.bel.SysApac.controladores.interfaces.IntControleUI;
import br.bel.SysApac.ui.JanelaPrincipal;


/**
 * @author Belgrano
 * @Data 29/07/2017
 */
public class ControleJanelaPrincipalImpl extends AbstractControleFrame{
	JanelaPrincipal janelaPrincipal;
	/**
	 * 
	 */
	public void start() {
		janelaPrincipal = new JanelaPrincipal(this);
		
		ControlePrincipalUI conPrincipalUI = new ControlePrincipalUI(this);
		janelaPrincipal.setPainelCentral(conPrincipalUI.getPainel());
		janelaPrincipal.setVisible(true);
	}

	/* (non-Javadoc)
	 * @see br.bel.SysApac.controladores.interfaces.IntControleJFramePrincipal#setPainelCentral(br.bel.SysApac.controladores.ControleRelatorioUI)
	 */
	public void setPainelCentral(IntControleUI controleUI) {
		// TODO Auto-generated method stub
		janelaPrincipal.setPainelCentral(controleUI.getPainel());
		
	}
	
}
