public class Array {

    StringDemo name;
    int mob;


    /*
     * Array is collectioon of homogeneous data type  
     * Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
     * Note: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.


     */



    public static void main(StringDemo[] args) {

        // Array of primitive data type
        
        //-------------------------------------------
        int arr[] = new int[5];
        boolean arr2[] = new boolean[5];
        char arr3[] = new char[5];
        double arr4[] = new double[5];
        
        //-------------------------------------------
        
        
        // Array of object or Array of non-primitive 

        
        //-------------------------------------------
        
        Array ob[] = new Array[5];
        StringDemo arr5[] = new StringDemo[5];

        //-------------------------------------------
        

        // Access the element

        // You can access an array element by referring to the index number.

        ob[0] = new Array();
        System.out.println(ob[0].name);
        System.out.println(ob[0].mob);
        System.out.println(arr[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);
        System.out.println(arr4[0]);


        //Change Array Element

        // To change the value of a specific element, refer to the index number:

        ob[0].name = "Ashish";
        ob[0].mob = 7830057;
        arr[0] = 5;
        arr2[0] = true;
        arr3[0] = 'a';
        arr4[0] = 8.0;

        // Array Length

        // To find out how many elements an array has, use the length property:

        System.out.println(ob.length);
        System.out.println(arr.length);
        System.out.println(arr2.length);
        System.out.println(arr3.length);
        System.out.println(arr4.length);


    }
    
}
