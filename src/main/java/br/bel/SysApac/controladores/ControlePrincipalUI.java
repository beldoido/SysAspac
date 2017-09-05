package br.bel.SysApac.controladores;

import javax.swing.JPanel;

import br.bel.SysApac.controladores.interfaces.IntControleJFramePrincipal;
import br.bel.SysApac.controladores.interfaces.IntPrincipalUI;
import br.bel.SysApac.enums.AcaoMenuPainelPrincipal;
import br.bel.SysApac.ui.PainelPrincipalUI;

/**
 * @author Belgrano
 * @Data 02/08/2017
 */
public class ControlePrincipalUI extends AbstractControleUI implements IntPrincipalUI{

	private PainelPrincipalUI paiPrincipal;
	private IntControleJFramePrincipal controleJFramePrincipal;
	/**
	 * 
	 */
	public ControlePrincipalUI() {
		super();
		paiPrincipal = new PainelPrincipalUI(this);
	}
	public ControlePrincipalUI(IntControleJFramePrincipal controleJFramePrincipal) {
		this();
		this.controleJFramePrincipal = controleJFramePrincipal;
		
	}
	public void acaoMenu(AcaoMenuPainelPrincipal acaoMenuGerarRelatorio) {
		switch (acaoMenuGerarRelatorio) {
		case ACAO_MENU_GERAR_RELATORIO:
			ControleRelatorioUI controleRelatorioUI = new ControleRelatorioUI(controleJFramePrincipal);
			controleJFramePrincipal.setPainelCentral(controleRelatorioUI);
			break;

		default:
			break;
		}
		
	}
	public JPanel getPainel(){
		return paiPrincipal;
	}
	
	
}
