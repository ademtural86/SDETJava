package Class29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        List<Map<String, Object>> dataList = new ArrayList<>();

        HashMap<String, Object> appleMap = new HashMap<>();
        Fruit apple=new Fruit("Apple", 20.00, 10);
        appleMap.put("Items",apple.getFruitName());
        appleMap.put("Price",apple.getPrice());
        appleMap.put("Quantity",apple.getQuantity());
        dataList.add(appleMap);

        HashMap<String, Object> orangeMap = new HashMap<>();
        Fruit orange=new Fruit("Orange", 21.99, 10);
        orangeMap.put("Items",orange.getFruitName());
        orangeMap.put("Price",orange.getPrice());
        orangeMap.put("Quantity",orange.getQuantity());
        dataList.add(orangeMap);

        double totalPurchase=0.0;
        for(Map<String, Object> mapItem: dataList){
            String fruitName=mapItem.get("Items").toString();
            double fruitPrice=(double)mapItem.get("Price");
            double fruitQuantity=(int)mapItem.get("Quantity");
            System.out.println("Items: "+fruitName+" Price: "+fruitPrice+" Quantity: "+fruitQuantity+" SubTotal: "+(fruitPrice*fruitQuantity));
            totalPurchase+=fruitPrice*fruitQuantity;
            System.out.println();
        }
        System.out.println("Your Purchase total : "+totalPurchase);
    }
}

class Fruit{
    private String fruitName;
    private double price;
    private int quantity;

    public Fruit(String fruitName, double price, int quantity) {
        setFruitName(fruitName);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getFruitName() {
        return fruitName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
