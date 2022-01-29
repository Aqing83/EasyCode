package LC01;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;
import java.util.List;

public class Code1848 {
    public static void main(String[] args) {
        int[] abc = {1,2,3,4,5};
        int ee = getMinDistance(abc, 5, 3);
        System.out.println();
    }

    static int getMinDistance(int[] nums, int target, int start) {
        List abc = new ArrayList();
        for(int j =0 ;j<nums.length;j++){
            if(target ==nums[j]){
                abc.add( Math.abs(j-start)) ;
            }
        }
        if(abc.size() == 0 ){
            return 0;
        }
        int min =Integer.parseInt(""+ abc.get(0));
        for(int j =0;j<abc.size();j++){
            if(min > Integer.parseInt(""+ abc.get(j))){
                min = Integer.parseInt(""+ abc.get(j));
            }
        }
        return min;
    }
}
