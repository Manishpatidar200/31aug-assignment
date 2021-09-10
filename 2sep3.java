
//Create two 3 X 3 matrices and perform multiplication of matrices.

import java.util.*;
class Matrix
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
int matrix1[][]= new int[3][3];
int matrix2[][]=new int[3][3];
System.out.println("enter 9 value for matrix1");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
matrix1[i][j]=sc.nextInt();
}
}
System.out.println("enter 9 value for matrix2");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
matrix2[i][j]=sc.nextInt();
}
}
int result[][] = new int[3][3];

for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
result[i][j]=0;
for(int k=0;k<3;k++)
{
result[i][j]+=matrix1[j][k]*matrix2[k][j];
}
}
}
System.out.println("result of matrix1 * matrix2 is....");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
 System.out.print(result[i][j]+" ");
}
 System.out.println("");
}
}
}