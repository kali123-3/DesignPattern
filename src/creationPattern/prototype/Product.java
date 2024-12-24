package creationPattern.prototype;
/*
 Prototype pattern refers to creating duplicate object while keeping performance in mind.
 This type of design pattern comes under creational pattern as this pattern provides one
 of the best ways to create an object.
*/

public abstract class Product implements Cloneable {
    private int id;
    protected String type;

    abstract void draw();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public Product clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
