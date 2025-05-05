abstract class visitorpass{
    abstract int calculateticketprice(int numberofvisitor);
}
class vippass extends visitorpass{
    int price=300;
    @Override
    int calculateticketprice(int numberofvisitor) {
        System.out.println(numberofvisitor*price);
        return 0;
    }
}
class familypass extends visitorpass{
    int price=100;
    @Override
    int calculateticketprice(int numberofvisitor) {
        System.out.println(numberofvisitor*price);
        return 0;
    }
}
class general extends visitorpass{
    int price=50;
    @Override
    int calculateticketprice(int numberofvisitor) {
        System.out.println(numberofvisitor*price);
        return 0;
    }
}
public class Main {
    public static void main(String[] args) {
        visitorpass obj = new vippass();
        obj.calculateticketprice(5);
        visitorpass obj1 = new familypass();
        obj1.calculateticketprice(10);
        visitorpass obj2 = new general();
        obj2.calculateticketprice(20);
    }
}