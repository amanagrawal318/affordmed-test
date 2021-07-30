import java.util.*;
public class Question1 {
    public static class TCPStream {
        //hasmap to store integer -> byte
        HashMap<Integer,Byte> hm=new HashMap<>();
        int stchunk=0;
        //function defination
        public  void receive(int chunk,byte[] data){
            //put in hashmap
           for(int i=0;i<data.length;i++){
               hm.put(chunk+i,data[i]);
           }
           stchunk=chunk+data.length;
        }
        //function defination
        public  int read(byte[] data){
            int k=0;
            //if hm contains continuous elements then added to empty array else break
            for(int i=0;i<hm.size();i++){
                if(hm.containsKey(i+1)){
                    data[k]=hm.get(i+1);
                    k++;
                }
                else{
                    break;
                }
            }
            //k represent  before k index till continuous elemnt filled in empty array
            return k;
        }
        
    }

    public static void main(String[] args) {
        //object initilize
        TCPStream obj = new TCPStream();
        byte[] data={'I',' ','a'};
        obj.receive(1, data);     //funtion receive call 
        byte[] ndata={'m',' ','p'};
        obj.receive(4, ndata);
        //empty array create
        byte[] arr=new byte[obj.hm.size()];
        //funtion read call 
        System.out.println(obj.read(arr));   
    }
    
}
/**
 * InnerQuestion1
 */
 