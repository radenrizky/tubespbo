import java.util.Date;
import java.util.Scanner;

/**
 * Created by Raden Rizky Irianti on 10/04/2017.
 */
public class member {
    String kd_pelanggan;
    String id_member;
    String nama;
    String  no_telepon;
    String jenis_kelamin;
    String alamat;
    String tanggal_lahir;

    public member(String kd_pelanggan, String id_member, String nama, String no_telepon, String jenis_kelamin, String alamat, String tanggal_lahir){
        //untuk mengisi member
        this.kd_pelanggan = kd_pelanggan;
        this.id_member = id_member;
        this.nama = nama;
        this.no_telepon = no_telepon;
        this.jenis_kelamin = jenis_kelamin;
        this.alamat = alamat;
        this.tanggal_lahir = tanggal_lahir;
    }

    public void insert(){

    }

    public void print() {
        System.out.println("Cetak\n");
        System.out.println( "kd pelanggan : "+kd_pelanggan+"\nid_member : "+id_member+"\nnama : "+nama+"\nno_telepon : "+no_telepon+"\njenis kelamin : "+jenis_kelamin+"\n alamat : "+alamat+"\n tanggal lahir : "+tanggal_lahir);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Data member minimarket\n");
        System.out.print("===========================\n");
        System.out.print("\n");
        System.out.print("Kode member: ");
        String kd_pelanggan = in.nextLine();
        System.out.print("ID member: ");
        String id_pelanggan = in.nextLine();
        System.out.print("Nama member: ");
        String nama = in.nextLine();
        System.out.print("No Tlp member: ");
        String no_telepon = in.nextLine();
        System.out.print("Jenis Kelamin member: ");
        String jenis_kelamin = in.nextLine();
        System.out.print("Alamat member: ");
        String alamat_pelanggan = in.nextLine();
        System.out.print("Tanggal Lahir member: ");
        String tanggal_lahir = in.nextLine();
        member mem = new member(kd_pelanggan, id_pelanggan, nama, no_telepon, jenis_kelamin, alamat_pelanggan, tanggal_lahir);
        mem.insert();
        mem.print();
    }
}
