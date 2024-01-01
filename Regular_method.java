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

public class Regular_method {
    public static void main(String str[]) throws IOException {
        final long startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);
        System.out.println("How many students are there? ");
        int z = scan.nextInt();
        String[] arr = new String[z * 80]; 
        for(int i = 0; i < arr.length; i++) {
            arr[i] = "";
        }
    
        for(int i = 0; i < arr.length; i++) {
            arr[i] += (i / 80)+ 1;

            int r = (i % 80);
            if(r <= 8) {
                arr[i] += "a";
            } else if(r <= 16) {
                arr[i] += "b";
            } else if(r <= 24) {
                arr[i] += "c";
            } else if(r <= 32) {
                arr[i] += "d";
            } else if(r <= 40) {
                arr[i] += "e";
            } else if(r <= 48) {
                arr[i] += "f";
            } else if(r <= 56) {
                arr[i] += "g";
            } else if(r <= 64) {
                arr[i] += "h";
            } else if(r <= 72) {
                arr[i] += "i";
            } else {
                arr[i] += "j";
            }

            if(r % 8 == 0) {
                arr[i] += 8;
            } else if(r % 8 == 1) {
                arr[i] += 1;
            } else if(r % 8 == 2) {
                arr[i] += 2;
            } else if(r % 8 == 3) {
                arr[i] += 3;
            } else if(r % 8 == 4) {
                arr[i] += 4;
            } else if(r % 8 == 5) {
                arr[i] += 5;
            } else if(r % 8 == 6) {
                arr[i] += 6;
            } else if(r % 8 == 7) {
                arr[i] += 7;
            } 
        }
 
        ArrayList<String> finalList = new ArrayList<String>(); 
        for(int i = 1; i < arr.length; i++) {
            if(Integer.parseInt(arr[i].substring(arr[i].length()-1))  == i % 8) {
                finalList.add(arr[i]);
                i += 8;
            }
        }

        for (String p : finalList) {
            System.out.print(p + " ");
        }
        
        final long duration = System.nanoTime() - startTime;
        System.out.println(duration);
        
    }
}
