public class Inventory {
        private double weight;
        private int count;
    public Inventory(){
        reset();
    }
    public void addItem(int quantity){  // voegt een item toe aan het totaal van een product

        count += quantity;
    }
    public void removeItem(int quantity){ // verwijdert een item van het totaal van een product
        count -= quantity;
    }
    public void addWeight(double weight){
        this.weight = weight;
    }
    public void reset(){ // het reseten van de het aantal producten in het magazijn
        count =0;

    }
    public Integer getWeight() {
        if (weight > 0 && weight < 3) {
            return count++;
        } else if (weight > 4 && weight < 7) {
            return count += 2;
        } else if (weight > 8 && weight < 10) {
            return count += 3;
        } else {
            return count = 0;
        }
    }

    public int getCount() {
        return count;
    }



    }
