public class Main {
    public static void main(String[] args) {
        Combo c = new Combo("Muebles de habitación", 0);
        CondicionPeso cp = new CondicionPeso(40);
        c.addCondicion(cp);

        Individual cama = new Individual("Cama", 7500);
        cama.addCat("habitación");
        cama.setPeso(30);
        Individual silla = new Individual("Silla", 2500);
        silla.addCat("casa");
        silla.setPeso(8);
        Individual mesaDeLuz = new Individual("Mesa de luz", 5000);
        mesaDeLuz.addCat("habitación");
        mesaDeLuz.setPeso(15);
        Individual mesa = new Individual("Mesa", 10000);
        mesa.setPeso(200);

        c.addProducto(cama);
        c.addProducto(silla);
        c.addProducto(mesaDeLuz);
        c.addProducto(mesa);// no la agrega, por pesar 200kg

        System.out.println(c.getPrecio());

        Combo c2 = new Combo("Muebles de cocina/comedor", 0);

        CondicionCat cat = new CondicionCat();
        cat.addCat("cocina");
        cat.addCat("comedor");
        c.addCondicion(cat);

        Individual sillon = new Individual("Sillón", 5000);
        sillon.addCat("living");
        Individual mesaComedor = new Individual("Mesa para comer", 15000);
        mesaComedor.addCat("comedor");
        Individual alacena = new Individual("Alacena", 20000);
        alacena.addCat("cocina");

        c2.addProducto(sillon);// no lo agrega porque no cumple con la condición cat
        c2.addProducto(mesa);
        c2.addProducto(alacena);

        System.out.println(c2.getPrecio());

        for (int i = 0; i < 6; i++) {
            c2.addProducto(silla);
        }

        Individual bajomesadas = new Individual("Bajomesadas", 25000);
        bajomesadas.addCat("cocina");

        Combo c3 = new Combo("Muebles para una casa", 0);
        /*
         * c3 representa todos los muebles de una casa, entonces no DEBE llevar
         * condiciones salvo las del presupuesto
         */

        c3.addProducto(c);
        c3.addProducto(c2);
        c3.addProducto(bajomesadas);

        System.out.println(c3.getPrecio());

        /*
         * debo crear una copia restringida de uno de los combos, elijo el de habitación
         * porque la silla no es exclusivamente de la habitación
         */
        CondicionCat cat2 = new CondicionCat();
        cat2.addCat("habitación");
        c3.addCondicion(cat2);

        System.out.println(c3.getCopiaRestringida().toString());
        // me falta tiempo para redefinir el toString()
    }
}
