package com.company;

/**
 * Created by ls059 on 1/16/18.
 */
public class stackMove {
    private static int[] t1;
    private static int[] t2;
    private static int[] t3;
    int d;


    public void solveTower(int s){
        d = s;
        for(int i = 1; i<=s; i++){
                t1[i] = i;
        }
        if(t1[t1.length-1] % 2 == 0){

        }
        else if(t1[t1.length-1] % 2 == 1){
            for(int j = 1;j<=Math.pow(2, s)-1;j++){
                if(j%2 == 1){
                    System.out.println("Move the smallest piece one to the left");
                }
                else if(j%2 == 0){
                    legalMove();
                }
            }
        }
        else{
            System.out.println("Invalid input");
            return;
        }

    }
    private void legalMove(){
        
    }
}
