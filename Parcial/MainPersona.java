import java.util.Scanner;
public class MainPersona{
    public static void main(String[]args){
            Scanner sc = new Scanner(System.in);

                    System.out.println("---Carga datos 1°persona---");
                            System.out.println("Apellido: ");
                                    String ap1 = sc.nextLine();
                                            System.out.println("Edad: ");
                                                    int edad1 = sc.nextInt();
                                                            System.out.println("DNI: ");
                                                                    String dni1 = sc.nextLine();
                                                                            System.out.println("Sexo (H/M): ");
                                                                                    char sexo1 = sc.nextLine();
                                                                                            System.out.println("Peso: ");
                                                                                                    double peso1 = sc.nextDouble();
                                                                                                            System.out.println("Altura: ");
                                                                                                                    double alt1 = sc.nextDouble();
                                                                                                                            sc.nextLine();

                                                                                                                                    Persona p1 = new Persona(ap1, edad1, dni1, sexo1, peso1, alt1);

                                                                                                                                            System.out.println("---Carga datos 2° persona---");
                                                                                                                                                    System.out.println("Apellido: ");
                                                                                                                                                            String ap2 = sc.nextLine();
                                                                                                                                                                    System.out.println("Edad: ");
                                                                                                                                                                            int edad2 = sc.nextInt();
                                                                                                                                                                                    System.out.println("DNI: ");
                                                                                                                                                                                            String dni2 = sc.nextLine();
                                                                                                                                                                                                    System.out.println("Sexo (H/M): ");
                                                                                                                                                                                                            char sexo2 = sc.nextLine();
                                                                                                                                                                                                                    System.out.println("Peso: ");
                                                                                                                                                                                                                            double peso2 = sc.nextDouble();
                                                                                                                                                                                                                                    System.out.println("Altura: ");
                                                                                                                                                                                                                                            double alt2 = sc.nextDouble();
                                                                                                                                                                                                                                                    sc.nextLine();

                                                                                                                                                                                                                                                            Persona p2 = new Persona(ap2, edad2, dni2, sexo2, peso2, alt2);

                                                                                                                                                                                                                                                                    //¿Cuantos son mayores?
                                                                                                                                                                                                                                                                            int mayores = 0;
                                                                                                                                                                                                                                                                                    if(p1.esMayorDeEdad()) mayores ++;
                                                                                                                                                                                                                                                                                            if(p2.esMayorDeEdad()) mayores ++;

                                                                                                                                                                                                                                                                                                    System.out.println("Cantidad de personas mayores de edad: " + mayores);

                                                                                                                                                                                                                                                                                                            //¿Quien es mayor de edad?
                                                                                                                                                                                                                                                                                                                    System.out.println("¿Quien es mayor de edad?");
                                                                                                                                                                                                                                                                                                                            if(p1.esMayorQue(p2)){
                                                                                                                                                                                                                                                                                                                                        System.out.println(p1.getNombre() + "es mayor que" + p2.getNombre());
                                                                                                                                                                                                                                                                                                                                                }else if(p2.esMayorQue(p1)){
                                                                                                                                                                                                                                                                                                                                                            System.out.println(p2.getNombre() + "es mayor que" + p1.getNombre());
                                                                                                                                                                                                                                                                                                                                                                    }else{
                                                                                                                                                                                                                                                                                                                                                                                System.out.println("Tienen la misma edad");
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                //IMC
                                                                                                                                                                                                                                                                                                                                                                                                        System.out.println("Estado del IMC");
                                                                                                                                                                                                                                                                                                                                                                                                                if(p1.calcularIMC()){
                                                                                                                                                                                                                                                                                                                                                                                                                          
                                                                                                                                                                                                                                                                                                                                                                                                                                  }

                                                                                                                                                                                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                                                                                                                                                                                      }









    
