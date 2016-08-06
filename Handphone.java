import java.util.Scanner;

/**
 *
 * @author ds
 */

public class Handphone {

private String  merk, tipe ,warna ;
        private double harga;
        
         public static void main(String[] args) {
        
   
         Handphone hp = new Handphone();
         Scanner masukan = new Scanner (System.in);
         
            System.out.println("masukan merek hp = "); 
            hp.setmerk(masukan.nextLine());
            System.out.println("masukan tipe hp = ");
            hp.settipe(masukan.nextLine());
            System.out.println("masukan warna hp = ");
            hp.setwarna(masukan.nextLine());
            System.out.println("masukan harga hp = ");
            hp.setharga(masukan.nextInt());
            System.out.println("==============================");
            System.out.println("merek hp ="+ hp.getmerk());
            System.out.println("tipe hp = "+hp.gettipe());
            System.out.println(" warna hp = "+hp.getwarna());
            System.out.println("harga hp = "+hp.getharga());
	    System.out.println("total = " +hp.HargaDiskon());
  		      	
    
         }
        public void setmerk (String merk)
        {        
                this. merk = merk;
        }
        public void  settipe (String tipe)
        {
            this.tipe = tipe;
        }
        public void  setwarna (String warna)
        {
            this.warna = warna;
        }
        public  void setharga (double harga)
        {
            this.harga = harga;
        }
        //getter
        public String getmerk ()
        {
            return merk;
        }
        public String gettipe ()
        {
            return tipe;
        }
        public String getwarna ()
        {
            return  warna;
        }
        public double getharga ()
        {
            return harga ;
        }
        
        //method tambahan
        public double HargaDiskon ()
        {
            double diskon = 0.1 * getharga();
            double total = getharga() - diskon;


        return total;  
}
        public void keterangan()
        {
            System.out.println("harga sudah didiskon 10 % = Rp" + HargaDiskon());
            
        }
}
