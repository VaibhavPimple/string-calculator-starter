package calculator;
import java.util.*;
class StringCalculator {

    public int add(String input) throws NegetivesNotAllowedException {
        char delimeter=',';
        String sDelimeter=null;
        String newInput=null;
        if(input.startsWith("//")){
            delimeter=input.charAt(2);
            newInput=input.substring(3);
        }
        System.out.println(input);
        System.out.println(newInput);
        sDelimeter=Character.toString(delimeter);
        input=input.replace("\n",sDelimeter);


        if(newInput.equals(""))
            return 0;
        int sum=0;


        String[] inputs=newInput.split(sDelimeter);
        // System.out.println(Arrays.toString(inputs));
        List<Integer> netiveNumberList=new LinkedList<>();
        for(String str :inputs){
            if(Integer.valueOf(str)<0)
                netiveNumberList.add(Integer.valueOf(str));
        }
        if(inputs.length==1){
            if(Integer.valueOf(newInput)>1000)
                return 0;
            if(Integer.valueOf(newInput)<0)
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