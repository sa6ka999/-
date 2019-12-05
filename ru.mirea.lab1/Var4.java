package ru.mirea.lab1;
public class Var4{
    public static void main(String[] args) {
        int m[] = {0,1,2,3,4,5,6,7,8,9};
        int sum1 = 0;
        for(int i = 0; i < 10; i++){
            sum1 = sum1 + m[i];
        }
        System.out.println(sum1);

        int sum2 = 0;
        int s = 0;
        while (s < 10){
            sum2 = sum2 + m[s];
            s++;
        }
        System.out.println(sum2);

        int sum3 = 0;
        int k = 0;
        do{
            sum3 = sum3 + m[k];
            k++;
        }while(k < 10);
        System.out.println(sum3);

    }
}