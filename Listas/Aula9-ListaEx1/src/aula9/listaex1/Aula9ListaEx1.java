package aula9.listaex1;

public class Aula9ListaEx1 {

    public static void main(String[] args) {
        Funcionario eduardo = new Funcionario("Eduardo" ,1500);
        Gerente filipa = new Gerente("Filipa", "242526" ,"Filipa35", 12000);
        Telefonista humberto = new Telefonista(7089, "Humberto", 2500);
        Secretaria  modesi = new Secretaria(190, "Modesi", 2000);
        
        eduardo.mostrar();
        System.out.println("-----------");
        filipa.mostrar();
        System.out.println("-----------");
        humberto.mostrar();
        System.out.println("-----------");
        modesi.mostrar();
        
    }
    
}
