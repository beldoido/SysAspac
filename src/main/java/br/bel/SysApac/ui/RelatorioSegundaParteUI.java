package br.bel.SysApac.ui;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JRViewer;


/**
 * @author Belgrano
 * @Data 02/08/2017
 */
public class RelatorioSegundaParteUI extends AbstractPanelUI{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel painelBordaFormulario;
	private JPanel painelFormulario;
	private JPanel paineiDivisoriaSolicitante;
	private JLabel lblJustificativaDosProcedimentos;
	private JTextArea txtMunicipio;
	private JPanel panel_3;
	private JLabel lblNewLabel;
	private JPanel panel_4;
	private JButton btnNewButton;
	private JButton btnProximo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblSolicitao;
	private JTextField txtNomeSolicitanteProficional;
	private JTextField txtDataSolicitacao;
	private JTextField txtCartaoNacionalSaudeProfSolicitante;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtCartaoNacionalSaudeProfAutorizador;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JPanel panel_7;
	private JPanel panel_8;
	private JLabel lblIdentificaoDoEstabelecimento;
	private JTextField textField_9;
	private JTextField textField_10;
	private JPanel panel_9;
	private JPanel panel_10;

	/**
	 * 
	 */
	public RelatorioSegundaParteUI() {
		super();
		setBackground(Color.WHITE);
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
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(RelatorioSegundaParteUI.class.getResource("/br/bel/SysApac/resouces/tituloAPAC.png")));
		panel_3.add(lblNewLabel);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 51, 153));
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		txtMunicipio = new JTextArea();
		txtMunicipio.setColumns(10);
		txtMunicipio.setBorder(BorderFactory.createTitledBorder("OBSERVAÇÕES"));
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBorder(BorderFactory.createTitledBorder("NOME DO PACIENTE"));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(BorderFactory.createTitledBorder(null, "CID10 PRINCIPAL", TitledBorder.CENTER,TitledBorder.TOP));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(BorderFactory.createTitledBorder(null, "CID10 SECUNDÁRIO", TitledBorder.CENTER,TitledBorder.TOP));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(BorderFactory.createTitledBorder(null, "CID10 CAUSAS ASSOCIADAS", TitledBorder.CENTER,TitledBorder.TOP));
		
		paineiDivisoriaSolicitante = new JPanel();
		paineiDivisoriaSolicitante.setBackground(new Color(0, 51, 153));
		
		lblJustificativaDosProcedimentos = new JLabel("JUSTIFICATIVA DO(S) PROCEDIMENTO(S) SOLICITADO(S)");
		lblJustificativaDosProcedimentos.setForeground(Color.WHITE);
		lblJustificativaDosProcedimentos.setFont(new Font("Arial", Font.BOLD, 13));
		paineiDivisoriaSolicitante.add(lblJustificativaDosProcedimentos);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(paineiDivisoriaSolicitante, GroupLayout.DEFAULT_SIZE, 1230, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(22)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
					.addGap(4)
					.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(22)
					.addComponent(txtMunicipio, GroupLayout.DEFAULT_SIZE, 1198, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(paineiDivisoriaSolicitante, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addComponent(txtMunicipio, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(11, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 51, 153));
		
		lblSolicitao = new JLabel("SOLICITAÇÃO");
		lblSolicitao.setForeground(Color.WHITE);
		lblSolicitao.setFont(new Font("Arial", Font.BOLD, 13));
		panel_2.add(lblSolicitao);
		
		txtNomeSolicitanteProficional = new JTextField();
		txtNomeSolicitanteProficional.setColumns(10);
		txtNomeSolicitanteProficional.setBorder(BorderFactory.createTitledBorder("NOME DO PROFISSIONAL SOLICITANTE"));
		
		txtDataSolicitacao = new JTextField();
		txtDataSolicitacao.setColumns(10);
		txtDataSolicitacao.setBorder(BorderFactory.createTitledBorder(null, "DATA DA SOLICITAÇÃO", TitledBorder.CENTER,TitledBorder.TOP));
		
		txtCartaoNacionalSaudeProfSolicitante = new JTextField();
		txtCartaoNacionalSaudeProfSolicitante.setColumns(10);
		txtCartaoNacionalSaudeProfSolicitante.setBorder(BorderFactory.createTitledBorder(null, "CARTÃO NACIONAL DE SAÚDE DO PROFISSIONAL SOLICITANTE", TitledBorder.CENTER,TitledBorder.TOP));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 1220, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(22)
					.addComponent(txtNomeSolicitanteProficional, GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(txtDataSolicitacao, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(txtCartaoNacionalSaudeProfSolicitante, GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNomeSolicitanteProficional, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDataSolicitacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCartaoNacionalSaudeProfSolicitante, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(9, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 51, 153));
		
		JLabel lblAutorizao = new JLabel("AUTORIZAÇÃO");
		lblAutorizao.setForeground(Color.WHITE);
		lblAutorizao.setFont(new Font("Arial", Font.BOLD, 13));
		panel_6.add(lblAutorizao);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBorder(BorderFactory.createTitledBorder("NOME DO PROFISSIONAL AUTORIZADOR"));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBorder(BorderFactory.createTitledBorder(null, "CÓD. ÓRGÃO EMISSOR", TitledBorder.CENTER,TitledBorder.TOP));
		
		txtCartaoNacionalSaudeProfAutorizador = new JTextField();
		txtCartaoNacionalSaudeProfAutorizador.setColumns(10);
		txtCartaoNacionalSaudeProfAutorizador.setBorder(BorderFactory.createTitledBorder(null, "CARTÃO NACIONAL DE SAÚDE DO PROFISSIONAL AUTORIZADOR", TitledBorder.CENTER,TitledBorder.TOP));
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBorder(BorderFactory.createTitledBorder(null, "DATA DA AUTORIZAÇÃO", TitledBorder.CENTER,TitledBorder.TOP));
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBorder(BorderFactory.createTitledBorder(null, "Nº DA AUTORIZAÇÃO (APAC)", TitledBorder.CENTER,TitledBorder.TOP));
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBorder(BorderFactory.createTitledBorder(null, "PERÍODO DE VALIDADE DA APAC", TitledBorder.CENTER,TitledBorder.TOP));
		
		panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 1220, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(22)
					.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(txtCartaoNacionalSaudeProfAutorizador, GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(22)
					.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_10, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
					.addGap(14))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCartaoNacionalSaudeProfAutorizador, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		
		panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		
		panel_8 = new JPanel();
		panel_8.setBackground(new Color(0, 51, 153));
		
		lblIdentificaoDoEstabelecimento = new JLabel("IDENTIFICAÇÃO DO ESTABELECIMENTO DE SAÚDE (EXECUTANTE)");
		lblIdentificaoDoEstabelecimento.setForeground(Color.WHITE);
		lblIdentificaoDoEstabelecimento.setFont(new Font("Arial", Font.BOLD, 13));
		panel_8.add(lblIdentificaoDoEstabelecimento);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBorder(BorderFactory.createTitledBorder("NOME FANTASIA DO ESTABELECIMENTO DE SAÚDE EXECUTANTE"));
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBorder(BorderFactory.createTitledBorder(null, "CNES", TitledBorder.CENTER,TitledBorder.TOP));
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_8, GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE)
						.addGroup(gl_panel_7.createSequentialGroup()
							.addGap(22)
							.addComponent(textField_9, GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_10, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
							.addGap(10)))
					.addGap(0))
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(10, Short.MAX_VALUE))
		);
		panel_7.setLayout(gl_panel_7);
		GroupLayout gl_painelBordaFormulario = new GroupLayout(painelBordaFormulario);
		gl_painelBordaFormulario.setHorizontalGroup(
			gl_painelBordaFormulario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelBordaFormulario.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_painelBordaFormulario.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1232, Short.MAX_VALUE)
						.addComponent(painelFormulario, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(10))
		);
		gl_painelBordaFormulario.setVerticalGroup(
			gl_painelBordaFormulario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelBordaFormulario.createSequentialGroup()
					.addGap(5)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(painelFormulario, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(11))
		);
		
		panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		
		btnNewButton = new JButton("Voltar");
		panel_9.add(btnNewButton);
		
		JButton button = new JButton("Cancela");
		panel_9.add(button);
		
		btnProximo = new JButton("Proxímo");
		panel_9.add(btnProximo);
		GroupLayout gl_painelFormulario = new GroupLayout(painelFormulario);
		gl_painelFormulario.setHorizontalGroup(
			gl_painelFormulario.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 1230, Short.MAX_VALUE)
				.addGroup(gl_painelFormulario.createSequentialGroup()
					.addGap(457)
					.addComponent(panel_9, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
					.addGap(457))
				.addGroup(Alignment.LEADING, gl_painelFormulario.createSequentialGroup()
					.addGroup(gl_painelFormulario.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE)
						.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(gl_painelFormulario.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_painelFormulario.setVerticalGroup(
			gl_painelFormulario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelFormulario.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(3)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGap(14))
		);
		painelFormulario.setLayout(gl_painelFormulario);
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		painelBordaFormulario.setLayout(gl_painelBordaFormulario);
		setLayout(groupLayout);
	}
}
