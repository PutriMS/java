import java.util.*;
public class App {
    public static void main(String[] args)  {
        Scanner Inputan = new Scanner(System.in);
        System.out.println("Nilai = " );
        int nilai = Inputan.nextInt();
        
        TampilNilai(nilai);
        TambahNilai(nilai);
        int hasilTambah = TambahNilai(nilai);
        System.out.println("Nilai tambah nilai= " + hasilTambah);
        int hasilFaktor = FaktorialNilai(nilai);
        System.out.println("Nilai faktor nilai= " + hasilFaktor);
    }
    private static void TampilNilai(int parameter){
        System.out.println("Nilai(tampil nilai) = " + parameter);
        
        if( parameter == 0 ){
            return;
        }
        parameter--;
        TampilNilai(parameter);//rekursi
    }
    private static int TambahNilai(int parameter){
        System.out.println("Nilai (tambah nilai)= " + parameter);
        
        if( parameter == 0 ){
            return parameter;
        }


        return parameter + TambahNilai(parameter-1);//rekursi
        //10+9+8+7+..
    }

    private static int FaktorialNilai(int parameter){
        System.out.println("Nilai (tambah nilai)= " + parameter);
        
        if( parameter == 1 ){
            return parameter;
        }


        return parameter * FaktorialNilai(parameter-1);//rekursi
        //10+9+8+7+..
    }
}
