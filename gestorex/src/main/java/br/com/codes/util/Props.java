package br.com.codes.util;

import java.io.IOException;
import java.util.ResourceBundle;

public class Props {
	
	/**
	 * @return
	 * @throws IOException
	 */
	public static ResourceBundle getAppProps() throws IOException{
		ResourceBundle resources  = ResourceBundle.getBundle("application") ;
		return resources;
	}
	
	/**
	 * @return
	 * @throws IOException
	 */
	public static ResourceBundle getMessageProps() throws IOException{
		ResourceBundle resources  = ResourceBundle.getBundle("message") ;
		return resources;
	}
	
	/**
	 * @return
	 * @throws IOException
	 */
	public static ResourceBundle getMenuProperties() throws IOException{
		ResourceBundle resources  = ResourceBundle.getBundle("menu") ;
		return resources;
	}


}
