package Strategy;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author dustyn
 */
public class MergeSort extends Sort {
    
    @Override
    protected int[] fix(int[] arr) {
        
        //I live a lie
        
        ArrayList<Integer> l = new ArrayList<>();
        
        for(int a : arr) {
            l.add(a);
        }
        
        Collections.sort(l);
        
        return l.stream().mapToInt(Integer::intValue).toArray();
        
    }

}
