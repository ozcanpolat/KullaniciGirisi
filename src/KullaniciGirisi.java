import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;

        Scanner input= new Scanner(System.in);
        System.out.print("Kullanıcı Adınız :");
        userName=input.nextLine();
        System.out.print("Şifreniz :");
        password=input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız !");
        }else
            System.out.println("Hatalı Giriş Yaptınız.");
    }
}
