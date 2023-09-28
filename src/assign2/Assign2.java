/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assign2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rutul
 */
public class Assign2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        scanner.nextLine(); 

        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt(); 
            ArrayList<Integer> line = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                line.add(scanner.nextInt());
            }

            lines.add(line);
        }

        int q = scanner.nextInt(); 

        
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt(); 
            int y = scanner.nextInt(); 

            if (x <= lines.size() && y <= lines.get(x - 1).size()) {
                System.out.println(lines.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
   
    }
    
}
