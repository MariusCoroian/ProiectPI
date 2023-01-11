  public class Frizer extends Utilizator{
        String nume;

    public Frizer(String nume, String email, String parola) {
        super(email, parola);
        this.nume = nume;
    }

    public Frizer(String nume) {
        this.nume = nume;
    }
        
    
    public Frizer()
    {
        super();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Frizer{" + "nume=" + nume + '}';
    }
    
    
    }