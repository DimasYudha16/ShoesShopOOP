public class Sepatu {
    private String dataNamaSepatu;
    private String dataUkuranSepatu;
    private String dataWarnaSepatu;
    private String dataHargaSepatu;
    private String dataJumlahSepatu;

    //constructor untuk menginisialisasi objek dari sebuah kelas
    public Sepatu(String dataNamaSepatu, String dataUkuranSepatu, String dataWarnaSepatu, String dataHargaSepatu, String dataJumlahSepatu) {
        this.dataNamaSepatu = dataNamaSepatu;
        this.dataUkuranSepatu = dataUkuranSepatu;
        this.dataWarnaSepatu = dataWarnaSepatu;
        this.dataHargaSepatu = dataHargaSepatu;
        this.dataJumlahSepatu = dataJumlahSepatu;
    }
    
    //setter berguna untuk set value dari variabel itu semua
    public void setNamaSepatu(String dataNamaSepatu) {
        this.dataNamaSepatu = dataNamaSepatu;
    }
    public void setUkuranSepatu(String dataUkuranSepatu) {
        this.dataUkuranSepatu = dataUkuranSepatu;
    }
    public void setWarnaSepatu(String dataWarnaSepatu) {
        this.dataWarnaSepatu = dataWarnaSepatu;
    }
    public void setHargaSepatu(String dataHargaSepatu) {
        this.dataHargaSepatu = dataHargaSepatu;
    }
    public void setJumlahSepatu(String dataJumlahSepatu) {
        this.dataJumlahSepatu = dataJumlahSepatu;
    }

    //getter berfungsi untuk memanggil value dari variabel

    public String getNamaSepatu() {
        return dataNamaSepatu;
    }
    public String getUkuranSepatu() {
        return dataUkuranSepatu;
    }
    public String getWarnaSepatu() {
        return dataWarnaSepatu;
    }
    public String getHargaSepatu() {
        return dataHargaSepatu;
    }
    public String getJumlahSepatu() {
        return dataJumlahSepatu;
    }

}

//bikin method setter getter
//bikin arraylist
