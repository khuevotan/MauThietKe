package kiemtra.Cau1;

public class Tour {
    String tenTour;
    int giaBan;
    String thoiGian;

    public Tour(String tenTour, int giaBan, String thoiGian) {
        this.tenTour = tenTour;
        this.giaBan = giaBan;
        this.thoiGian = thoiGian;
    }

    @Override
    public String toString() {
        return "Tour{" + "tenTour=" + tenTour + ", giaBan=" + giaBan + ", thoiGian=" + thoiGian + '}';
    }
}
