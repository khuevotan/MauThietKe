package designpattern.Behavioral.chainofresponsibility.XepLoai;

public class MainXepLoai61cntt2 {
    public static void main(String[] args) {
        IXepLoai xuatSac = new XepLoai("Xuất sắc", 9);
        IXepLoai gioi = new XepLoai("Giỏi", 8);
        IXepLoai kha = new XepLoai("Khá", 7);
        IXepLoai tb = new XepLoai("Trung bình", 5);
        IXepLoai yeu_kem = new XepLoai("Yếu kém", 0);

        xuatSac.thietLapCaoHon(gioi)
                .thietLapCaoHon(kha)
                .thietLapCaoHon(tb)
                .thietLapCaoHon(yeu_kem);

        System.out.println("Điểm 6.5: " + xuatSac.xepLoai(6.5F));
    }
}
