package uaslp.objetos.parcial2.labs;

import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) { //es static, significa que no le pertenece a ningun objeto y para llamar a métodos del main estos deben de ser tambien estáticos
        List<Figure> figureList = new LinkedList<>();

        figureList.add(new Polygon(4, 5, 6.3f));
        figureList.add(new Polygon(4.5f, 8, 3.9f));
        figureList.add(new Rectangle(4, 5));
        figureList.add(new Rectangle(4.5f, 9.6f));
        figureList.add(new Circle(5.3f));
        figureList.add(new Circle(10.6f));

        for (Figure figure : figureList) {
            System.out.println(figure.getName() + ", Area: " + figure.getArea() + ", Perímetro: " + figure.getPerimetro());
        }

        if (Modifier.isAbstract(Figure.class.getModifiers())) {
            System.out.println("Figure es abstracta");
        }

        System.out.println("Se generaron: " + Figure.getFiguresCreated() + " figuras");
    }
}
/*Salida del programa:
Polígono, Area: 63.0, Perímetro: 31.5
Polígono, Area: 70.200005, Perímetro: 31.2
Rectángulo, Area: 20.0, Perímetro: 18.0
Rectángulo, Area: 43.2, Perímetro: 28.2
Círculo, Area: 88.247345, Perímetro: 33.300884
Círculo, Area: 352.98938, Perímetro: 66.60177
Figure es abstracta
Se generaron: 6 figuras
*/








        /*List<Figure> figureList = new LinkedList<>(); //se hace una lista de Figura s

        figureList.add(new Polygon(4, 5, 6.3f));
        figureList.add(new Polygon(4.5f, 8, 3.9f));
        figureList.add(new Rectangle(4, 5));
        figureList.add(new Rectangle(4.5f, 9.6f));
        figureList.add(new Circle(5.3f));
        figureList.add(new Circle(5.6f));

        for (Figure figure : figureList) {
            System.out.println(figure.getName() + ", Area: " + figure.getArea() + ", Perimetro: " + figure.getPerimetro());
        }

        if (Modifier.isAbstract(Figure.class.getModifiers())) { //si la clase es abstracta escribir la clase es abstracta
            System.out.println("Figura es abstracta");
        }

        System.out.println("Se generaron: " + Figure.getFiguresCreated() + " Figuras");
    }
}*/

/*
    private static  void circlesTest(){
        List<Circle> circleList = new LinkedList<>();
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(10.6f);

        circle1.setRadio(5.3f); //se le pone f para que sepa que es flotante

        circleList.add(circle1);
        circleList.add(circle2);

        for (Circle circle: circleList){
            System.out.println(circle.getName() + ", Area: " + circle.getArea() + ", Perimetro: " + circle.getPerimetro());
        }
    }

    private static  void rectanglesTest(){
        List<Rectangle> rectangleList = new LinkedList<>();
        Rectangle rectangle1 = new Rectangle(4.5f, 9.6f);
        Rectangle rectangle2 = new Rectangle(4.5f, 9.6f);

        rectangleList.add(rectangle1);
        rectangleList.add(rectangle2);

        for ((Rectangle rectangle: rectangleList)){
            System.out.println(rectangle.getName() + ", Area: " + rectangle.getArea() + ", Perimetro: " + rectangle.getPerimetro());
        }
    }

    private static  void polygonsTest(){

    }
}
*/
