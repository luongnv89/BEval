/**
 * 
 */
package br.ufrn.forall.b2asm.beval.core;

import java.util.prefs.Preferences;

import javax.swing.JOptionPane;

/**
 * Class for manager preferences
 * 
 * 
 */
public class GeneralPreferences {

	private static final Preferences PREFERENCES = Preferences.userRoot().node("Forall");

	
	/**
	 * This class contains the preferences to verification:
	 *   - Parameters probcli
	 *   - Path probcli
	 */
	public GeneralPreferences() {
	}
	
	public static void updatePathFileB2llvm(String path){
		 GeneralPreferences.PREFERENCES.put("PathFileB2llvm", path);
	}
	
	public static String getPathFileB2llvm(String destinationfilePath){
		
		String res = GeneralPreferences.PREFERENCES.get("PathFileB2llvm", null);
		
		if (res==null || res.length()<=2) {
			res = destinationfilePath;
		}
			res = JOptionPane.showInputDialog(null,"Please, type the destination path of b2llvm:", res);
			
			updatePathFileB2llvm(res);
		
			
		 return res; 
	}
	
	public static void updatePathProbcli(String path){
		 GeneralPreferences.PREFERENCES.put("PathProbcli", path);
	}
	
	public static String getPathProbcli(){
		
		String res = GeneralPreferences.PREFERENCES.get("PathProbcli", null);
		
		if (res==null || res.length()<=2) {
			
			res = JOptionPane.showInputDialog(res+"- Type the path of binary probcli:", "");
			
			updatePathProbcli(res);
		}
			
		 return res; 
	}
	
	
	public static void updateActualParametersh(String actualParametersh){
		 GeneralPreferences.PREFERENCES.put("ActualParameters", actualParametersh);
	}
	
	public static String getActualParameters(){
		String res = GeneralPreferences.PREFERENCES.get("ActualParameters", null);
		
		if (res==null) {
			res= Installation.defaultParameters;
			updateActualParametersh(res);
		}
			
		 return res; 
	}
	
	
	
	
	

}
