package aula3.ex2;

public class Retangulo {
    private int base;
    private int altura;
    private float perimetro;
    private float area;

    //Construtor
    public Retangulo(int base, int altura)
    {
        this.base = base;
        this.altura = altura;
    }
    
    //Sobrecarga construtor
    public Retangulo()
    {
        base = 1;
        altura = 1;
    }
    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public float getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
    public void perimetro()
    {
        if (1<base && base<20)
        {
          if (1<altura && altura<20)  
          {
              perimetro = altura + altura + base + base;
              System.out.println("O perimetro é igual a: " + perimetro);
          }
          else
          {
             System.out.println("Sua altura possui valores inválidos\n");
          }
        }
        else
        {
            System.out.println("Sua base possui valores inválidos");
        }
    }
    
    public void area()
    {
        if (1<base && base<20)
        {
          if (1<altura && altura<20)  
          {
              area = (base*altura);
              System.out.println("A area é igual a: " + area);
          }
          else
          {
             System.out.println("Sua altura possui valores inválidos"); 
          }
        }
        else
        {
            System.out.println("Sua base possui valores inválidos");
        }
    }
}
