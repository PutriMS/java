import java.util.*;
public class Exer {
    public static void main(String[] args)  {
        Scanner Inputan = new Scanner(System.in);
        System.out.println("biaya = " );
        int x = Inputan.nextInt();
        Scanner Inputan1 = new Scanner(System.in);
        System.out.println("biaya var = " );
        int y = Inputan1.nextInt();
        TotalBiaya(x, y);
        int totalbiaya = TotalBiaya(x, y);

        Scanner Inputan2 = new Scanner(System.in);
        System.out.println("harga = " );
        int v = Inputan2.nextInt();
        Scanner Inputan3 = new Scanner(System.in);
        System.out.println("kuantitas = " );
        int z = Inputan3.nextInt();
        TotalPendapatan(v,z);
        int totalpendapatan = TotalPendapatan(v, z);


        int laba = totalpendapatan - totalbiaya;
        System.out.println("Total laba = " +laba); 


        Scanner Inputan4 = new Scanner(System.in);
        System.out.println("Tabungan = " );
        int s = Inputan4.nextInt();
        Scanner Imputan5 = new Scanner(System.in);
        System.out.println("Bulan ke = " );
        int bulan = Imputan5.nextInt();
        Scanner Inputan6 = new Scanner(System.in);
        System.out.println("Konstribusi = " );
        int c = Inputan6.nextInt();
        int tabungan = ModelTabungan(s, c, bulan);
        System.out.println("Tabungan = " +tabungan);
    }
    private static int TotalBiaya( int biaya,int biayavar){
        System.out.println("Total Biaya = " +(biaya + biayavar));
        return biaya + biayavar; 
    }
    private static int TotalPendapatan( int harga,int kuantitas){
        System.out.println("Total Pendapatan = " +(harga * kuantitas)); 
        return harga*kuantitas;
    }
    private static int ModelTabungan(int s,int c, int bulan){
        if( bulan == 0 ){
            return s;
        }
        return ModelTabungan(s + c, c, bulan - 1);
        

       //rekursi
        //10+9+8+7+..
    }
}
