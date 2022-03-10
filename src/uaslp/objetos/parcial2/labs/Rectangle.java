package uaslp.objetos.parcial2.labs;

class Rectangle extends Figure{
    private float base;
    private float height;

    public Rectangle(){
        super("Rectangle");
    }

    public Rectangle( float base, float height){
        super("Rectangle");

        this.base = base;
        this.height = height;
    }

    public float getArea() {
        return base * height;
    }

    public float getPerimetro() {
        return 2*base + 2*height;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
