# P2_T2_Herencia-Polimorfismo
![Diagrama de clase:](figuras.png)


@startuml
abstract class Figure{
  -figuresCreated: int;
  -{final} name: Sting;

  #Figure(name: String);
  +getArea(): float;
  +getPerimeter(): float;
  
  +{final}getName(): String;
  +getFiguresCreated(): int;
}

class Circle extends Figure{
  +getArea(): float;
  +getPerimeter(): float;
}

class Rectangle extends Figure{
  +getArea(): float;
  +getPerimeter(): float;
}

class Polygon extends Figure{
  +getArea(): float;
  +getPerimeter(): float;
}

@enduml
