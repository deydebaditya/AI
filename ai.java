import java.io.*;

public class ai {
    public static void main(String [] args)throws IOException {

        // The name of the file to open.
        String fileName = "hi.java";
	String file = "palin.java";
	String file1 = "prime.java";

        // This will reference one line at a time
        String line = null;
	//Declare the array to take the syntax as an input
	String arr[][]=new String[3][100];

	//Declare the array which stores the size of a code
	int size[]=new int[3];	

	int i=0,j=0;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fr = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader br = new BufferedReader(fr);

            while((line = br.readLine()) != null) {
                arr[i][j]= line;
		j++;
            }   
	    size[i]=j--;
            // Always close files.
            br.close();
	    line = null;
	    i++;
	    j=0;
	    fr = new FileReader(file);
	    br = new BufferedReader(fr);
	    while((line = br.readLine()) != null){
	    	arr[i][j]= line;
		j++;
	    }
	    size[i]=j--;          
	    br.close();
	    line = null;
	    i++;
	    j=0;
	    fr = new FileReader(file1);
	    br = new BufferedReader(fr);
	    while((line = br.readLine()) != null){
	    	arr[i][j]=line;
		j++;
	    }         
	    size[i]=j--; 
	    br.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
	for(int k=0;k<3;k++)
	{
	    for(int l=0;l<size[k];l++)
	    {
		System.out.println(arr[k][l]);
	    }
	}
	//decalare array for results 
	String res[]=new String[3];
	
	res[0]="100";
	res[1]="011";
	res[2]="011";

	BufferedReader buf  = new BufferedReader(new InputStreamReader(System.in));
	String input;
	int size1=0,s=0;
	System.out.println("Input the binary string to percieve the type of output you want");
	input = buf.readLine();
	for(int m=0;m<3;m++)
	{
		if(input == res[m])
		{
			size1 = size1 + size[m]; 	
		}
	}
	String arr1[]=new String[size1];
	for(int n=0;n<3;n++)
	{
		if(input == res[n])
		{
			for(int q=0;q<size[n];q++)
			{
				arr1[s]=arr[n][q];
				s++;
			}
		}
	}
	for(int t=0;t<size1;t++)
	{
		System.out.println(arr1[t]);
	} 
    }
}



