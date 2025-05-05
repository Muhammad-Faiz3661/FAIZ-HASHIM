interface display{
    void show();
}
interface aircraft extends display{
    void aircrafttype();
    void calculatecapacity();
}
class pessengerjet implements aircraft {
    int rows=5;
    int seatsperrow=5;
    String aircraftname="pessengerjet";
    public void calculatecapacity() {
        int capacity = rows * seatsperrow;
        System.out.println("YOUR pessengerjet capacity :" + capacity);
    }
    @Override
    public void aircrafttype() {
        System.out.println("YOUR AIRCRAFT NAME IS :"+aircraftname);
    }
    public void show(){
        System.out.println("YOUR TOTAL CAPACITY :");
        this.calculatecapacity();
        this.aircrafttype();
    }
}
class cargoplane implements aircraft{
        int lenght=5 ;
        int width=10;
        String aircraftname="cargoplane";
    @Override
    public void aircrafttype() {
        System.out.println("YOUR AIRCRAFTNAME IS :"+aircraftname);
    }

    public void calculatecapacity(){
            int area=lenght*width;
            System.out.println("YOUR CARGOPLANE CAPACITY :"+area);
        }

    @Override
    public void show() {
        this.calculatecapacity();
        this.aircrafttype();
    }
}
class privatejet implements aircraft{
    int luxuryseats=10;
    String aircraftname="Privatejet";

    @Override
    public void aircrafttype() {
        System.out.println("YOUR AIRCRAFT NAME IS :"+aircraftname);
    }

    public void calculatecapacity(){
        System.out.println("Privatejet fixed seats :"+luxuryseats);
    }

    @Override
    public void show() {
        this.calculatecapacity();
        this.aircrafttype();
    }
}
public class task1 {
    public static void main(String[] args) {
        aircraft obj = new cargoplane();
        obj.show();
        aircraft obj1 = new pessengerjet();
        obj1.show();
        aircraft obj2 = new privatejet();
        obj2.show();
    }
}