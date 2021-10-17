package calculator;
import java.util.*;
class StringCalculator {

    public int add(String input) throws NegetivesNotAllowedException {
        input=input.replace("\n",",");


        if(input.equals(""))
            return 0;
        int sum=0;


        String[] inputs=input.split(",");
        // System.out.println(Arrays.toString(inputs));
        if(inputs.length==1){
            if(Integer.valueOf(input)<0)
                throw new NegetivesNotAllowedException("Negetive value not allowed");
            return Integer.valueOf(input);
        }
        for(String str : inputs){
            if(Integer.valueOf(str)<0)
                throw new NegetivesNotAllowedException("Negetive value not allowed");
            sum=sum + Integer.valueOf(str);
        }


        return sum;
    }

}