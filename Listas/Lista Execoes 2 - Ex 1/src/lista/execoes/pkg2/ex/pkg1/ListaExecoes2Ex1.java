package lista.execoes.pkg2.ex.pkg1;

/*

Aula 16, Lista de Exceções 2 - Exercício 1    04.05.20022
Nome: Júlia Téles Cruz      RA: 200558      3ºINFD

Crie duas classes: Ponto2D e Ponto3D. Ponto2D possui como atributos as coordenadas
x e y, enquanto Ponto3D, além delas, também possui a coordenada z. Utilize a relação de
herança para representar estas classes. A respeito dos construtores, Ponto2D deve ter
apenas um construtor, que recebe os valores de x e y como parâmetros (tipo double). Já
Ponto3D também deve ter apenas um construtor, que deve receber x, y e z como
parâmetros (também do tipo double).
Dica: Se a relação de herança e a declaração dos construtores foram feitas
corretamente, você deverá, obrigatoriamente, chamar o construtor da superclasse
explicitamente.
Ambas as classes devem sobrescrever o método toString(), que é originalmente
declarado a classe Object. Este método deve retornar uma representação do objeto em
forma de String, indicando qual o valor de cada coordenada. É importante que Ponto3D
tire proveito do método toString() de Ponto2D para mostrar os valores das coordenadas
x e y.


*/

public class ListaExecoes2Ex1 {

    public static void main(String[] args) {
        Ponto2D n = new Ponto2D(2,6);
        Ponto3D m = new Ponto3D(3,6,8);
        
        n.toString();
        m.toString();
    }
    
}
