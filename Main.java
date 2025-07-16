import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args){

        System.out.print("Cual es tu nombre: ");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        try {

            File txt = new File("Nombre.txt");
            FileWriter writer = new FileWriter("Nombre.txt");

            txt.createNewFile();
            writer.write(name);
            writer.close();

            System.out.println("Revisa el archivo txt");

        } catch (IOException e){
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }

    }

}
