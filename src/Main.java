//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File;
public class Main {
    public static void main(String[] args) {
        eDirectoerio("/home/dam/Escritorio/AD");
        eFichero("/home/dam/Escritorio/AD\n");
        crearDirectorio("/home/dam/Escritorio/AD\n");
    }

    /**
     * @param cadena
     * @return
     */
    public static Boolean eDirectoerio(String cadena){
        File file=new File(cadena);

        if (file.isDirectory()) {
            return true;
        }else {
            return false;
        }
        }

    /**
     *
     * @param cadena
     * @return
     */
    public static boolean eFichero(String cadena){
        File carpeta=new File(cadena);
        if (carpeta.isFile()){
            return true;
        }else{
            return false;
        }
    }

    /**
     *
     * @param ruta
     */
    public static void crearDirectorio(String ruta){
        File archivo=new File(ruta);
        boolean crea=archivo.mkdir();
        if (crea){
            System.out.println("Creado existosamente");
        }else{
            System.out.println("No se pudo generar");
        }
    }

    public static void crearFichero(String nomeDire,String nomeFile ){
        File archivo=new File(nomeDire);

    }


}