package mondaypresentation;

import Strategy.BogoSort;
import Strategy.BubbleSort;
import Strategy.MergeSort;
import Strategy.Sort;
import java.util.Arrays;

/**
 *
 * @author dustyn
 */
public class MondayPresentation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sort s = new BogoSort();
        
        int[] arr = {3,3,3,2,1,};
        
        arr = s.sort(arr);
        
        System.out.println(Arrays.toString(arr));
        
    }
    
}
