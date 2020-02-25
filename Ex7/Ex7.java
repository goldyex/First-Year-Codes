import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Ex7
{

    /**
     * Constructor for objects of class Ex7
     */
    public Ex7()
    {
        // initialise instance variables
       
    }

    public static void main(String args[]) throws IOException{
    
    int HigherThanNum= Integer.parseInt(args[0]);
    
    BufferedReader inputStream = new BufferedReader(new FileReader("D:/Idan/InfoEx7.txt")); 
    
    int[] NumValues = new int[10];
    
    List<Integer> listOfCountryDetails = new ArrayList<Integer>();
    
    int i=0;
    
    while (i<10) { 
         String currentLine = inputStream.readLine();
         
         //split into words
         String words[] = currentLine.split(" ");

         //For each word in the line
         for(String str : words) {
            try {
               int num = Integer.parseInt(str);
               listOfCountryDetails.add(num);
            }
            
            catch(NumberFormatException nfe) { }; //word is not an integer, do nothing
         }
         i++;
      } //end while 
    int counter=0;
      for (int z=0; z<10; z++){
        if(listOfCountryDetails.get(z)>=HigherThanNum){counter++;}
        }
    System.out.println("The number of countries with population higher than "+ HigherThanNum +" is : " + counter);
    }
}
