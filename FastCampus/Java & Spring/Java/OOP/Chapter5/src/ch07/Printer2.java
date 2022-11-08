package ch07;

public class Printer2 {
    private Plastic material;

    public Plastic getMaterial() {
        return material;
    }

    public void setMaterial(Plastic material) {
        this.material = material;
    }

    public String toString(){
        return "Material is plastic";
    }
}
