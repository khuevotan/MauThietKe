package designpattern.Behavioral.observerpattern.CachHai.Bai1;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {

    List<Observer> observerList = new ArrayList();
    List<String> dsTin = new ArrayList();

    public void addThongTin(String tin) {
        dsTin.add(tin);
        for (Observer t: observerList){
            t.thongBao(tin, true);
        }
        notifyTopic();
    }

    public void updateThongTin(String thongTin, String thongTinUpdate) {

        int index = dsTin.indexOf(thongTin);
        if (index != -1) {
            dsTin.set(index, thongTinUpdate);
        } else {
            System.out.println("Không thể cập nhật tin!");
        }
        notifyTopic();
    }

    @Override
    public void attach(Observer o) {
        if (!observerList.contains(o)) {
            observerList.add(o);
        }
    }

    @Override
    public void detach(Observer o) {
        if (observerList.contains(o)) {
            observerList.remove(o);
        }
    }

    @Override
    public void notifyTopic() {
        for (Observer o : observerList) {
            o.thongBao(dsTin);
        }
    }
}
