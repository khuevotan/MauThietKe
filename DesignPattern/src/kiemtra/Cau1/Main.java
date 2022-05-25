package kiemtra.Cau1;

public class Main {
    public static void main(String[] args) {
         TourBuilder tourbuilder = new TourConcreteBuilder()
                .addTour("Nha Trang", 100000, "4/4/2022")
                .addDSDiaDiem("Hon Chong");
        
        System.out.println(tourbuilder.build());
        tourbuilder.hienThi();
    }
}
