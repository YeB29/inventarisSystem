public class Inventory {
        private int total;
        private int count;
    public Inventory(){
        reset();
    }
    public void addItem(int quantity){  // voegt een item toe aan het totaal van een product

        count += quantity;
    }
    public void removeItem(int quantity){ // verwijdert een item van het totaal van een product

    }
    public int totalItem(){ // berekent de totale hoeveelheid van een product
        return total;
    }
    public void reset(){ // het reseten van de het aantal producten in het magazijn
        count =0;
        total = 0;
    }

    public int getCount() {
        return count;
    }
}
