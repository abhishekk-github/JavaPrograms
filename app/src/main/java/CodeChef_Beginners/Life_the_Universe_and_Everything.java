package CodeChef_Beginners;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by abhishek on 3/6/16.
 */
public class Life_the_Universe_and_Everything {
  ArrayList<Integer> mArrayList = new ArrayList<>();

   public static void main(String args[]){
     Life_the_Universe_and_Everything object = new Life_the_Universe_and_Everything();
     object.readFromConsole();
     object.printResult();
  }

  /**
   * Print result;
   */
  private void printResult() {
    for (Integer i: mArrayList) {
      if(i==42){
        return;
      }
      else{
        System.out.println(i);
      }
    }
  }

  /**
   * Take input from the standerd input device and store them in
   * arraylist.
   */
  private  void readFromConsole() {
    Scanner scanner  = new Scanner(System.in);
    while (scanner.hasNext()) {
      mArrayList.add(scanner.nextInt());
    }
  }
}
