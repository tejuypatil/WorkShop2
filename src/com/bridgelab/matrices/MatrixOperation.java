package com.bridgelab.matrices;

public class MatrixOperation {
    public static void main(String[] args) {
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        m1[0][0]=3;
        m1[0][1]=2;
        m1[0][2]=1;
        m1[1][0]=4;
        m1[1][1]=5;
        m1[1][2]=7;
        m1[2][0]=9;
        m1[2][1]=7;
        m1[2][2]=8;

        m2[0][0]=4;
        m2[0][1]=8;
        m2[0][2]=9;
        m2[1][0]=1;
        m2[1][1]=3;
        m2[1][2]=4;
        m2[2][0]=5;
        m2[2][1]=1;
        m2[2][2]=3;

    int[][] result=new int[3][3];

    for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if(m1[i][j]%2 == 0 && m2[i][j]%2 ==0)
                {
                    result[i][j]=m1[i][j] + m2[i][j];
                    //both the numbers are even
                }
                else if (m1[i][j]%2 == 1 && m2[i][j]%2 ==1 )
                {
                    result[i][j]=m1[i][j] + m2[i][j];
                    //both the numbers are odd
                }
                else {
                    result[i][j] = m1[i][j] * m2[i][j];
                    //product
                }
                System.out.println("Store the result in 2D array: " + result[i][j]);

            }

        }

    }
}
