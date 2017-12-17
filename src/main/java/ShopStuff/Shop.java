package ShopStuff;

import Instruments.Instrument;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addItem(ISell item) {
        this.stock.add(item);
    }

    public ISell removeItem(ISell item) {
        int index = this.stock.indexOf(item);
        return this.stock.remove(index);
    }

    public int stockCount() {
        return this.stock.size();
    }

    public double totalMarkup() {
        double total = 0;
        for(ISell item : stock) {
            total += item.calculateMarkup();
        }
        return total;
    }
}
