package Xcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData
{

   public String  readfile(String name_file){
       String data_to_return="";

       try
       {
           File myObj = new File(name_file);
           Scanner myReader = new Scanner(myObj);
           while (myReader.hasNextLine()) {
               data_to_return+= myReader.nextLine();
           }
           myReader.close();
       }
       catch (FileNotFoundException e) {
           System.out.println(" ");
           e.printStackTrace();
       }
        return data_to_return;

    }




    public static void main(String[] args) {
        try
        {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String result[]=data.split(" ");

//                for(int i=0;i<result.length;i++)
//                {
//                    System.out.println(result[i]); //  طريقة السبليت الي بدنياها
//                }

            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(" ");
            e.printStackTrace();
        }
    }
}
