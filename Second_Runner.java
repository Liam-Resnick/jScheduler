import java.io.*;
import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

class Second_Runner {
    public static void main(String str[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many students are there? ");
        int stuNum = scan.nextInt();
        ArrayList<Student> instances = new ArrayList<Student>(); 

        
        String complete = ""; 
        
        for(int i = 1; i <= stuNum; i++) {
            Student ahh = new Student(i);
            instances.add(ahh);
        }

        //this loop deals with people ([1-80], [81-160], [161-240]...)
        for(int i = 0; i < instances.size(); i++) {
            //These loops deal with the individual person
            for(int z = 0; z < 8; z++) {
                for(int j = instances.get(i).getArr()[z]; j <= instances.get(i).getArr()[79]; j += 8) { 
                    for(int k = j + 8; k <= instances.get(i).getArr()[79]; k += 8) {
                        complete += ((-1 * j) + " " + (-1 * k) + " " + 0); 
                        complete += ("\n");
                    }
                }   
            }
        }

        for(int i = 0; i < instances.size(); i++) { //dealing with first person
            for(int z = 0; z < 8; z++) { // dealing with individual period
                for(int j = instances.get(i).getArr()[z]; j <= instances.get(i).getArr()[79]; j += 8) { 
                    complete += ((j) + " "); 
                }   
                complete += ("0\n");
            }
        }

        for(int i = 0; i < instances.size(); i++) {
            for(int z = 0; z <= 79; z += 8) {
                for(int j = instances.get(i).getArr()[z]; j <= instances.get(i).getArr()[z + 7]; j += 1) { 
                    for(int k = j + 1; k <= instances.get(i).getArr()[z + 7]; k += 1) {
                        complete += ((-1 * j) + " " + (-1 * k) + " " + 0); 
                        complete += ("\n");
                    }
                }   
            }
        }


        WriteToFile(complete);
    }

    static void WriteToFile (String x) { 
        try {
        FileWriter myWriter = new FileWriter("cnf.txt");

        myWriter.write(x);

        myWriter.close();
        System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
    }
}