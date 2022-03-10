package uaslp.objetos.parcial2.labs;

abstract class Figure { //es abstract para que pueda tener métodos abstracts
    private static int figuresCreated; //cada que se haga un objeto figura, este se incrementa por eso es estático
    private String name;

    protected Figure(String name){
        this.name = name;

        figuresCreated++;
    }

    public abstract float getArea(); //no lleva cuerpo si es abstracto porque no se sabe qué debe hacer el método

    public abstract float getPerimetro();

    public final String getName(){  //Aqui hay un final, quiere decir que no se puede usar herencia ahí
        return name;
    }

    public static int getFiguresCreated(){
        return figuresCreated;
    }

}
