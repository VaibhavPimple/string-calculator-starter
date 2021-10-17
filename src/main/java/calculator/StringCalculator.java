package calculator;
import java.util.*;
class StringCalculator {

    public int add(String input) {
        input=input.replace("\n",",");


        if(input.equals(""))
            return 0;
        int sum=0;


        String[] inputs=input.split(",");
        // System.out.println(Arrays.toString(inputs));
        if(inputs.length==1){
            return Integer.valueOf(input);
        }
        for(String str : inputs){
            sum=sum + Integer.valueOf(str);
        }


        return sum;
    }

}