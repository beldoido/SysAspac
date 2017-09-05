package br.bel.SysApac.controladores;

import javax.swing.JPanel;

import br.bel.SysApac.controladores.interfaces.IntControleJFramePrincipal;
import br.bel.SysApac.controladores.interfaces.IntPreencheRelatorio;
import br.bel.SysApac.enums.AcaoMenuPainelPrincipal;
import br.bel.SysApac.ui.RelatorioPrimeiraParteUI;
import br.bel.SysApac.ui.RelatorioSegundaParteUI;

/**
 * @author Belgrano
 * @Data 02/08/2017
 */
public class ControleRelatorioUI extends AbstractControleUI implements IntPreencheRelatorio{

	private JPanel relatorioUI;
	private IntControleJFramePrincipal controleJFramePrincipal;
	/**
	 * 
	 */
	private ControleRelatorioUI() {
		super();
		relatorioUI = new RelatorioPrimeiraParteUI(this);
	}
	public ControleRelatorioUI(IntControleJFramePrincipal controleJFramePrincipal)
	{
		this();
		this.controleJFramePrincipal = controleJFramePrincipal;
	}
	
	/* (non-Javadoc)
	 * @see br.bel.SysApac.controladores.interfaces.IntControleUI#acaoMenu(br.bel.SysApac.enums.AcaoMenuPainelPrincipal)
	 */
	public void acaoMenu(AcaoMenuPainelPrincipal acaoMenuGerarRelatorio) {
		// TODO Auto-generated method stub
		
		
	}

	/* (non-Javadoc)
	 * @see br.bel.SysApac.controladores.interfaces.IntControleUI#getPainel()
	 */
	public JPanel getPainel() {
		return relatorioUI;
	}
	private void setPainel(JPanel relatorioUI) {
		this.relatorioUI = relatorioUI;
	}
	/* (non-Javadoc)
	 * @see br.bel.SysApac.controladores.interfaces.IntPreencheRelatorio#Proximo()
	 */
	public void Proximo() {
		setPainel(new RelatorioSegundaParteUI());
		controleJFramePrincipal.setPainelCentral(this);
	}
	
}
