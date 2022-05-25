/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Structural.adapterpattern.vidu;

/**
 *
 * @author THIS PC
 */
public class BirdAdapter implements ToyDuck {

    // Bạn cần triển khai giao diện của mình
    // khách hàng mong muốn sử dụng.
    Bird bird;

    public BirdAdapter(Bird bird) {
        // chúng ta cần tham chiếu đến đối tượng mà chúng ta
        // đang thích nghi
        this.bird = bird;
    }

    @Override
    public void squeak() {
        // dịch các phương thức một cách thích hợp
        bird.makeSound();
    }
}
