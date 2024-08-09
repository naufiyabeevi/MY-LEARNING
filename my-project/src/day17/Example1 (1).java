package day17;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

 class Example1 {

    protected static final String path = "C:\\Users\\91807\\Documents\\learning\\myfile.txt";

    public static void main(String[] args) {
        File file = new File(path);

        try {
            //Create file
            boolean status = file.createNewFile();// create file will create new file

            if (status) {//true
                System.out.println("File created");
            } else {
                System.out.println("File already exist");
            }

            //Write to a file
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write("Hello, some content\n");
            fileWriter.write("Earth");
            fileWriter.close();

            //Read from the file using scanner class
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) { // true
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();

            //Delete a file
            boolean bool = file.delete();
            if (bool) { //true
                System.out.println("File deleted");
            } else {
                System.out.println("Failed to delete the file");
            }

        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }
}
