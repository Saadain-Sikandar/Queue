public class Main {
    public static void main(String[] args) {

        HospitalQueue h1 = new HospitalQueue(5);
        Patient p1 = new Patient("Joe","good",6,"flu");
        Patient p2 = new Patient("Ali","bad",3,"fever");
        Patient p3 = new Patient("John","good",5,"flu");
        Patient p4 = new Patient("Doe","bad",1,"attack");
        Patient p5 = new Patient("phil","good",8,"flu");
        Patient p6 = new Patient("babar","good",5,"headache");
        Patient p7 = new Patient("shaan","good",9,"back pain");
        Patient p8 = new Patient("jessica","good",1,"flu");

        h1.AddPatient(p1);
        h1.AddPatient(p2);
        h1.AddPatient(p3);
        h1.AddPatient(p4);

        h1.DisplayAllPatient();

        h1.Treatnext();
        h1.Treatnext();
        h1.Treatnext();
        h1.Treatnext();

        h1.AddPatient(p5);
        h1.AddPatient(p6);
        h1.AddPatient(p7);
        h1.AddPatient(p8);

        h1.DisplayAllPatient();

        h1.Treatnext();
        h1.Treatnext();
        h1.Treatnext();
        h1.Treatnext();






    }
}