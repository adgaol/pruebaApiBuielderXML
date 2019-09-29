package pruebaapiascendente;

import java.io.FileWriter;
import java.io.PrintWriter;
/**
*/
public class Analizador{
    private static String cadena;
    public static void setChain(String chain){
        cadena=chain;
    } 
    public static String getChain(){
        return cadena;
    } 
public static void main(String args[]) {
        
        setChain(args[0]);
	if (args.length == 0) {
		System.out.println("Inserta nombre de archivo\n"+"( Usage : java Analizador <inputfile> )");
	} else {
		for (int i = 0; i < args.length; i++) {
			analizador_lexico lexico = null;
			try {
				lexico = new analizador_lexico( new java.io.FileReader(args[i]));
				parser sintactico = new parser(lexico);
				sintactico.parse();
                                
				FileWriter fileWriter = new FileWriter(args[i].substring(0, args[i].length()-2)+".pas");
				PrintWriter pw = new PrintWriter(fileWriter);
				//pw.println(sintactico.p);
				fileWriter.close();
			}
			catch (java.io.FileNotFoundException e) {
				System.out.println("Archivo \""+args[i]+"\" no encontrado.");
			}
			catch (java.io.IOException e) {
				System.out.println("Error durante la lectura del"+ " archivo \""+args[i]+"\".");
				e.printStackTrace();
			}
			catch (Exception e) {
				System.out.println("Excepcion:");
				e.printStackTrace();
			}
		}
	}
}
}