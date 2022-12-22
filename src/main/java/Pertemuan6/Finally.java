package Pertemuan6;

public class Finally {
    public static void main(String[] args) {
        try {
           int[] nomorSaya = {1, 2, 3};
           System.out.println(nomorSaya[24]);
        } catch(Exception e) {
           System.out.println("Dicek lagi.....");
        } finally {
           System.out.println("Selesai...!");
        }
    }
}
