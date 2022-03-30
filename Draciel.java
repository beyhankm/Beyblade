public class Draciel extends Beyblade{
    private String kutsalCanavar;
    public Draciel(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar=kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+" "+ kutsalCanavar+" ı ortaya çıkar.");
        System.out.println(getBeybladeci()+ " 'ın savunması : Kale Savunması");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavarın Adı : " + kutsalCanavar);
    }
}
