class principe extends personaje {
    // definir el constructor
    public principe (
        String nombre,
        int fuerza,
        int velocidad,
        int vida_hp){
            super(nombre, fuerza, velocidad, vida_hp);
    }
    //Ataque especial 
    public void ataqueEspecial(personaje oponente){
        int dañoCausado = this.fuerza * 2;
        oponente.vida_hp -= dañoCausado;
        System.out.println(this.nombre + " usó un ataque especial y causo " + dañoCausado + " de daño");
        System.out.println("");
    }
    //Sobrecarga del metodo para aumentar sus poderes
    public void atacarPoderes(personaje oponente, int multiplicadorPoderes){
        int dañoCausado = this.fuerza * multiplicadorPoderes;
        oponente.vida_hp -= dañoCausado;
        System.out.println(this.nombre + " atacó con un multiplicador de poderes por " + multiplicadorPoderes + " e hizo " + dañoCausado + " de daño a " + oponente.nombre);
        System.out.println("");
    }
    public void ataquePotenciado(personaje oponente) {
        final int ATAQUE = 2;
        int daño = this.fuerza * ATAQUE;
        oponente.vida_hp -= daño;
        System.out.println(this.nombre + " usa un ataque potenciado y causa " + daño + " de daño.");
    }
    public void escudoProtector() {
        System.out.println(this.nombre + " activa el Escudo Protector, reduciendo el próximo daño a la mitad.");
        this.fuerza /= 2;
    }
    public void recuperacionRapida() {
        this.vida_hp += 50;
        System.out.println(this.nombre + " usa Recuperación Rápida y gana 50 de vida.");
    }
    
    
}

