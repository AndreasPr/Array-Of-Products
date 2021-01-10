/**
 * Created on 10/Jan/2021 to Array-Of-Products
 */
public class arrayOfProducts {

    private static void arrayProducts(int[] matrix){

        int length = matrix.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int[] outputmatrix = new int[length];

        if(length == 0){
            System.out.println(0);
        }

        int i,j;

        //First element of left array is always 1
        left[0] = 1;

        //Last element in the right array is always 1
        right[length - 1] = 1;

        //Create the left array
        for(i = 1; i < length; i++){
            left[i] = matrix[i - 1] * left[i - 1];
        }

        //Create the right array
        for(j = length - 2; j>=0; j--){
            right[j] = matrix[j + 1] * right[j + 1];
        }

        //Create the output array
        for(i = 0; i < length; i++){
            outputmatrix[i] = left[i] * right[i];
        }

        for(i = 0; i < length; i++){
            System.out.println(outputmatrix[i]);
        }
    }

    public static void main(String args[]){
        int[] matrix = {10, 3, 5, 6, 2};
        arrayProducts(matrix);
    }

}
