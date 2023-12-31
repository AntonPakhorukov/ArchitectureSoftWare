package LIP_03;
/**
 * SOLID
 * LIP - принцип подстановки Барбары Лисков
 * Если П является подтипом Т, то любые объекты типа Т,
 * присутствующие в программе, могут заменяться объектами
 * типа П без негативных последствий для функциональности
 * программы.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Сложно было придумать аналогию, решил сделать так.
         * При замене класса Jeep на класс Sedan, последствий не будет
         */
        Sedan sedan = new Sedan(2,5);
        Jeep jeep = new Jeep(2, 5);
        System.out.println("На парковке седан занимает площадь равной " + sedan.parkingArea() + " метров");
        System.out.println("На парковке джип занимает площадь равной " + jeep.parkingArea() + " метров");
    }
}
