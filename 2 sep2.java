/*4. Create an array of type int with 10 elements.
 
  int array[]={8,2,3,1,6,5,7};

Sort the array in descending order.*/

class Main 
{
    public static void main(String gg[])
    {
        int arr[]={8,2,3,1,6,5,7,11,22,13};
        int temp=0;
        for(int i=0;i<arr.length;i++)
         {
             for(int j=i+1;j<arr.length;j++)
             {
                 if(arr[i]<arr[j])
                 {
                     temp =arr[j];
                     arr[j]=arr[i];
                     arr[i]=temp;
                 }
             }
         }
         for(int i=0;i<arr.length;i++)
         {
             System.out.print(arr[i]+" ");
         }
    }
}
