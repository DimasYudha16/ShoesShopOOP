public class ListSepatu {
    Private static arraylist<Sepatu> listSepatu = new arraylist<Sepatu>(); //arraylist untuk menyimpan data sepatu

    public static void tambahSepatu(string id, string namaSepatu, string ukuranSepatu, string warnaSepatu, int hargaSepatu, int jumlahSepatu) {
        Sepatu sepatu = new Sepatu(id, namaSepatu, ukuranSepatu, warnaSepatu, hargaSepatu, jumlahSepatu);
        listSepatu.add(sepatu);
    }

    public arrayList<Sepatu> getListSepatu() {
        return listSepatu;
    } 
    
}
