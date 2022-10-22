import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class Y implements Runnable {
    private String archivos;
    public Y (String s) {
        this.archivos = s;
    }
    int count = 0;
    int totalcount = 0;
    double totalTime = 0;
    @Override
    public void run() {
        FileReader fin = null;
        BufferedReader in = null;
        long t1 = System.currentTimeMillis();
        try {
            fin = new FileReader(archivos);
            in = new BufferedReader( fin );
        } catch (FileNotFoundException e) {
            in = new BufferedReader(fin);
        }
        String dir = null;
        try {
            while ( (dir = in.readLine()) != null ) {
                StringTokenizer st = new StringTokenizer(dir,"," );
                System.out.println(Thread.currentThread().getName()+": " + archivos );
                count = count + 1;
            }
            totalcount = totalcount + count;
            System.out.println("Número total de líneas de " + Thread.currentThread().getName() + ": " + totalcount);
        } catch (IOException e) {
            System.out.println( e.getMessage() );
            System.exit(1);
        }
        long f1 = System.currentTimeMillis();
        double tiempo1 = (double) ((f1 - t1));
        System.out.println(Thread.currentThread().getName() + " : " + t1);
    }
}