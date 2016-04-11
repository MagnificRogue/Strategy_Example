
package Strategy;

/**
 *
 * @author dustyn
 */
public class BubbleSort extends Sort{

    @Override
    protected int[] fix(int[] arr) {

        int temp;

        for(int i=0; i < arr.length; i++) {
            for(int j=1; j < (arr.length - i); j++) {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        

        return arr;
    }
    
}
