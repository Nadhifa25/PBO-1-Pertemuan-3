public class Operator{
    public static void main (String[] args) {
        // System.out.println("");
        // operator operand
        // binary
        // assigment
        String nama = "Dhifa";
        int jumalahSks = 144;
        double ipk = 3.80;
        String username = "admin";
        String password = "admin";

        //aritmatika
        System.out.println(1 + 2);
        System.out.println(1 - 2);
        System.out.println(1 * 2);
        System.out.println(1 / 2);
        System.out.println(1 % 2);

        //unary
        System.out.println(jumalahSks++); //tampil dulu kemudian increment
        System.out.println(++jumalahSks); //increment dulu kemudian tampil

        System.out.println(jumalahSks--);
        // tidak bisa System.out.println(jumalahSks**);
        // tidak bisa System.out.println(jumalahSks//);

        //ternary
        System.out.println(ipk > 3.5 ? "Dengan pujian" : "B aja");

        String usernameInputan = "admin";
        String passwordInputan = "admin";
        
        if(usernameInputan.equals(username)){
            if(passwordInputan.equals(password)){
                System.out.println("Berhasil");
            } else {
                System.out.println("Username / Password salah");
            }
        } else {
            System.out.println("Username / Password salah");
        }

        if(usernameInputan.equals(username) && passwordInputan.equals(password)){
            System.out.println("Berhasil");
        } else {
            System.out.println("Username / Password salah")
        }

        double totalBelanja = 53000;
        double uangDiDompet = 25000;
        double angsul = 0;
        if(uangDiDompet < totalBelanja){
            System.out.println("Kurang"); 
        } else if (uangDiDompet > totalBelanja){
            angsul = uangDiDompet - totalBelanja;
            System.out.println("Cukup, angsul: " + angsul); 
        } else {
            System.out.println("Pas"); 
        }

        System.out.println(angsul);
        //scope
    }
}