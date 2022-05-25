package kiemtra.Cau1;

import java.util.ArrayList;
import java.util.List;

public class TourConcreteBuilder implements TourBuilder{
    
    Tour tour;
    List<DSDiaDiem> dsDiaDiem = new ArrayList<>();

    @Override
    public TourBuilder addTour(String tenTour, int giaBan, String thoiGian) {
        tour = new Tour(tenTour, giaBan, thoiGian);
        return this;
    }

    @Override
    public TourBuilder addDSDiaDiem(String diaDiem) {
        dsDiaDiem.add(new DSDiaDiem(diaDiem));
        return this;
    }
    
    @Override
    public TourBuilder hienThi(){
       System.out.println("tour=" + tour + ", dsDiaDiem=" + dsDiaDiem);
       return this;
    }

    @Override
    public TourDuLich build() {
        return new TourDuLich(tour, dsDiaDiem);
    }
}
