package kiemtra.Cau1;

public interface TourBuilder {
    TourBuilder addTour(String tenTour, int giaBan, String thoiGian);
    TourBuilder addDSDiaDiem(String diaDiem);
    TourBuilder hienThi();
    TourDuLich build();
}
