package bak_lab1_var2;

import java.util.ArrayList;

public class Drone5 extends Drone4 {

    @Override
    public String toString() {
        return "Drone5{" + super.toString() + price + "$" + '}';
    }

    public Drone5() {
    }

    public Drone5(String type, boolean camera, String version, int speed) {
        super(type, camera, version, speed);
    }
    
    
    private ArrayList<Drone5> same = new ArrayList<>();

    public ArrayList<Drone5> getSame() {
        return same;
    }

    private DronePrice price = new DronePrice();

    public DronePrice getPrice() {
        return price;
    }

    class DronePrice {
        
        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
        private int price; 
        
        @Override
        public String toString() {
            return ", price=" + price;
        }
    }
}
