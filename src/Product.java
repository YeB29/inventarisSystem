import java.time.LocalDate;

public class Product {
    private String naam;
    private Double gewicht;
    private int productId;
    private LocalDate houdsbaarheidsdatum;

    public Product(String naam, Double gewicht, int productId, LocalDate houdsbaarheidsdatum){
        this.naam = naam;
        this.gewicht = gewicht;
        this.houdsbaarheidsdatum = houdsbaarheidsdatum;
        this.productId = productId;
    }

    public void addProduct(){}

    public void removeProduct(){}

    public void totalItem(){}
}
