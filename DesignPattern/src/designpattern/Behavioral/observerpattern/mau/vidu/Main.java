/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Behavioral.observerpattern.mau.vidu;

/**
 *
 * @author THIS PC
 */
public class Main {

    public static void main(String args[]) {
        // tạo các đối tượng để thử nghiệm
        AverageScoreDisplay averageScoreDisplay
                = new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay
                = new CurrentScoreDisplay();

        // chuyển màn hình sang dữ liệu Cricket
        CricketData cricketData = new CricketData();

        //đăng ký các phần tử hiển thị
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreDisplay);

        // trong ứng dụng thực, bạn sẽ có một số logic để
        // gọi hàm này khi dữ liệu thay đổi
        cricketData.dataChanged();

        //remove an observer 
        cricketData.unregisterObserver(averageScoreDisplay);

        // bây giờ chỉ currentScoreDisplay mới có
        // thông báo
        cricketData.dataChanged();
    }
}
