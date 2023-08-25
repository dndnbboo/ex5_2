/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scoreusingbound;

import java.util.Scanner;

// 64050075

/**
 *
 * @author User
 */
public class HeadQuaterUsingBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        LiveScoreBean source = new LiveScoreBean();
        Subscriber s1 = new Subscriber();
        Subscriber s2 = new Subscriber();
        source.addPropertyChangeListener(s1);
        source.addPropertyChangeListener(s2);
        
        String input="score";
        while (input != "") {
            System.out.print("Enter score : ");
            input = in.nextLine();
            if (input != "") {
                source.setScoreLine(input);
            } else {
                System.out.println("End");
            }
        } 
    }
}
