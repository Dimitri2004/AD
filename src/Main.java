//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File;
import java.io.IOException;

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

    public static void crearFichero(String nomeDire,String nomeFile ) throws IOException {
        File archivo=new File(nomeDire,nomeFile);
        if(archivo.createNewFile()){
            System.out.println("Creado exitosamente");
        }else {
            System.out.println("Fallo en crear archivo");
        }

    }

    public static void modoAcceso(String nomeDire,String nomeFile ) throws IOException {
        File archivo=new File(nomeDire,nomeFile);
        if(archivo.canWrite()){
            System.out.println("Es posible escribir");
        }else {
            System.out.println("No es posible escribir");
        }
        if (archivo.canRead()){
            System.out.println("Esrte archivo se puede ver");
        }else{
            System.out.println("Este archivo no se puede ver");
        }
    }
    public static void Tamaño(String nomeDire,String nomeFile ) {
        long tamañoArchivo = 0;
        File archivo=new File(nomeDire,nomeFile);
        tamañoArchivo = archivo.length();

        System.out.println("Ocupara : "+tamañoArchivo+" bites");
    }
    public static void mLectura(String nomeDire,String nomeFile){
        File archivo = new File(nomeDire,nomeFile);
        boolean correcto = archivo.setReadOnly();
        if (correcto){
            System.out.println("Se puede leer");
        }else{
            System.out.println("No se puede leer");
        }
    }



}