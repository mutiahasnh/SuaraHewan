public class MainClass {
    public static void main(String[] args){
        Anjing anjing1 = new Anjing();
        anjing1.tampilSuara();
        anjing1.showInfo("Snowy",10);

        Kucing kucing1 = new Kucing();
        kucing1.tampilSuara();
        kucing1.showInfo("White",12);

        Kambing kambing1 = new Kambing();
        kambing1.tampilSuara();
        kambing1.showInfo("Ujang",8);
    }
}
