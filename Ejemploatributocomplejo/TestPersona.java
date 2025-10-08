public class TestPersona{
    public static void main(String[]args){
        Domicilio dom1 = new Domicilio("San Martin", 1234, "Buenos Aires");
        Persona p1 = new Persona("Ana Lopez", 25, dom1);

        System.out.println(p1);
    }
}
