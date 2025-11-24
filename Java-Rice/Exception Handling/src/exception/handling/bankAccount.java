package exception.handling;

import java.util.Scanner;

public class bankAccount {
    Scanner sc = new Scanner(System.in);
    int bal = 200;

    public void withdraw(){
        try{
            System.out.print("Input withdraw amount: ");
            int withdraw = sc.nextInt();

            if(withdraw > bal){
                throw new Exception("Insufficient funds!");
            } else if(withdraw < 0){

                throw new Exception("Invalid Transaction Amount!");
            }

            bal -= withdraw;
            System.out.println("Withdrawal successful! Remaining balance: " + bal);

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
