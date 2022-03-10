package uaslp.objetos.parcial2.labs;

public class Polygon extends Figure{
    private float apotema;
    private int sidesCount;
    private float sideLenght;

    public Polygon(float apotema, int sidesCount, float sideLenght){
        super("Polygon");

        this.apotema = apotema;
        this.sidesCount = sidesCount;
        this.sideLenght = sideLenght;
    }

    public float getArea() {
        return getPerimetro()*apotema/2;
    }

    public float getPerimetro() {
        return sidesCount * sideLenght;
    }

}
