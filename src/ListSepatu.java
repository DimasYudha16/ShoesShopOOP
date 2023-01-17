import java.util.ArrayList;

public class ListSepatu {
    private static ArrayList<Sepatu> listSepatu = new ArrayList<Sepatu>(); // arraylist untuk menyimpan data sepatu

    public static void tambahSepatu(String dataNamaSepatu, String dataUkuranSepatu, String dataWarnaSepatu,
            String dataHargaSepatu, String dataJumlahSepatu) {
        Sepatu sepatu = new Sepatu(dataNamaSepatu, dataUkuranSepatu, dataWarnaSepatu, dataHargaSepatu,
                dataJumlahSepatu);
        listSepatu.add(sepatu);
    }

    //edit sepatu
    public static void editSepatu(int index, String dataNamaSepatu, String dataUkuranSepatu, String dataWarnaSepatu,
            String dataHargaSepatu, String dataJumlahSepatu) {
        listSepatu.get(index).setNamaSepatu(dataNamaSepatu);
        listSepatu.get(index).setUkuranSepatu(dataUkuranSepatu);
        listSepatu.get(index).setWarnaSepatu(dataWarnaSepatu);
        listSepatu.get(index).setHargaSepatu(dataHargaSepatu);
        listSepatu.get(index).setJumlahSepatu(dataJumlahSepatu);
    }

    public ArrayList<Sepatu> getListSepatu() {
        return listSepatu;
    }

    //get size
    public static int getSize() {
        return listSepatu.size();
    }

    //setter
    public static void setNamaSepatu(int index, String namaSepatu) {
        listSepatu.get(index).setNamaSepatu(namaSepatu);
    }   

    public static void setUkuranSepatu(int index, String ukuranSepatu) {
        listSepatu.get(index).setUkuranSepatu(ukuranSepatu);
    }

    public static void setWarnaSepatu(int index, String warnaSepatu) {
        listSepatu.get(index).setWarnaSepatu(warnaSepatu);
    }

    public static void setHargaSepatu(int index, String hargaSepatu) {
        listSepatu.get(index).setHargaSepatu(hargaSepatu);
    }

    public static void setJumlahSepatu(int index, String jumlahSepatu) {
        listSepatu.get(index).setJumlahSepatu(jumlahSepatu);
    }

    //getter
    public static String getNamaSepatu(int index) {
        return listSepatu.get(index).getNamaSepatu();
    }

    public static String getUkuranSepatu(int index) {
        return listSepatu.get(index).getUkuranSepatu();
    }

    public static String getWarnaSepatu(int index) {
        return listSepatu.get(index).getWarnaSepatu();
    }

    public static String getHargaSepatu(int index) {
        return listSepatu.get(index).getHargaSepatu();
    }

    public static String getJumlahSepatu(int index) {
        return listSepatu.get(index).getJumlahSepatu();
    }

    //remove
    public static void removeSepatu(int index) {
        listSepatu.remove(index);
    }


    // display arraylist
    // public static void displayListSepatu() {
    //     for (Sepatu sepatu : listSepatu) {
    //         System.out.println("Nama Sepatu: " + sepatu.getNamaSepatu());
    //         System.out.println("Ukuran Sepatu: " + sepatu.getUkuranSepatu());
    //         System.out.println("Warna Sepatu: " + sepatu.getWarnaSepatu());
    //         System.out.println("Harga Sepatu: " + sepatu.getHargaSepatu());
    //         System.out.println("Jumlah Sepatu: " + sepatu.getJumlahSepatu());
    //     }

    // }
}
