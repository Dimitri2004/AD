import java.io.*;
import java.util.Arrays;




public class Tarea3 {

    public static void LecturaData() throws IOException {
        String r2="/home/dam/Escritorio/Kotlin/Directorios/src/Texto3.txt";
        String texto="California free";
        int repeticiones=4;

        FileInputStream n1=new FileInputStream(r2);
        DataInputStream n2=new DataInputStream(n1);
        FileOutputStream p=new FileOutputStream(r2);
        DataOutputStream b=new DataOutputStream(p);
        int i=0;
        int calculo= 0;
       while (i<repeticiones){

           System.out.println("Texto añadido sumando espacio");
            b.writeUTF(texto);
            if (i==0) {
                calculo = b.size() - texto.length();
            }
           System.out.println("Tamaño:"+b.size());
           i++;
       }
       int tamañoFinal=b.size();
        int j=0;
        while (j<repeticiones){
            System.out.println("Texto añadido ocupando espacio");
            String valor=n2.readUTF();
            int tamaño=valor.length();

            int restante=tamañoFinal-tamaño-calculo;
            tamañoFinal=restante;
            System.out.println("Te queda: "+restante);
            j++;
        }

    }



    public static void  LecturaBuffer() throws IOException {
        String r1="/home/dam/Escritorio/Kotlin/Directorios/src/Imagen1.jpeg";
        String r2="/home/dam/Escritorio/Kotlin/Directorios/src/Imagen2.jpeg";
        FileInputStream n=new FileInputStream(r1);
        FileOutputStream n2=new FileOutputStream(r2);
        BufferedInputStream b=new BufferedInputStream(n);
        BufferedOutputStream a=new BufferedOutputStream(n2);
        a.write(b.readAllBytes());//Selecciona todos los bytes que tenga y los copia
        a.close();
    }
    public static void Ficheros() throws IOException {
        String ruta="/home/dam/Escritorio/Kotlin/Directorios/src/Texto.txt";
        String ruta2="/home/dam/Escritorio/Kotlin/Directorios/src/Texto2.txt";
        FileInputStream n=new FileInputStream(ruta);
        byte[] b=new byte[n.available()];
        int i=0;
        while (true) {
            int m=n.read();
            if (m==-1){
                break;
            }else {
                byte bites = (byte) m;
                b[i] = bites;
                i++;
            }
        }
        FileOutputStream h=new FileOutputStream(ruta2,true);
        h.write(b);
        h.close();
    }
    public static void Copia() throws IOException {
        String r1="/home/dam/Escritorio/Kotlin/Directorios/src/Imagen1.jpeg";
        String r2="/home/dam/Escritorio/Kotlin/Directorios/src/Imagen2.jpeg";
        FileInputStream n=new FileInputStream(r1);
        byte[] b = new byte[n.available()];
        int i=0;
        while (true) {
            int m=n.read();
            if (m==-1){
                break;
            }else {
                byte bites = (byte) m;
                b[i] = bites;
                i++;
            }
        }
        FileOutputStream h=new FileOutputStream(r2,true);
        h.write(b);
        h.close();
    }


    /** Parte2 **/

    public static void main(String[] args) throws IOException {
        LecturaData();
    }



}
