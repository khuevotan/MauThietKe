package designpattern.Behavioral.chainofresponsibility.XepLoai;

public class YeuKem implements IXepLoai {
    String nhan;
    float min;

    public YeuKem(String nhan, float min) {
        this.nhan = nhan;
        this.min = min;
    }

    @Override
    public IXepLoai thietLapCaoHon(IXepLoai xepLoai) {
        return null;
    }

    @Override
    public String xepLoai(float diem) {
        if (diem >= min)
            return nhan;
        return "Điểm ngoài phạm vi";
    }
}

