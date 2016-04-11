package Strategy;

/**
 *
 * @author dustyn
 */
public abstract class Sort {
    
    /**
     *
     * @param arr
     */
    public final int[] sort(int[] arr) {
        assert(arr != null);

        if(!isSorted(arr)) {
            return fix(arr);
        } else {
            return arr;
        }
    }
    
    protected abstract int[]  fix(int[] arr);
     
    protected final Boolean isSorted(int[] arr) {
        for(int i=0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }  
}
