package br.bel.SysApac.ui;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

/**
 * @author Belgrano
 * @Data 30/08/2017
 */
public class PainelRelatorioUI extends AbstractPanelUI{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @throws JRException 
	 * 
	 */
	public PainelRelatorioUI() throws JRException {
		super();
		// Compile jrxml file.
	       JasperReport jasperReport = JasperCompileManager.compileReport("C:/Users/Belgrano/Documents/Programação/dente/APAC/Ireport/OIA/apacImplanteTmp.jrxml");
	 
	       // Parameters for report
	       Map<String, Object> parameters = new HashMap<String, Object>();
	 
	       // DataSource
	       // This is simple example, no database.
	       // then using empty datasource.
	       JRDataSource dataSource = new JREmptyDataSource();
	 
	       JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,
	               parameters, dataSource);
	 
	    
	       // Make sure the output directory exists.
	       File outDir = new File("C:/jasperoutput");
	       outDir.mkdirs();
	 
	       // Export to PDF.
	       JasperExportManager.exportReportToPdfFile(jasperPrint,
	               "C:/jasperoutput/StyledTextReport.pdf");
	        
	       System.out.println("Done!");
	}
}
