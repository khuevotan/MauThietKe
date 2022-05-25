package designpattern.Behavioral.chainofresponsibility.XepLoai;

public interface IXepLoai {
    IXepLoai thietLapCaoHon(IXepLoai xepLoai);
    String xepLoai(float diem);
}
