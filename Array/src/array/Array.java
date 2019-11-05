package array;

public class Array {
    public static void main(String[] a) {
      System.out.println("=== Access The Elements of an array ===")  
      String [] keluarga = {"Eko Hariyono", "Khunainnah", "Wafiyyati"};
      System.out.println(keluarga[0]);
      System.out.println("                                         ")
      
      System.out.println("=== Change an Array Element ===")
      keluarga [0] = "Qurrotul Ain";
      System.out.println (keluarga[0]);
      System.out.println("                                         ")
       
      
      System.out.println("=== Loop Trouhg an Array With For - Each ===")
      for (String x : keluarga){
          System.out.println(x);
      }
    }
    
}
