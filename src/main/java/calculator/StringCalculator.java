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
        List<Integer> netiveNumberList=new LinkedList<>();
        for(String str :inputs){
            if(Integer.valueOf(str)<0)
                netiveNumberList.add(Integer.valueOf(str));
        }
        if(inputs.length==1){
            if(Integer.valueOf(input)>1000)
                return 0;
            if(Integer.valueOf(input)<0)
                throw new NegetivesNotAllowedException("Negetive value not allowed -"+netiveNumberList.toString());
            return Integer.valueOf(input);
        }
        for(String str : inputs){
            if(Integer.valueOf(str)>1000)
                continue;
            if(Integer.valueOf(str)<0)
                throw new NegetivesNotAllowedException("Negetive value not allowed"+netiveNumberList.toString());
            sum=sum + Integer.valueOf(str);
        }


        return sum;
    }

}