package com.unal.actividadno6;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;

class DisplayFriends {

    public static void main(String data[]) {
        // Declare RandomAccessFile outside the try block to ensure proper resource management
        RandomAccessFile raf = null;
        
        try {
            String nameNumberString;
            String name;
            long number;

            // Using file pointer creating the file.
            File file = new File("friendsContact.txt");

            if (!file.exists()) {
                // Create a new file if not exists.
                file.createNewFile();
            }

            // Opening file in reading and write mode.
            raf = new RandomAccessFile(file, "rw");

            // Traversing the file
            while (raf.getFilePointer() < raf.length()) {

                // reading line from the file.
                nameNumberString = raf.readLine();

                // Check if the line is not null and split it
                if (nameNumberString != null && nameNumberString.contains("!")) {
                    String[] lineSplit = nameNumberString.split("!");
                    name = lineSplit[0];
                    number = Long.parseLong(lineSplit[1]);

                    // Print the contact data
                    System.out.println("Friend Name: " + name + "\n" + "Contact Number: " + number + "\n");
                } else {
                    System.out.println("Error: Invalid format in line: " + nameNumberString);
                }
            }

        } catch (IOException ioe) {
            // Handle IOExceptions
            System.out.println("I/O Error: " + ioe.getMessage());
        } catch (NumberFormatException nef) {
            // Handle invalid number format
            System.out.println("Error: Invalid number format.");
        } finally {
            // Ensure the file is closed properly
            try {
                if (raf != null) {
                    raf.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
