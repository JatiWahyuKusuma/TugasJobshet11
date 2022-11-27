public abstract class Binatang {
    public String nama;
    public int jmlKaki;

    public Binatang(String nama, int jmlKaki){
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setKaki(int jmlKaki){
        this.jmlKaki = jmlKaki;
    }

    public int getKaki(){
        return jmlKaki;
    }

    public void Binatang(){
        System.out.println("Nama        :"+nama);
        System.out.println("jumlah Kaki :"+jmlKaki);
    }
}
