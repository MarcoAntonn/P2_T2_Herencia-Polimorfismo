package uaslp.objetos.parcial2.labs;

class Circle extends Figure{//antes de ejecutar su propio código llama al del papa
    private float radio;

    //Constructor 1
    public Circle(){
        super("Circulo"); //super hace referencia a la clase padre
        //Solamente se puede llamar el método como la primera instruccion en el constructor de la clase hija
    }

    //Constructior 2
    public Circle(float radio) { //Esto es sobrecarga
        super("Circulo");
        this.radio = radio;
    }

    public float getArea() {
        return (float) (Math.PI * radio * radio); //el float es un cast a flotante
    }

    public float getPerimetro() {
        return (float) (Math.PI * 2 * radio);
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
}
