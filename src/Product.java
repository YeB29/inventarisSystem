import java.time.LocalDate;

public class Product {
    private Integer productId;
    private String name;
    private Double weight;
    private LocalDate expirationDate;

    public Product(String name, Integer productId,Double weight, LocalDate expirationDate){
        this.name= name;
        this.productId = productId;
        this.weight = weight;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public Integer getProductId() {
        return productId;
    }

    public Double getWeight() {
        return weight;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }


}

