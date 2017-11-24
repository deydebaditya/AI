import java.io.*;
class palin
{
  public static void main(String args[])
  {
    int temp,digit,sum;
    for(int i=0;i<=100;i++)
    {
      sum=0;
      temp=i;
      while(temp!=0)
      {
        digit=temp%10;
        temp=temp/10;
        sum=(sum*10)+digit;
      }
      if(sum==i)
      {
        System.out.println(i);
      }
    }
}
}   
