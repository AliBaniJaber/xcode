package Xcode;
class main
{

    public static void main(String args[])
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        ReadData inputfile=new ReadData();
        String result_from_file = inputfile.readfile("input.txt");
        System.out.println(result_from_file);
//
//
// عمليه البارس حسب فورمات الفايل هون بتكون
//
//
//
        String input_to_pars[]=result_from_file.split(" ");
        int input_to_Alg[]=new int[input_to_pars.length];

        for(int i=0;i<input_to_Alg.length;i++)
        {
            input_to_Alg[i]=Integer.parseInt(input_to_pars[i]);
        }







        QuickSort ob = new QuickSort();
        ob.sort(input_to_Alg, 0, input_to_Alg.length-1);

        System.out.println("sorted array");
        ob.printArray(input_to_Alg);
    }
}

