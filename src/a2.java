public class a2 {
    //bien local
    public void Local() {
        String nameLocal = "TrangNT";
        String companyLocal = "Padi_TB";
        int ageLocal = 24;



        
        System.out.println("Ten toi la: " + nameLocal);
        System.out.println("Lam tai: " + companyLocal);
        System.out.println("Nam nay: " + ageLocal + " tuoi");
    }

    //bien instance
    String nameInstance = "DiuNT";
    int ageInstance = 24;
    String addressInstance = "Padi_HD";
    public void showStudent_Instance() {
        System.out.println("");
        System.out.println("Thong tin cua bien Instance");
        System.out.println("Name: " + nameInstance);
        System.out.println("Age: " + ageInstance);
        System.out.println("Address: " + addressInstance);
    }

    //bien Static
    public static String nameStatic = "TienNT";
    public static int ageStatic = 26;
    public static String addressStatic = "Padi_HN";
    public void showStudent_Static(){
        System.out.println("\nThong tin cua bien Static");
        System.out.println("My name is: " + SinhVien.nameStatic);
        System.out.println("Age is: " + SinhVien.ageStatic);
        System.out.println("Address is: " + SinhVien.addressStatic);
    }


    //ham main
    public static void main(String[] args) {
        SinhVien thongtinSV = new SinhVien();
        System.out.println("Thong tin cua bien Local");
        thongtinSV.Local();

        System.out.println("");
        System.out.println("Thong tin cua bien Instance");
        System.out.println("Name: " + thongtinSV.nameInstance);
        System.out.println("Age: " + thongtinSV.ageInstance);
        System.out.println("Address: " + thongtinSV.addressInstance);

        System.out.println("\nThong tin cua bien Static");
        System.out.println("My name is: " + SinhVien.nameStatic);
        System.out.println("Age is: " + SinhVien.ageStatic);
        System.out.println("Address is: " + SinhVien.addressStatic);

        thongtinSV.showStudent_Instance();
        thongtinSV.showStudent_Static();
    }
}
