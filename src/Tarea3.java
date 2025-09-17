import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tarea3 {
    public static void main(String[] args) throws IOException {
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
        FileOutputStream h=new FileOutputStream(ruta2);
        h.write(b);
    }

}
