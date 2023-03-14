package bak_lab1_var2;

public class Launch {

    public static void main(String[] args) {
        
        Drone5 drone5 = new Drone5("простой",false,"ARF",15);
        Drone5 drone5_1 = new Drone5("профессиональный",true,"RTF",30);
        Drone5 drone5_2 = new Drone5("универсальный",true,"BNF",35);
        Drone5 drone5_3 = new Drone5("любительский",false,"PNP",20);       
        System.out.println("------------------------------");
        drone5.getPrice().setPrice(500);
        drone5_1.getPrice().setPrice(1000);
        drone5_2.getPrice().setPrice(2000);
        drone5_3.getPrice().setPrice(500);
        
        System.out.println(drone5);
        System.out.println(drone5_1);
        System.out.println(drone5_2);
        System.out.println(drone5_3);
        
        drone5.getSame().add(drone5_3);
        System.out.println();

       System.out.println("Одинкаовые цены с простым дроном:");
       
        for (int i = 0; i < drone5.getSame().size(); i++) {
            System.out.println(drone5.getSame().get(i));
        }
       
    }
    
}
