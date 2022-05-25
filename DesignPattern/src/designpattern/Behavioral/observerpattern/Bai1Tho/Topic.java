package designpattern.Behavioral.observerpattern.Bai1Tho;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<IThongTin> topics = new ArrayList();
    List<String> dsTin = new ArrayList();
    public void attach(IThongTin t){
        topics.add(t);
    }
    public void detach(IThongTin t){
        if(topics.contains(t))
            topics.remove(t);
    }

    public void taoTin(String tin){
        dsTin.add(tin);
        for (IThongTin t: topics){
            t.update(tin, true);
        }
    }

    public void capNhatTin(String tinCu, String tinMoi){
        if (dsTin.contains(tinCu)){
            tinCu = tinMoi;
            for (IThongTin t: topics){
                t.update(tinMoi, false);
            }
        }

    }
}
