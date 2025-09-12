//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        eDirectoerio("/home/dam/Escritorio/Kotlin/Directorios/Fichero");
        //eFichero("/home/dam/Escritorio/Kotlin/Directorios/Fichero\n");
        crearDirectorio("/home/dam/Escritorio/Kotlin/Directorios/Fichero");
        crearDirectorio("/home/dam/Escritorio/Kotlin/Directorios/Fichero/Patatas");
        crearFichero("/home/dam/Escritorio/Kotlin/Directorios/Fichero/Patatas", "Desventaja.txt");
        crearFichero("/home/dam/Escritorio/Kotlin/Directorios/Fichero/Patatas", "advantage.txt");
        //mEscribir("/home/dam/Escritorio/Kotlin/Directorios/Fichero\n", "Ventaja.txt");
        //mLectura("/home/dam/Escritorio/Kotlin/Directorios/Fichero\n", "Ventaja.txt");
        modoAcceso("/home/dam/Escritorio/Kotlin/Directorios/Fichero/Patatas", "Desventaja.txt");
        //mBorrar("/home/dam/Escritorio/Kotlin/Directorios/Fichero\n", "Ventaja.txt");
        //mBorrarDire("/home/dam/Escritorio/Kotlin/Directorios/Fichero\n");
        //mArchivos("/home/dam/Escritorio/Kotlin/Directorios/Fichero/Patatas");
        recur(new File("/home/dam/Escritorio/Kotlin/Directorios/Fichero/Patatas"));

    }

    /**
     * @param cadena
     * @return
     */
    public static Boolean eDirectoerio(String cadena) {
        File file = new File(cadena);

        if (file.isDirectory()) {
            return true;

        } else {
            return false;
        }
    }

    /**
     *
     * @param cadena
     * @return
     */
    public static boolean eFichero(String cadena) {
        File carpeta = new File(cadena);
        if (carpeta.isFile()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param ruta
     */
    public static void crearDirectorio(String ruta) {
        File archivo = new File(ruta);
        boolean crea = archivo.mkdir();
        ruta=archivo.getPath();
        if (crea) {
            System.out.println("Creado existosamente");
            eDirectoerio(ruta);
        } else {
            System.out.println("No se pudo generar");
        }
    }

    public static void crearFichero(String nomeDire, String nomeFile) throws IOException {
        File archivo = new File(nomeDire, nomeFile);
        if (archivo.createNewFile()) {
            System.out.println("Creado exitosamente");
        } else {
            System.out.println("Fallo en crear archivo");
        }

    }

    public static void modoAcceso(String nomeDire, String nomeFile) throws IOException {
        File archivo = new File(nomeDire, nomeFile);
        if (archivo.canWrite()) {
            System.out.println("Es posible escribir");
        } else {
            System.out.println("No es posible escribir");
        }
        if (archivo.canRead()) {
            System.out.println("Este archivo se puede ver");
        } else {
            System.out.println("Este archivo no se puede ver");
        }
    }

    public static void Tamaño(String nomeDire, String nomeFile) {
        long tamañoArchivo;
        File archivo = new File(nomeDire, nomeFile);
        tamañoArchivo = archivo.length();

        System.out.println("Ocupara : " + tamañoArchivo + " bites");
    }

    public static void mLectura(String nomeDire, String nomeFile)  {
        File archivo = new File(nomeDire, nomeFile);
        boolean correcto = archivo.setReadOnly();
        if (correcto) {
            System.out.println(" Este archivo es solo lectura");
        } else {
            System.out.println("No se puede leer");
        }
    }

    public static void mEscribir(String nomeDire, String nomeFile) throws IOException {
        File archivo = new File(nomeDire, nomeFile);
        boolean escribir = archivo.setWritable(true);
        if (escribir) {
            System.out.println("Se puede volver a escribir");
        }
    }


    public static void mBorrar(String nomeDire, String nomeFile){
        File archivo= new File(nomeDire,nomeFile);
        boolean borrado=archivo.delete();
        if (borrado){
            System.out.println("Borrado");
        }else{
            System.out.println("No existe el archivo");
        }
    }
    public static void mBorrarDire(String nomeDire) {
        File archivo= new File(nomeDire);
        boolean borrado=archivo.delete();
        if (borrado) {
            System.out.println("Borrado");
        }else if(eDirectoerio(archivo.getPath())){
            archivo.deleteOnExit();
        }else{
            System.out.println("No existe el archivo");
        }
    }
    public static void  mArchivos(String nomeDire) {
        File archivo=new File(nomeDire);

        for (String s : Objects.requireNonNull(archivo.list())) {
            System.out.println(s);
        }

    }
    public static void  recur(File archivo){
        String[] a= archivo.list();
        if(a!=null){
            File b;
            System.out.println(Arrays.toString(a)+" ");
            for (String f:a){
                b=new File(archivo.getParent(),f);

                    if (b.isDirectory()){
                        System.out.println(f);
                        recur(b);
                    }
            }
        }
    }
}

