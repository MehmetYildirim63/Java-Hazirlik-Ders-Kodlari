public abstract class GameCalculator {
    //abstrack ekledigimiz zaman bütün extens ettigi classlarda implament etmesi yani bulundurması zorunludur
    public abstract void hesapla();
    //final dedigimiz zaman bu metot hiç bir class da degişmez
    public  final void  gameOver(){
        System.out.println("Oyun Bitti...");
    }
}
