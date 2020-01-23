public class Item {

    private String num = "";
    private String des = "";
    private double price;

    Item (double p, String n, String d) {

        price = p;
        des = d;
        num = n;
        if(price < 0){
            price = 0;

        }
    }

    public double getTotalPrice(int n){
        if(n <= 0){
            n = 0;
        }
        return price;
    }

    public String toString(){
        return "Item: "+num+"\nPrice: "+price+"\nDescription: "+des;
    }
}