public class UnitateLuptaSimpla implements UnitateLupta {
    private int viata, putere;


    public UnitateLuptaSimpla(int viata, int putere) {
        this.viata = viata;
        this.putere = putere;
    }

    @Override
    public boolean esteViu() {
        return viata > 0;
    }

    @Override
    public void ranire(int d) {
        if(this.esteViu()) {
            viata -= d;
            
        }
    }

    @Override
    public void loveste(UnitateLupta u) {
        if(this.esteViu()) {
            u.ranire(putere);
        } else {
            u.ranire(0);
        }

    }
    
}
