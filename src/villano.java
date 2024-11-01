
class villano extends personaje {

    public villano(
        String nombre,
        int fuerza,
        int velocidad,
        int vida_hp){
            super(nombre, fuerza, velocidad, vida_hp);
    }
    public void hacerTrampa(personaje oponente){
        int dañoCausado = this.fuerza * 2;
        oponente.vida_hp -= dañoCausado;
        System.out.println(this.nombre + " hizó trampa y duplico su ataque, causando " + dañoCausado +" de daño a " + oponente.nombre);
        System.out.println("");
    }
    public void aumentoDePoder() {
        this.fuerza += 10;
        System.out.println(this.nombre + " usa Aumento de Poder y gana 10 puntos de fuerza temporalmente.");
    } 
    public void golpeRelampago(personaje oponente) {
        int daño = this.velocidad * 2; // Basado en velocidad para hacer daño rápido
        oponente.vida_hp -= daño;
        System.out.println(this.nombre + " usa Golpe Relámpago y causa " + daño + " de daño.");
    }
}

class lobo extends personaje {
    // definir el constructor
    public lobo(
        String nombre,
        int fuerza,
        int velocidad,
        int vida_hp){
            super(nombre, fuerza, velocidad, vida_hp);
    }
    //Hacer trampa y duplicar el ataque
    public void hacerTrampa(personaje oponente){
        int dañoCausado = this.fuerza * 2;
        oponente.vida_hp -= dañoCausado;
        System.out.println(this.nombre + " hizó trampa y duplico su ataque, causando " + dañoCausado +" de daño a " + oponente.nombre);
        System.out.println("");
    }
   
}

class serpiente extends personaje {

    public serpiente(
        String nombre,
        int fuerza,
        int velocidad,
        int vida_hp){
            super(nombre, fuerza, velocidad, vida_hp);
    }
    public void roboDeVida(personaje oponente) {
        int daño = this.fuerza;
        oponente.vida_hp -= daño;
        this.vida_hp += daño / 2; // Recupera la mitad del daño causado
        System.out.println(this.nombre + " usa Robo de Vida, causando " + daño + " de daño y recuperando " + (daño / 2) + " de vida.");
    }
    
    
}
class planta extends personaje {

    public planta (
        String nombre,
        int fuerza,
        int velocidad,
        int vida_hp){
            super(nombre, fuerza, velocidad, vida_hp);
    }
    public void envenenar(personaje oponente){
        final int VENENO = 10;
        int daño = VENENO;
        oponente.vida_hp -= daño;
        System.out.println(this.nombre + "se ha envenenado, reduciendo  " + daño + " su vida ");
        
    }
}

