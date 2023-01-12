public class Sepatu {
    private String id;
    private String namaSepatu;
    private String ukuranSepatu;
    private String warnaSepatu;
    private String hargaSepatu;
    private String jumlahSepatu;

    //constructor untuk menginisialisasi objek dari sebuah kelas
    public Sepatu(String id, String namaSepatu, String ukuranSepatu, String warnaSepatu, String hargaSepatu, String jumlahSepatu) {
        this.id = id;
        this.namaSepatu = namaSepatu;
        this.ukuranSepatu = ukuranSepatu;
        this.warnaSepatu = warnaSepatu;
        this.hargaSepatu = hargaSepatu;
        this.jumlahSepatu = jumlahSepatu;
    }
    
    //setter berguna untuk set value dari variabel itu semua
    public void setId(String id) {
        this.id = id;
    }
    public void setNamaSepatu(String namaSepatu) {
        this.namaSepatu = namaSepatu;
    }
    public void setUkuranSepatu(String ukuranSepatu) {
        this.ukuranSepatu = ukuranSepatu;
    }
    public void setWarnaSepatu(String warnaSepatu) {
        this.warnaSepatu = warnaSepatu;
    }
    public void setHargaSepatu(String hargaSepatu) {
        this.hargaSepatu = hargaSepatu;
    }
    public void setJumlahSepatu(String jumlahSepatu) {
        this.jumlahSepatu = jumlahSepatu;
    }

    //getter berfungsi untuk memanggil value dari variabel
    public String getid() {
        return id;
    }
    public String getNamaSepatu() {
        return namaSepatu;
    }
    public String getUkuranSepatu() {
        return ukuranSepatu;
    }
    public String getWarnaSepatu() {
        return warnaSepatu;
    }
    public String getHargaSepatu() {
        return hargaSepatu;
    }
    public String getJumlahSepatu() {
        return jumlahSepatu;
    }

}

//bikin method setter getter
//bikin arraylist
