public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa<String, Double>mhs = new Mahasiswa<String, Double>("wijaya", "kadudampit", 089673632.3);

        mhs.print();

        Libmath<Integer, Double>math = new Libmath<Integer,Double>(10, 30.0);
        System.out.println("Hasil pejumlahan:" + math.add());
        

        Libmath<Double, Double>math2 = new Libmath<Double,Double>(10.0, 30.0);
        System.out.println("Hasil pejumlahan:" + math2.add());

        Triangel.hitungLuas(10, 20);
        System.out.print(Triangel.hitungKeliling(10, 20));

    }
}