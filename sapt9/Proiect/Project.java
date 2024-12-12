public abstract class Project implements Risky {
    private String titlu;
    private String obiectiv;
    private long fonduri;


    public Project(String titlu, String obiectiv, long fonduri) {
        this.titlu = titlu;
        this.obiectiv = obiectiv;
        this.fonduri = fonduri;
    }

    public abstract void addMember(Member m);


    public String getTitlu() {
        return this.titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getObiectiv() {
        return this.obiectiv;
    }

    public void setObiectiv(String obiectiv) {
        this.obiectiv = obiectiv;
    }

    public long getFonduri() {
        return this.fonduri;
    }

    public void setFonduri(long fonduri) {
        this.fonduri = fonduri;
    }

    @Override
    public String toString() {
        return "Titlu: " + titlu + " obiectiv: " + obiectiv + " fonduri " + fonduri;
    }


}