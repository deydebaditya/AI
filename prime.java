import java.io.*;
class prime
{
  public static void main(String args[])
  {
    int a,flag;
    for(int i=2;i<=100;i++)
    {
      flag=0;
      for(int j=2;j<i;j++)
      {
        a=i%j;
        if(a==0)
        {
          flag=1;
          break;
        }
      }
      if(flag==0)
      {
        System.out.println(i);
      }
    }
 }
}
 

