import java.util.HashMap;
import java.util.Map;

public class Bins {
    private  int minValue;
    private  int maxValue;
    private Integer result;
    private int number2;
    private int number3;
    private int number4;
    private int number5;
    private int number6;
    private int number7;
    private int number8;
    private int number9;
    private int number10;
    private int number11;
    private int number12;
    HashMap<Integer ,Integer>  binMap=new HashMap<Integer,Integer>();

    public Bins ( int i, int j ) {
        this.minValue=i;
        this.maxValue=j;
        this.binMap.put(2,0);
       this. binMap.put(3,0);
        this.binMap.put(4,0);
        this.binMap.put(5,0);
       this. binMap.put(6,0);
       this. binMap.put(7,0);
        this.binMap.put(8,0);
        this.binMap.put(9,0);
        this.binMap.put(10,0);
        this.binMap.put(11,0);
        this.binMap.put(12,0);
    }

  public  void incrementBim(int num){
            num+=1;  //2 occuured once -->num=1
      System.out.println("key:"+num);
      int repl = this.getBin(num);
      repl+=1;
      this.binMap.replace(num,repl);
      //for (Object o: this.binMap.keySet())
      //{
      //    if (this.binMap.get(o).equals(num))
      //    {
      //        //binMap.get(o).
      //        this.binMap(o).get
      //        binMap.replace(num,);
      //    }
      //}
    }

   public  Integer getBin ( int binNumber) { //2 to 12
        int numberOfBin=this.binMap.get(binNumber);   //number of each bin 2 to 12 occuured sum
          return numberOfBin; // number of tens in the 10 bin


    }


}
