package br.bel.SysApac.utils;

/**
 * @author Belgrano
 * @Data 05/09/2017
 */
public class FormularioUtil {
	/**
	 * 
	 */
	private FormularioUtil util;
	private FormularioUtil() {
		
	}
	public FormularioUtil getUtil()
	{
		if(util == null)
		{
			util = new FormularioUtil();
		}
		return util;
	}
	
}
