package ch07;

public class Printer1 {
    private Powder material;

    public Powder getMaterial() {
        return material;
    }

    public void setMaterial(Powder material) {
        this.material = material;
    }

    public String toString(){
        return "Material is powder";
    }
}
