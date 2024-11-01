import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       
        lobo lobo = new lobo("Lobo", 25, 35, 100);
        serpiente serpiente = new serpiente("Dulcecita", 22, 30, 95);
        villano villano = new villano("Bestia", 35, 20, 100);
        planta planta = new planta("Enredadera", 20, 30, 100);
        principe principe = new principe("Eric", 30, 25, 100);
        

        Scanner scanner = new Scanner(System.in);


        System.out.println(" El Reino de Verdalia está en peligro. La Princesa Rapunzel ha sido secuestrada y llevada a una torre custodiada por la Bestia. Solo el valiente Príncipe Eric podrá enfrentar los peligros del Bosque Oscuro y la Torre Espinosa para salvarla");
       
       
        System.out.println("-------BATALLA ENTRE EL PRINCIPE Y LA PLANTA-------");
        System.out.println("Esta planta puede envenenar");

        while (principe.vida_hp > 0 && planta.vida_hp > 0) {
            System.out.println("------Turno de el principe-------");
            planta.mostrarEstadiscas();
            
            System.out.println("Elige una opcion para el principe:");
            System.out.println("1. Atacar");
            System.out.println("2. Ataque especial");
            System.out.println("3. Ataque potenciado");
            System.out.println("4. Recuperarse");
            System.out.println("5. Escudo protector");
            System.out.println("6. Recuperacion rapida ");
            System.out.println("Opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    principe.atacar(planta);
                    break;
                case 2:
                    principe.ataqueEspecial(planta);
                    break;
                case 3:
                    principe.recuperarse();
                    break;
                case 4:
                    principe.ataquePotenciado(planta);
                    break;
                case 5:
                    principe.escudoProtector();
                    break;
                case 6:
                    principe.recuperacionRapida();
                    break;
                case 7:
                    principe.atacarPoderes(planta, 3);
                default:
                    System.out.println("opcion no valida");
                    break;
            }
            if(planta.vida_hp <= 0){
                System.out.println("Enredadera ha sido derrotada, el principe Eric gana");
                break;
            }

            System.out.println("------Turno de Enredadera-------");
            principe.mostrarEstadiscas();

            System.out.println("Elige una opcion para Enredadera:");
            System.out.println("1. Atacar");
            System.out.println("2. Envenenar");
            System.out.println("3. Recuperarse");
            System.out.println("Opcion: ");
             opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    planta.atacar(principe);
                    break;
                case 2:
                    planta.envenenar(principe);
                    break;
                case 3:
                    planta.recuperarse();
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }

            if(principe.vida_hp <= 0){
                System.out.println("El princioe ha sido derrotado, Enredadera gana");
                break;
            }

        }

        if (principe.vida_hp > 0) {
            System.out.println("-------BATALLA ENTRE EL PRINCIPE Y EL LOBO-------");
            while (principe.vida_hp > 0 && lobo.vida_hp > 0) {
            
            System.out.println("------Turno de el principe-------");
            lobo.mostrarEstadiscas();
            
            System.out.println("Elige una opcion para el principe:");
            System.out.println("1. Atacar");
            System.out.println("2. Ataque especial");
            System.out.println("3. Ataque potenciado");
            System.out.println("4. Recuperarse");
            System.out.println("5. Escudo protector");
            System.out.println("6. Recuperacion rapida ");
            System.out.println("Opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    principe.atacar(lobo);
                    break;
                case 2:
                    principe.ataqueEspecial(lobo);
                    break;
                case 3:
                    principe.recuperarse();
                    break;
                case 4:
                    principe.ataquePotenciado(lobo);
                    break;
                case 5:
                    principe.escudoProtector();
                    break;
                case 6:
                    principe.recuperacionRapida();
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
            if(lobo.vida_hp <= 0){
                System.out.println("El lobo ha sido derrotado, el principe Eric gana");
                break;
            }

            System.out.println("------Turno de el lobo-------");
            principe.mostrarEstadiscas();

            System.out.println("Elige una opcion para el lobo:");
            System.out.println("1. Atacar");
            System.out.println("2. Hacer trampa");
            System.out.println("3. Recuperarse");
            System.out.println("Opcion: ");
             opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    lobo.atacar(principe);
                    break;
                case 2:
                    lobo.hacerTrampa(principe);
                    break;
                case 3:
                    lobo.recuperarse();
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }

            if(principe.vida_hp <= 0){
                System.out.println("El principe Eric ha sido derrotado, el lobo gana");
                break;
            }
        }
     }
        if (principe.vida_hp > 0) {
            System.out.println("-------BATALLA ENTRE EL PRINCIPE Y LA SERPIENTE-------");
            while (principe.vida_hp > 0 && serpiente.vida_hp > 0) {
            
                System.out.println("------Turno de el principe-------");
                lobo.mostrarEstadiscas();
                System.out.println("Elige una opcion para el principe:");
                System.out.println("1. Atacar");
                System.out.println("2. Ataque especial");
                System.out.println("3. Ataque potenciado");
                System.out.println("4. Recuperarse");
                System.out.println("5. Escudo protector");
                System.out.println("6. Recuperacion rapida ");


                System.out.println("Opcion: ");
                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        principe.atacar(serpiente);
                        break;
                    case 2:
                        principe.ataqueEspecial(serpiente);
                        break;
                    case 3:
                        principe.recuperarse();
                        break;
                    case 4:
                        principe.ataquePotenciado(serpiente);
                        break;
                    case 5:
                        principe.escudoProtector();
                        break;
                    case 6:
                        principe.recuperacionRapida();
                        break;
                    default:
                        System.out.println("opcion no valida");
                        break;
                }
                if(serpiente.vida_hp <= 0){
                    System.out.println("Dulcecita ha sido derrotata, el principe Eric gana");
                    break;
                }
            
                System.out.println("------Turno de la serpiente-------");
                principe.mostrarEstadiscas();
            
                System.out.println("Elige una opcion para el lobo:");
                System.out.println("1. Atacar");
                System.out.println("2. Robo de vida");
                System.out.println("3. Recuperarse");
                System.out.println("Opcion: ");
                 opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        serpiente.atacar(principe);
                        break;
                    case 2:
                        serpiente.roboDeVida(principe);
                        break;
                    case 3:
                        serpiente.recuperarse();
                        break;
                    default:
                        System.out.println("opcion no valida");
                        break;
                }
            
                if(principe.vida_hp <= 0){
                    System.out.println("El principe Eric ha sido derrotado, Dulcecita gana");
                    break;
                }
            }
        }
        

        if (principe.vida_hp > 0) {

            System.out.println("El principe Eric ha llegado a la torre donde se encuentra la princesa ");
        
            princesa rapunzel = new princesa("Rapunzel");
        
            System.out.println("La princesa " + rapunzel.nombre + " debe tomar una decisión:");
            System.out.println("1. Quedarse con el héroe.");
            System.out.println("2. Quedarse con el villano.");
            System.out.print("Elige una opción (1 o 2): ");
            
            int decision = scanner.nextInt();
            if (decision == 1) {
            // si elige al héroe
            
                System.out.println("-------BATALLA ENTRE EL PRINCIPE Y LA BESTIA-------");
                 while (principe.vida_hp > 0 && villano.vida_hp > 0) {

                    System.out.println("------Turno de el principe-------");
                    villano.mostrarEstadiscas();

                    System.out.println("Elige una opcion para el principe:");
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque especial");
                    System.out.println("3. Ataque potenciado");
                    System.out.println("4. Recuperarse");
                    System.out.println("5. Escudo protector");
                    System.out.println("6. Recuperacion rapida ");
                    System.out.println("Opcion: ");
                    int opcion = scanner.nextInt();
                    
                     switch (opcion) {
                         case 1:
                             principe.atacar(villano);
                             break;
                         case 2:
                             principe.ataqueEspecial(villano);
                             break;
                         case 3:
                             principe.recuperarse();
                             break;
                         case 4:
                             principe.ataquePotenciado(villano);
                             break;
                         case 5:
                             principe.escudoProtector();
                             break;
                         case 6:
                             principe.recuperacionRapida();
                             break;
                         default:
                             System.out.println("opcion no valida");
                             break;
                     }
                     if(villano.vida_hp <= 0){
                         System.out.println("La bestia ha sido derrotado, el principe Eric gana");
                         break;
                     }
                 
                     System.out.println("------Turno de la bestia-------");
                     principe.mostrarEstadiscas();
                 
                     System.out.println("Elige una opcion para el lobo:");
                     System.out.println("1. Atacar");
                     System.out.println("2. Hacer trampa");
                     System.out.println("3. Recuperarse");
                     System.out.println("Opcion: ");
                      opcion = scanner.nextInt();
                     switch (opcion) {
                         case 1:
                             villano.atacar(principe);
                             break;
                         case 2:
                             villano.hacerTrampa(principe);
                             break;
                         case 3:
                             villano.recuperarse();
                             break;
                         case 4:
                             villano.aumentoDePoder();
                              break;
                         case 5:
                             villano.golpeRelampago(principe);
                              break;
                         default:
                             System.out.println("opcion no valida");
                             break;
                     }
                 
                     if(principe.vida_hp <= 0){
                         System.out.println("El principe Eric ha sido derrotado, la bestia gana");
                         break;
                     }
            } } else if (decision == 2) {
                // Bloque de código si elige al villano
                System.out.println(rapunzel.nombre + " decidió quedarse con el villano.");

            } else {
                // Validación si el usuario elige una opción no válida
                System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                 // Vuelve a pedir la decisión
            }
                 
        }
        scanner.close();
    }
}

