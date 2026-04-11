package Learning.Arrays;

public class ArrayExample {
public static void main(String[] args) {
    //syntax of array
     //dataType[] variableName = new dataType[size];
    int[] arr = new int[10];
    // int[] arr --> declaration of array. arr is getting defined in the stack
    // new int[10] --> initialization of array. object created in heap memory
    arr[1] = 20;
    System.out.println(arr[1]);

    int[] arr2 = {1,2,3,4,5}; 
    System.out.println(arr2[2]);

}
}