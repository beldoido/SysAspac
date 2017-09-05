package br.bel.SysApac.ui;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import br.bel.SysApac.controladores.interfaces.IntPreencheRelatorio;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;


/**
 * @author Belgrano
 * @Data 02/08/2017
 */
public class RelatorioPrimeiraParteUI extends AbstractPanelUI{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel painelBordaFormulario;
	private JPanel painelFormulario;
	private JPanel paineiDivisoriaSolicitante;
	private JLabel label;
	private JTextField txtNomeEstabelecimento;
	private JTextField txtCns;
	private JTextField txtNomeMae;
	private JTextField txtNomePaciente;
	private JPanel painelDivisoriaPaciente;
	private JLabel lblIdentificaoDoPaciente;
	private JTextField txtNomeProtuario;
	private JTextField txtDataNascimento;
	private JTextField txtRanca;
	private JTextField txtEtinia;
	private JTextField txtNumCelular;
	private JTextField txtNumTelContato;
	private JTextField txtNomeResponsavel;
	private JTextField txtEndereco;
	private JTextField txtMunicipio;
	private JTextField txtCodIBJE;
	private JTextField txtUF;
	private JTextField txtCEP;
	private JPanel painelDivisoriaSolicitado;
	private JLabel lblPprroocceeddiimmeennttooSsoSloicliitcaitdaodo;
	private JTextField txtCodProcedimentoPrincipal;
	private JTextField txtServico;
	private JTextField txtClass;
	private JTextField txtNomeProcedimentoPrincipal;
	private JTextField txtQtde;
	private JPanel painelDivisoriaProcedimentoSecundarios;
	private JLabel painelDivisoriaSolicitadoSecundario;
	private JTextField txtCodProcedimentoSecundario01;
	private JTextField txtQtdeSegundario01;
	private JPanel painelTitulo;
	private JLabel lblTitulo;
	private JTextField txtNomeProcedimentoSecundario01;
	private JTextField txtCodProcedimentoSecundario04;
	private JTextField txtNomeProcedimentoSecundario04;
	private JTextField txtQtdeSegundario04;
	private JTextField txtCodProcedimentoSecundario02;
	private JTextField txtNomeProcedimentoSecundario02;
	private JTextField txtQtdeSegundario02;
	private JTextField txtCodProcedimentoSecundario05;
	private JTextField txtNomeProcedimentoSecundario05;
	private JTextField txtQtdeSegundario05;
	private JTextField txtCodProcedimentoSecundario03;
	private JTextField txtNomeProcedimentoSecundario03;
	private JTextField txtQtdeSegundario03;
	private JPanel painelDivisoriaBotoes;
	private JPanel panel;
	private IntPreencheRelatorio controlePainel;
	private JPanel painelIdentificacaoDoPaciente;
	private JPanel painelProcedimentoSolicitado;
	private JPanel painelProcedimentoSecundarios;
	private JPanel painelAcaos;
	private JPanel panel_1;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private ButtonGroup buttonGroup;
	/**
	 * 
	 */
	private RelatorioPrimeiraParteUI() {
		super();
		setBackground(Color.WHITE);
	}
	public RelatorioPrimeiraParteUI(IntPreencheRelatorio controlePainel){
		this();
		this.controlePainel = controlePainel;
	}
	/* (non-Javadoc)
	 * @see br.bel.SysApac.ui.AbstractPanelUI#ini()
	 */
	@Override
	protected void ini() {
		super.ini();
		
		painelBordaFormulario = new JPanel();
		painelBordaFormulario.setBorder(new LineBorder(new Color(0, 51, 153), 2, true));
		painelBordaFormulario.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(painelBordaFormulario, GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(painelBordaFormulario, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		painelFormulario = new JPanel();
		painelFormulario.setBorder(new LineBorder(new Color(0, 51, 153)));
		painelFormulario.setBackground(Color.WHITE);
		
		painelTitulo = new JPanel();
		painelTitulo.setBackground(Color.WHITE);
		
		lblTitulo = new JLabel("");
		lblTitulo.setIcon(new ImageIcon(RelatorioPrimeiraParteUI.class.getResource("/br/bel/SysApac/resouces/tituloAPAC.png")));
		painelTitulo.add(lblTitulo);
		
		JPanel panelIdentificacaoDoEstabelecimento = new JPanel();
		panelIdentificacaoDoEstabelecimento.setBackground(Color.WHITE);
		
		paineiDivisoriaSolicitante = new JPanel();
		paineiDivisoriaSolicitante.setBackground(new Color(0, 51, 153));
		
		label = new JLabel("IDENTIFICAÇÃO DO ESTABELECIMENTO DE SAÚDE (SOLICITANTE)");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Arial", Font.BOLD, 13));
		paineiDivisoriaSolicitante.add(label);
		
		txtNomeEstabelecimento = new JTextField();
		txtNomeEstabelecimento.setColumns(10);
		txtNomeEstabelecimento.setBorder(BorderFactory.createTitledBorder("NOME DO ESTABELECIMENTO DE SAÚDE SOLICITANTE"));
		
		txtCns = new JTextField();
		txtCns.setColumns(10);
		txtCns.setBorder(BorderFactory.createTitledBorder(null, "CNES", TitledBorder.CENTER,TitledBorder.TOP));
		GroupLayout gl_panelIdentificacaoDoEstabelecimento = new GroupLayout(panelIdentificacaoDoEstabelecimento);
		gl_panelIdentificacaoDoEstabelecimento.setHorizontalGroup(
			gl_panelIdentificacaoDoEstabelecimento.createParallelGroup(Alignment.LEADING)
				.addComponent(paineiDivisoriaSolicitante, GroupLayout.DEFAULT_SIZE, 1230, Short.MAX_VALUE)
				.addGroup(gl_panelIdentificacaoDoEstabelecimento.createSequentialGroup()
					.addGap(10)
					.addComponent(txtNomeEstabelecimento, GroupLayout.DEFAULT_SIZE, 1014, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(txtCns, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
					.addGap(22))
		);
		gl_panelIdentificacaoDoEstabelecimento.setVerticalGroup(
			gl_panelIdentificacaoDoEstabelecimento.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelIdentificacaoDoEstabelecimento.createSequentialGroup()
					.addComponent(paineiDivisoriaSolicitante, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_panelIdentificacaoDoEstabelecimento.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNomeEstabelecimento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCns, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(5, Short.MAX_VALUE))
		);
		panelIdentificacaoDoEstabelecimento.setLayout(gl_panelIdentificacaoDoEstabelecimento);
		
		painelIdentificacaoDoPaciente = new JPanel();
		painelIdentificacaoDoPaciente.setBackground(Color.WHITE);
		
		txtMunicipio = new JTextField();
		txtMunicipio.setColumns(10);
		txtMunicipio.setBorder(BorderFactory.createTitledBorder("MUNICÍPIO DE RESIDÊNCIA"));
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBorder(BorderFactory.createTitledBorder("ENDEREÇO (RUA, Nº, BAIRRO)"));
		
		txtNomeMae = new JTextField();
		txtNomeMae.setColumns(10);
		txtNomeMae.setBorder(BorderFactory.createTitledBorder("NOME DA MÃE"));
		
		txtNomePaciente = new JTextField();
		txtNomePaciente.setColumns(10);
		txtNomePaciente.setBorder(BorderFactory.createTitledBorder("NOME DO PACIENTE"));
		
		txtNomeResponsavel = new JTextField();
		txtNomeResponsavel.setColumns(10);
		txtNomeResponsavel.setBorder(BorderFactory.createTitledBorder("NOME DO RESPONSÁVEL"));
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setColumns(10);
		txtDataNascimento.setBorder(BorderFactory.createTitledBorder(null, "DATA DE NASCIMENTO", TitledBorder.CENTER,TitledBorder.TOP));
		
		JPanel painelSexo = new JPanel();
		painelSexo.setBackground(Color.WHITE);
		painelSexo.setBorder(new TitledBorder(null, "Sexo", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		buttonGroup = new ButtonGroup();
		JRadioButton rdbtnMasculino = new JRadioButton("Masc.");
		buttonGroup.add(rdbtnMasculino);
		rdbtnMasculino.setMnemonic('M');
		rdbtnMasculino.setBackground(Color.WHITE);
		painelSexo.add(rdbtnMasculino);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Fem");
		buttonGroup.add(rdbtnFeminino);
		rdbtnFeminino.setMnemonic('F');
		rdbtnFeminino.setBackground(Color.WHITE);
		painelSexo.add(rdbtnFeminino);
		
		txtEtinia = new JTextField();
		txtEtinia.setColumns(10);
		txtEtinia.setBorder(BorderFactory.createTitledBorder(null, "ETINIA", TitledBorder.CENTER,TitledBorder.TOP));
		
		painelDivisoriaPaciente = new JPanel();
		painelDivisoriaPaciente.setBackground(new Color(0, 51, 153));
		
		lblIdentificaoDoPaciente = new JLabel("IDENTIFICAÇÃO DO PACIENTE");
		lblIdentificaoDoPaciente.setForeground(Color.WHITE);
		lblIdentificaoDoPaciente.setFont(new Font("Arial", Font.BOLD, 13));
		painelDivisoriaPaciente.add(lblIdentificaoDoPaciente);
		
		txtNomeProtuario = new JTextField();
		txtNomeProtuario.setColumns(10);
		txtNomeProtuario.setBorder(BorderFactory.createTitledBorder(null, "Nº DO PROTUÁRIO", TitledBorder.CENTER,TitledBorder.TOP));
		
		txtRanca = new JTextField();
		txtRanca.setColumns(10);
		txtRanca.setBorder(BorderFactory.createTitledBorder(null, "RAÇA", TitledBorder.CENTER,TitledBorder.TOP));
		
		txtNumTelContato = new JTextField();
		txtNumTelContato.setColumns(10);
		txtNumTelContato.setBorder(BorderFactory.createTitledBorder(null, "TELEFONE DE CONTATO", TitledBorder.CENTER,TitledBorder.TOP));
		
		txtNumCelular = new JTextField();
		txtNumCelular.setColumns(10);
		txtNumCelular.setBorder(BorderFactory.createTitledBorder(null, "TELEFONE CELULAR", TitledBorder.CENTER,TitledBorder.TOP));
		
		txtCodIBJE = new JTextField();
		txtCodIBJE.setColumns(10);
		txtCodIBJE.setBorder(BorderFactory.createTitledBorder(null, "CÓD. IBGE MUNICÍPIO", TitledBorder.CENTER,TitledBorder.TOP));
		
		txtUF = new JTextField();
		txtUF.setColumns(10);
		txtUF.setBorder(BorderFactory.createTitledBorder(null, "UF", TitledBorder.CENTER,TitledBorder.TOP));
		
		txtCEP = new JTextField();
		txtCEP.setColumns(10);
		txtCEP.setBorder(BorderFactory.createTitledBorder(null, "CEP", TitledBorder.CENTER,TitledBorder.TOP));
		
		painelProcedimentoSolicitado = new JPanel();
		painelProcedimentoSolicitado.setBackground(Color.WHITE);
		
		txtCodProcedimentoPrincipal = new JTextField();
		txtCodProcedimentoPrincipal.setColumns(10);
		txtCodProcedimentoPrincipal.setBorder(BorderFactory.createTitledBorder("CÓDIGO DO PROCEDIMENTO PRINCIPAL"));
		
		txtServico = new JTextField();
		txtServico.setColumns(10);
		txtServico.setBorder(BorderFactory.createTitledBorder(null, "SERVIÇO", TitledBorder.CENTER,TitledBorder.TOP));
		
		txtClass = new JTextField();
		txtClass.setColumns(10);
		txtClass.setBorder(BorderFactory.createTitledBorder(null, "CLASS", TitledBorder.CENTER,TitledBorder.TOP));
		
		txtNomeProcedimentoPrincipal = new JTextField();
		txtNomeProcedimentoPrincipal.setColumns(10);
		txtNomeProcedimentoPrincipal.setBorder(BorderFactory.createTitledBorder("NOME DO PROCEDIMENTO PRINCIPAL"));
		
		txtQtde = new JTextField();
		txtQtde.setColumns(10);
		txtQtde.setBorder(BorderFactory.createTitledBorder(null, "QTDE", TitledBorder.CENTER,TitledBorder.TOP));
		
		painelDivisoriaSolicitado = new JPanel();
		painelDivisoriaSolicitado.setBackground(new Color(0, 51, 153));
		
		lblPprroocceeddiimmeennttooSsoSloicliitcaitdaodo = new JLabel("PROCEDIMENTO SOLICITADO");
		lblPprroocceeddiimmeennttooSsoSloicliitcaitdaodo.setForeground(Color.WHITE);
		lblPprroocceeddiimmeennttooSsoSloicliitcaitdaodo.setFont(new Font("Arial", Font.BOLD, 13));
		painelDivisoriaSolicitado.add(lblPprroocceeddiimmeennttooSsoSloicliitcaitdaodo);
		GroupLayout gl_painelProcedimentoSolicitado = new GroupLayout(painelProcedimentoSolicitado);
		gl_painelProcedimentoSolicitado.setHorizontalGroup(
			gl_painelProcedimentoSolicitado.createParallelGroup(Alignment.LEADING)
				.addComponent(painelDivisoriaSolicitado, GroupLayout.DEFAULT_SIZE, 1230, Short.MAX_VALUE)
				.addGroup(gl_painelProcedimentoSolicitado.createSequentialGroup()
					.addGap(10)
					.addComponent(txtCodProcedimentoPrincipal, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(txtServico, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
					.addGap(3)
					.addComponent(txtClass, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
					.addGap(11)
					.addComponent(txtNomeProcedimentoPrincipal, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(txtQtde, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
					.addGap(22))
		);
		gl_painelProcedimentoSolicitado.setVerticalGroup(
			gl_painelProcedimentoSolicitado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelProcedimentoSolicitado.createSequentialGroup()
					.addComponent(painelDivisoriaSolicitado, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_painelProcedimentoSolicitado.createParallelGroup(Alignment.LEADING)
						.addComponent(txtCodProcedimentoPrincipal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtServico, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtClass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNomeProcedimentoPrincipal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtQtde, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(7, Short.MAX_VALUE))
		);
		painelProcedimentoSolicitado.setLayout(gl_painelProcedimentoSolicitado);
		
		painelProcedimentoSecundarios = new JPanel();
		painelProcedimentoSecundarios.setBackground(Color.WHITE);
		
		txtCodProcedimentoSecundario01 = new JTextField();
		txtCodProcedimentoSecundario01.setColumns(10);
		txtCodProcedimentoSecundario01.setBorder(BorderFactory.createTitledBorder("CÓDIGO DO PROCEDIMENTO SECUNDÁRIO"));
		
		txtCodProcedimentoSecundario02 = new JTextField();
		txtCodProcedimentoSecundario02.setColumns(10);
		txtCodProcedimentoSecundario02.setBorder(BorderFactory.createTitledBorder("CÓDIGO DO PROCEDIMENTO SECUNDÁRIO"));
		
		txtCodProcedimentoSecundario03 = new JTextField();
		txtCodProcedimentoSecundario03.setColumns(10);
		txtCodProcedimentoSecundario03.setBorder(BorderFactory.createTitledBorder("CÓDIGO DO PROCEDIMENTO SECUNDÁRIO"));
		
		txtNomeProcedimentoSecundario03 = new JTextField();
		txtNomeProcedimentoSecundario03.setColumns(10);
		txtNomeProcedimentoSecundario03.setBorder(BorderFactory.createTitledBorder("NOME DO PROCEDIMENTO SECUNDÁRIO"));
		
		txtNomeProcedimentoSecundario02 = new JTextField();
		txtNomeProcedimentoSecundario02.setColumns(10);
		txtNomeProcedimentoSecundario02.setBorder(BorderFactory.createTitledBorder("NOME DO PROCEDIMENTO SECUNDÁRIO"));
		
		txtNomeProcedimentoSecundario01 = new JTextField();
		txtNomeProcedimentoSecundario01.setColumns(10);
		txtNomeProcedimentoSecundario01.setBorder(BorderFactory.createTitledBorder("NOME DO PROCEDIMENTO SECUNDÁRIO"));
		
		txtQtdeSegundario01 = new JTextField();
		txtQtdeSegundario01.setColumns(10);
		txtQtdeSegundario01.setBorder(BorderFactory.createTitledBorder(null, "QTDE", TitledBorder.CENTER,TitledBorder.TOP));
		
		txtQtdeSegundario02 = new JTextField();
		txtQtdeSegundario02.setColumns(10);
		txtQtdeSegundario02.setBorder(BorderFactory.createTitledBorder(null, "QTDE", TitledBorder.CENTER,TitledBorder.TOP));
		
		txtQtdeSegundario03 = new JTextField();
		txtQtdeSegundario03.setColumns(10);
		txtQtdeSegundario03.setBorder(BorderFactory.createTitledBorder(null, "QTDE", TitledBorder.CENTER,TitledBorder.TOP));
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		txtCodProcedimentoSecundario05 = new JTextField();
		txtCodProcedimentoSecundario05.setColumns(10);
		txtCodProcedimentoSecundario05.setBorder(BorderFactory.createTitledBorder("CÓDIGO DO PROCEDIMENTO SECUNDÁRIO"));
		
		txtCodProcedimentoSecundario04 = new JTextField();
		txtCodProcedimentoSecundario04.setColumns(10);
		txtCodProcedimentoSecundario04.setBorder(BorderFactory.createTitledBorder("CÓDIGO DO PROCEDIMENTO SECUNDÁRIO"));
		
		txtNomeProcedimentoSecundario04 = new JTextField();
		txtNomeProcedimentoSecundario04.setColumns(10);
		txtNomeProcedimentoSecundario04.setBorder(BorderFactory.createTitledBorder("NOME DO PROCEDIMENTO SECUNDÁRIO"));
		
		txtNomeProcedimentoSecundario05 = new JTextField();
		txtNomeProcedimentoSecundario05.setColumns(10);
		txtNomeProcedimentoSecundario05.setBorder(BorderFactory.createTitledBorder("NOME DO PROCEDIMENTO SECUNDÁRIO"));
		
		txtQtdeSegundario05 = new JTextField();
		txtQtdeSegundario05.setColumns(10);
		txtQtdeSegundario05.setBorder(BorderFactory.createTitledBorder(null, "QTDE", TitledBorder.CENTER,TitledBorder.TOP));
		
		txtQtdeSegundario04 = new JTextField();
		txtQtdeSegundario04.setColumns(10);
		txtQtdeSegundario04.setBorder(BorderFactory.createTitledBorder(null, "QTDE", TitledBorder.CENTER,TitledBorder.TOP));
		
		painelDivisoriaProcedimentoSecundarios = new JPanel();
		painelDivisoriaProcedimentoSecundarios.setBackground(new Color(0, 51, 153));
		
		painelDivisoriaSolicitadoSecundario = new JLabel("PROCEDIMENTO(S) SECUNDÁRIO(S)");
		painelDivisoriaSolicitadoSecundario.setForeground(Color.WHITE);
		painelDivisoriaSolicitadoSecundario.setFont(new Font("Arial", Font.BOLD, 13));
		painelDivisoriaProcedimentoSecundarios.add(painelDivisoriaSolicitadoSecundario);
		GroupLayout gl_painelProcedimentoSecundarios = new GroupLayout(painelProcedimentoSecundarios);
		gl_painelProcedimentoSecundarios.setHorizontalGroup(
			gl_painelProcedimentoSecundarios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelProcedimentoSecundarios.createSequentialGroup()
					.addGap(13)
					.addComponent(txtCodProcedimentoSecundario01, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(txtNomeProcedimentoSecundario01, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(txtQtdeSegundario01, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
					.addGap(53)
					.addComponent(txtCodProcedimentoSecundario04, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(txtNomeProcedimentoSecundario04, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(txtQtdeSegundario04, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
					.addGap(22))
				.addComponent(painelDivisoriaProcedimentoSecundarios, GroupLayout.DEFAULT_SIZE, 1230, Short.MAX_VALUE)
				.addGroup(gl_painelProcedimentoSecundarios.createSequentialGroup()
					.addGap(13)
					.addGroup(gl_painelProcedimentoSecundarios.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_painelProcedimentoSecundarios.createSequentialGroup()
							.addComponent(txtCodProcedimentoSecundario02, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(txtNomeProcedimentoSecundario02, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(txtQtdeSegundario02, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
						.addGroup(gl_painelProcedimentoSecundarios.createSequentialGroup()
							.addComponent(txtCodProcedimentoSecundario03, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(txtNomeProcedimentoSecundario03, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtQtdeSegundario03, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
					.addGap(53)
					.addGroup(gl_painelProcedimentoSecundarios.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
						.addGroup(gl_painelProcedimentoSecundarios.createSequentialGroup()
							.addComponent(txtCodProcedimentoSecundario05, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(txtNomeProcedimentoSecundario05, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(txtQtdeSegundario05, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
					.addGap(22))
		);
		gl_painelProcedimentoSecundarios.setVerticalGroup(
			gl_painelProcedimentoSecundarios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelProcedimentoSecundarios.createSequentialGroup()
					.addComponent(painelDivisoriaProcedimentoSecundarios, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(15)
					.addGroup(gl_painelProcedimentoSecundarios.createParallelGroup(Alignment.LEADING)
						.addComponent(txtCodProcedimentoSecundario01, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNomeProcedimentoSecundario01, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtQtdeSegundario01, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCodProcedimentoSecundario04, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNomeProcedimentoSecundario04, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtQtdeSegundario04, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_painelProcedimentoSecundarios.createParallelGroup(Alignment.LEADING)
						.addComponent(txtCodProcedimentoSecundario02, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNomeProcedimentoSecundario02, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtQtdeSegundario02, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCodProcedimentoSecundario05, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNomeProcedimentoSecundario05, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtQtdeSegundario05, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_painelProcedimentoSecundarios.createParallelGroup(Alignment.LEADING)
						.addComponent(txtCodProcedimentoSecundario03, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_painelProcedimentoSecundarios.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtNomeProcedimentoSecundario03, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtQtdeSegundario03, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_painelProcedimentoSecundarios.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		painelProcedimentoSecundarios.setLayout(gl_painelProcedimentoSecundarios);
		
		painelAcaos = new JPanel();
		painelAcaos.setBackground(Color.WHITE);
		
		painelDivisoriaBotoes = new JPanel();
		painelDivisoriaBotoes.setBackground(new Color(0, 51, 153));
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		
		button = new JButton("Voltar");
		panel_1.add(button);
		
		button_1 = new JButton("Cancela");
		panel_1.add(button_1);
		
		button_2 = new JButton("Proxímo");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//controlePainel.AcaoBotaoProximo();
			}
		});
		panel_1.add(button_2);
		GroupLayout gl_painelAcaos = new GroupLayout(painelAcaos);
		gl_painelAcaos.setHorizontalGroup(
			gl_painelAcaos.createParallelGroup(Alignment.LEADING)
				.addComponent(painelDivisoriaBotoes, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1230, Short.MAX_VALUE)
				.addGroup(gl_painelAcaos.createSequentialGroup()
					.addGap(457)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
					.addGap(457))
		);
		gl_painelAcaos.setVerticalGroup(
			gl_painelAcaos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelAcaos.createSequentialGroup()
					.addComponent(painelDivisoriaBotoes, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		painelAcaos.setLayout(gl_painelAcaos);
		GroupLayout gl_painelFormulario = new GroupLayout(painelFormulario);
		gl_painelFormulario.setHorizontalGroup(
			gl_painelFormulario.createParallelGroup(Alignment.LEADING)
				.addComponent(panelIdentificacaoDoEstabelecimento, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(painelIdentificacaoDoPaciente, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(painelProcedimentoSolicitado, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(painelProcedimentoSecundarios, GroupLayout.DEFAULT_SIZE, 1230, Short.MAX_VALUE)
				.addComponent(painelAcaos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		gl_painelFormulario.setVerticalGroup(
			gl_painelFormulario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelFormulario.createSequentialGroup()
					.addComponent(panelIdentificacaoDoEstabelecimento, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
					.addComponent(painelIdentificacaoDoPaciente, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
					.addGap(1)
					.addComponent(painelProcedimentoSolicitado, GroupLayout.PREFERRED_SIZE, 82, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(painelProcedimentoSecundarios, GroupLayout.PREFERRED_SIZE, 159, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(painelAcaos, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		GroupLayout gl_painelIdentificacaoDoPaciente = new GroupLayout(painelIdentificacaoDoPaciente);
		gl_painelIdentificacaoDoPaciente.setHorizontalGroup(
			gl_painelIdentificacaoDoPaciente.createParallelGroup(Alignment.LEADING)
				.addComponent(painelDivisoriaPaciente, GroupLayout.DEFAULT_SIZE, 1230, Short.MAX_VALUE)
				.addGroup(gl_painelIdentificacaoDoPaciente.createSequentialGroup()
					.addGap(10)
					.addComponent(txtNomePaciente, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
					.addGap(3)
					.addComponent(txtDataNascimento, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(painelSexo, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(txtEtinia, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(txtNomeProtuario, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
					.addGap(22))
				.addGroup(gl_painelIdentificacaoDoPaciente.createSequentialGroup()
					.addGap(10)
					.addComponent(txtNomeMae, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
					.addGap(3)
					.addComponent(txtNomeResponsavel, GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
					.addGap(8)
					.addComponent(txtRanca, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
					.addGap(22))
				.addGroup(gl_painelIdentificacaoDoPaciente.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_painelIdentificacaoDoPaciente.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_painelIdentificacaoDoPaciente.createSequentialGroup()
							.addComponent(txtMunicipio, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
							.addGap(3)
							.addComponent(txtCodIBJE, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(txtUF, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_painelIdentificacaoDoPaciente.createSequentialGroup()
							.addComponent(txtEndereco, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
							.addGap(3)
							.addComponent(txtNumCelular, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)))
					.addGap(4)
					.addGroup(gl_painelIdentificacaoDoPaciente.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_painelIdentificacaoDoPaciente.createSequentialGroup()
							.addComponent(txtNumTelContato, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
							.addGap(22))
						.addGroup(gl_painelIdentificacaoDoPaciente.createSequentialGroup()
							.addComponent(txtCEP, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
							.addGap(21))))
		);
		gl_painelIdentificacaoDoPaciente.setVerticalGroup(
			gl_painelIdentificacaoDoPaciente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelIdentificacaoDoPaciente.createSequentialGroup()
					.addComponent(painelDivisoriaPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_painelIdentificacaoDoPaciente.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_painelIdentificacaoDoPaciente.createSequentialGroup()
							.addGap(11)
							.addComponent(txtNomePaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_painelIdentificacaoDoPaciente.createSequentialGroup()
							.addGap(11)
							.addComponent(txtDataNascimento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(painelSexo, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_painelIdentificacaoDoPaciente.createSequentialGroup()
							.addGap(11)
							.addComponent(txtEtinia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_painelIdentificacaoDoPaciente.createSequentialGroup()
							.addGap(11)
							.addComponent(txtNomeProtuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(1)
					.addGroup(gl_painelIdentificacaoDoPaciente.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNomeMae, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNomeResponsavel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtRanca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(1)
					.addGroup(gl_painelIdentificacaoDoPaciente.createParallelGroup(Alignment.LEADING)
						.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNumCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNumTelContato, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_painelIdentificacaoDoPaciente.createParallelGroup(Alignment.LEADING)
						.addComponent(txtUF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtMunicipio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCodIBJE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCEP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		painelIdentificacaoDoPaciente.setLayout(gl_painelIdentificacaoDoPaciente);
		painelFormulario.setLayout(gl_painelFormulario);
		GroupLayout gl_painelBordaFormulario = new GroupLayout(painelBordaFormulario);
		gl_painelBordaFormulario.setHorizontalGroup(
			gl_painelBordaFormulario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelBordaFormulario.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_painelBordaFormulario.createParallelGroup(Alignment.LEADING)
						.addComponent(painelTitulo, GroupLayout.DEFAULT_SIZE, 1232, Short.MAX_VALUE)
						.addComponent(painelFormulario, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(10))
		);
		gl_painelBordaFormulario.setVerticalGroup(
			gl_painelBordaFormulario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelBordaFormulario.createSequentialGroup()
					.addGap(5)
					.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(painelFormulario, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
					.addGap(8))
		);
		painelBordaFormulario.setLayout(gl_painelBordaFormulario);
		setLayout(groupLayout);
	}
}
