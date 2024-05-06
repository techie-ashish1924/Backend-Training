public class Loop {


    public static void main(StringDemo[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int n = 9;

        // for loop

        System.out.println("For Loop");
        System.out.println("------------------------------");

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        
        }
        System.out.println("\n------------------------------");

        // while loop 

        System.out.println("While loop");
        System.out.println("------------------------------");

        int i=0;
        while (i < n) 
        {
            System.out.print(arr[i] + " "); 
            i++;  
        }
        System.out.println("\n------------------------------");

        // Do while loop

        System.out.println("Do while loop");
        System.out.println("------------------------------");

        int j = 0;

        do{
            System.out.print(arr[j]  + " ");
            j++;
        }while(j < n);

        System.out.println("\n------------------------------");

        // For each Loop

        System.out.println("For each Loop");
        System.out.println("------------------------------");
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
        System.out.println("\n------------------------------");
 
    }
    
}



