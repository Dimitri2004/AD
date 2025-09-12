import java.io.IOException;

public class Parte2 {
    public static void main(String[] args) throws IOException {
        //Ejercici 1
        Main.crearDirectorio("/home/dam/Escritorio/Kotlin/Directorios/Arquivosdir");
        Main.eDirectoerio("/home/dam/Escritorio/Kotlin/Directorios/Arquivosdir");
        //Ejercicio2
        Main.crearFichero("/home/dam/Escritorio/Kotlin/Directorios/Arquivosdir","Products1.txt");
        Main.eFichero("/home/dam/Escritorio/Kotlin/Directorios/Arquivosdir");

        //Ejercicio3
        Main.crearDirectorio("/home/dam/Escritorio/Kotlin/Directorios/Arquivosdir/subdir");
        Main.crearFichero("/home/dam/Escritorio/Kotlin/Directorios/Arquivosdir/subdir","Products2.txt");

        //Ejercicio 4
        Main.mArchivos("/home/dam/Escritorio/Kotlin/Directorios/Arquivosdir");

        //Ejercicio 5
        Main.modoAcceso("/home/dam/Escritorio/Kotlin/Directorios/Arquivosdir","Products1.txt");
        Main.Tamaño("/home/dam/Escritorio/Kotlin/Directorios/Arquivosdir","Products1.txt");

        //Ejercicio6
        Main.mLectura("/home/dam/Escritorio/Kotlin/Directorios/Arquivosdir","Products1.txt");
        //Ejercicio 7
        Main.mEscribir("/home/dam/Escritorio/Kotlin/Directorios/Arquivosdir","Products1.txt");

        //Ejercicio 8
        Main.mBorrar("/home/dam/Escritorio/Kotlin/Directorios/Arquivosdir","Products1.txt");

        //Ejercicio 9
        Main.mBorrarDire("/home/dam/Escritorio/Kotlin/Directorios/Arquivosdir");
    }
}
