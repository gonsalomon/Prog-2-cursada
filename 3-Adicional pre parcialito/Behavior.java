abstract class Behavior {
    public boolean mgLibro(Libro l1, Persona pp) {
        return true;
    };
}

class BehaviorAutor extends Behavior {
    @Override
    public boolean mgLibro(Libro l1, Persona pp) {
        return pp.mgAutor(l1.getAutor());
    }
}

class BehaviorGenero extends Behavior {
    @Override
    public boolean mgLibro(Libro l1, Persona pp) {
        return pp.mgGenero(l1.getGenero());
    }
}

class BehaviorExigente extends Behavior {
    @Override
    public boolean mgLibro(Libro l1, Persona pp) {
        return pp.mgAutor(l1.getAutor()) && pp.mgGenero(l1.getGenero());
    }
}