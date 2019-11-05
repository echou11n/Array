package Array2;

public class Array2 {
    public static void main(String[] a) {
     
    String[][]keluarga={{"Ayah  ","Sutaji"},{"Ibu  ","Misnati"},{"Anak 1  ","Eko Hariyono"}, {"Istri  ","Khunainah"},{"Anak  ","Wafiyyati"}};
            for (int x=0;x<keluarga.length;x++){
                System.out.println("Status: "+keluarga[x][0]);
                System.out.println("Nama: "+keluarga[x][1]);
                System.out.println("===================================");
            }
    }
    
}