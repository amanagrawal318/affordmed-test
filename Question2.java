 import java.util.*;

public class Question2 {
    public static compress(String data){
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<data.length;i++){
            char ch=data.get(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }else{
hm.put(ch, 1);
            }
        }
        

        String str="";
        for(int i=0;i<data.length;i++){
            char ch=data.get(i);
            if(hm.containsKey(ch)){
                str+=ch+hm.get(ch)+"";
            }
        }
        return str;
    }
}
