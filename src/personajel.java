// Clase base del personaje
class personaje {
    String nombre;
    int fuerza;
    int velocidad;
    int vida_hp;

    // Definir constructor
    public personaje (
            String nombre,
            int fuerza,
            int velocidad,
            int vida_hp) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.vida_hp = vida_hp;
    }
    //Metodo para atacar a otro personaje
    //Para el ataque a el oponete la vida se le reduce lo que tiene el heroe de fuerza
    public void atacar(personaje oponente){
        int dañoCausado = this.fuerza;
        oponente.vida_hp -= dañoCausado;
       
        for (int i = 0; i < 10; i++) {
            try {
                 // Pausa de 100 milisegundos para la animación
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("=>");
        }
        System.out.println(" ¡Impacto!");
        System.out.println(this.nombre + " atacó a " + oponente.nombre + " y hizo " + dañoCausado + " de daño");
        System.out.println("");
    }

    //Metodo para recuperarse ()
    public void recuperarse(){
        if(this.vida_hp < 100){
            this.vida_hp += 20;
            System.out.println(this.nombre + " se ha recuperado y ahora tiene " + this.vida_hp + " de vida");
            
        }else{
            System.out.println("No se puede aumentar la vida porque está llena ");
        }
       
        System.out.println("");
    }
    //Mostrar estadisticas 
    public void mostrarEstadiscas(){
        System.out.println("--------------------------");
        System.out.println("Estadisticas de " + this.nombre);
        System.out.println("--------------------------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Fuerza: " + this.fuerza);
        System.out.println("velocidad: " + this.velocidad);
        System.out.println("vida: " + this.vida_hp);
        System.out.println("--------------------------");
        System.out.println("");

    }
}