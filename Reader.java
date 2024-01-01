import java.io.*;
import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Paths;

class Reader {
    private static String method(String file_path)
    {
 
        // Declaring an empty string
        String str = "";
 
        // Try block to check for exceptions
        try {
 
            // Reading all bytes form file and
            // storing that in the string
            str = new String(
                Files.readAllBytes(Paths.get(file_path)));
        }
 
        // Catch block to handle the exceptions
        catch (IOException e) {
 
            // Print the exception along with line number
            // using printStackTrace() method
            e.printStackTrace();
        }
 
        return str;
    }
    public static void main(String str[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("SAT4j output? ");
        String output = scan.nextLine();
        // String direct = "C:\\Users\\liamr\\Desktop\\PJAS 2023\\output.txt";
        // String output = method(direct);
        // output = output.substring(2);
        // output = output.substring(0, output.length() - 2);

        System.out.println("How many students are there? ");
        int z = scan.nextInt();
       
        String[] arr = new String[(z * 8)]; // each person has total 8 classes 
        String temp = "";
        int counter = -1;

        for(int i = 0; i < output.length(); i++) {
            if(i + 1 == output.length() || i + 2 == output.length()) {
                break;
            }
            if(output.substring(i, i + 1).equals(" ") && !(output.substring(i + 1, i + 2).equals("-"))) {
                int x = i + 1;
                if(x >= output.length()) {
                    break;
                }
                counter++;
                while(!(output.substring(x , x + 1).equals(" "))) {
                    temp += output.substring(x , x + 1);
                    x++;
                }
                arr[counter] = temp;
                temp = ""; 
            }
        }

        String courseName = "";
        int p = 80;
        for(int i = 1; i <= z; i++) {
            System.out.print("\nStudent " + i + " schedule is: ");

            for(int j = (i - 1) * 8; j < (i * 8); j++) {
                courseName += (Integer.parseInt(arr[j]) / p) + 1;
                int r = Integer.parseInt(arr[j]) - (80 * (Integer.parseInt(arr[j]) / p));
                if(r <= 8) {
                    courseName += "A";
                } else if(r <= 16) {
                    courseName += "B";
                } else if(r <= 24) {
                    courseName += "C";
                } else if(r <= 32) {
                    courseName += "D";
                } else if(r <= 40) {
                    courseName += "E";
                } else if(r <= 48) {
                    courseName += "F";
                } else if(r <= 56) {
                    courseName += "G";
                } else if(r <= 64) {
                    courseName += "H";
                } else if(r <= 72) {
                    courseName += "I";
                } else {
                    courseName += "J";
                }

                if(r % 8 == 0) {
                    courseName += 8;
                } else if(r % 8 == 1) {
                    courseName += 1;
                } else if(r % 8 == 2) {
                    courseName += 2;
                } else if(r % 8 == 3) {
                    courseName += 3;
                } else if(r % 8 == 4) {
                    courseName += 4;
                } else if(r % 8 == 5) {
                    courseName += 5;
                } else if(r % 8 == 6) {
                    courseName += 6;
                } else if(r % 8 == 7) {
                    courseName += 7;
                } 

                System.out.print(courseName + " ");
                courseName = "";
            }
        }
    }
}