import java.time.LocalDate;
import java.util.Locale;

public class Material {
    private String id;
    private String name;
    private LocalDate manufacturingDate;
    private int cost;

    public Material() {

    }

    public Material(String id, String name, LocalDate manufacturingDate,int cost) {
        this.id = id;
        this.name = name;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;

    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public LocalDate manufacturingDate(){
        return manufacturingDate;
    }
    public void LocaDate

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }
}
