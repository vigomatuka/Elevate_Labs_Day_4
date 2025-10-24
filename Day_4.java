import java.util.Scanner;
import java.io.*;

public class Day_4 {
    static Scanner scanner = new Scanner(System.in);
    static String fileName = "notes.txt";
    static void main() {
        int answer;
        do{
            System.out.println("\n\nEnter numbers 1-5 for the following options.");
            System.out.println("1. Add text to a file");
            System.out.println("2. Read a file");
            System.out.println("3. Clear file");
            System.out.print("4. Exit\n");
            answer = scanner.nextInt();
            scanner.nextLine();
            switch(answer){
                case 1:  writeFile(); break;
                case 2:  readFile(); break;
                case 3:  clearFile(); break;
                case 4: break;
                default: System.out.println("This is not a valid option.");
            }
        }while(answer != 4);
    }

    static void writeFile(){
        System.out.print("Enter the text: ");
        String note = scanner.nextLine();
        FileWriter writer = null;
        try{
            writer = new FileWriter(fileName, true); //append mode
            writer.write(note + "\n");
            System.out.println("Note saved.");
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        } finally{
            try{
                if (writer != null) writer.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    static void readFile(){
        System.out.println("All notes");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e){
            System.out.println("File is empty. Add a note first.");
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void clearFile(){
        try (FileWriter writer = new FileWriter(fileName)) {
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("File cleared.");
    }
}
