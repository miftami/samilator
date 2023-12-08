import java.util.Scanner;
public class Samilator {
    public Samilator(){}
    
    public static void main(String[] args) {
        double hsl, angka1, angka2;
        char jwb;
        Operasi opr = new Operasi();
            try(Scanner obj = new Scanner(System.in)){

                    do{
                        System.out.println("Operasi apa yang anda inginkan :");
                        System.out.println("1. Penjumlahan \n2. Pengurangan \n3. Perkalian \n4. Pembagian \n5. Modulus \nInput salah satu angka!!!");
                        
                        int operator = obj.nextInt();
                        System.out.println("Masukkan angka pertama :");
                        angka1 = obj.nextDouble();
                        System.out.println("Masukkan angka kedua :");
                        angka2 = obj.nextDouble();

                        switch (operator) {
                            case 1:
                                hsl = opr.tambah(angka1, angka2);
                                System.out.printf("hasil dari %s + %s adalah : %s ",angka1,angka2,hsl);
                                break;
                            case 2:
                                hsl = opr.kurang(angka1, angka2);
                                System.out.printf("hasil dari %s - %s adalah : %s ",angka1,angka2,hsl);
                                break;
                            case 3:
                                hsl = opr.kali(angka1, angka2);
                                System.out.printf("hasil dari %s x %s adalah : %s ",angka1,angka2,hsl);
                                break;
                            case 4:
                                if (angka2==0) {
                                    System.out.println("angka tidak bisa dibagi dengan 0");
                                }else{
                                hsl = opr.bagi(angka1, angka2);
                                System.out.printf("hasil dari %s / %s adalah : %s ",angka1,angka2,hsl);
                                }
                                break;
                            
                            case 5:
                                hsl = opr.modulus(angka1, angka2);
                                System.out.printf("hasil dari %s modulus %s adalah : %s ",angka1,angka2,hsl);
                                break;
                            default:
                                System.out.println("masukkan operasi yang TEPAT !!!");
                                break;
                        }
                        System.out.println("\n\n======== Program Created by Miftah for QA homework - Digital Skola ========");
                        System.out.println("\nApakah anda ingin menghitung lagi??? (y/n)");
                        jwb = obj.next().charAt(0);
                        //obj.close();
                    
                    
                }while(jwb == 'y' || jwb == 'Y');

                
                System.out.println("===PROGRAM BERAKHIR=== \nTERIMA KASIH PARA TUTOR");
                obj.close();
            
            } catch (Exception e) {
                System.out.println("ada ERROR disini Guys "  + e);
         }
    }
}
