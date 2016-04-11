package Strategy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author dustyn
 */
public class BogoSort extends Sort {

    @Override
    protected int[] fix(int[] arr) {

        ArrayList<Integer> swag = new ArrayList<>();
        
        for(int a : arr) {
            swag.add(a);
        }
        
        
        while(! isSorted(swag.stream().mapToInt(Integer::intValue).toArray())){
            Collections.shuffle(swag);
        }
        
        return swag.stream().mapToInt(Integer::intValue).toArray();

    }

    
    
}
