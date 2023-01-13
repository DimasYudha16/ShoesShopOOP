import java.util.ArrayList;

public class ListSepatu {
    private static ArrayList<Sepatu> listSepatu = new ArrayList<Sepatu>(); //arraylist untuk menyimpan data sepatu

    public static void tambahSepatu(String dataNamaSepatu, String dataUkuranSepatu, String dataWarnaSepatu, String dataHargaSepatu, String dataJumlahSepatu) {
        Sepatu sepatu = new Sepatu(dataNamaSepatu, dataUkuranSepatu, dataWarnaSepatu, dataHargaSepatu, dataJumlahSepatu);
        listSepatu.add(sepatu);
    }

    public ArrayList<Sepatu> getListSepatu() {
        return listSepatu;
    } 

    //display arraylist
    public static void displayListSepatu() {
        for (Sepatu sepatu : listSepatu) {
            System.out.println("Nama Sepatu: " + sepatu.getNamaSepatu());
            System.out.println("Ukuran Sepatu: " + sepatu.getUkuranSepatu());
            System.out.println("Warna Sepatu: " + sepatu.getWarnaSepatu());
            System.out.println("Harga Sepatu: " + sepatu.getHargaSepatu());
            System.out.println("Jumlah Sepatu: " + sepatu.getJumlahSepatu());
        }
    
}
}
