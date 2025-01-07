//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CircularQueue c1 = new CircularQueue(5);
        c1.Addorder(23,"Pizza",3);
        c1.Addorder(24,"Burger",4);
        c1.Addorder(25,"Rice",5);
        c1.Addorder(26,"zingster",6);


        c1.NextOrder();

        c1.DisplayAllorders();

        c1.NextOrder();

        c1.DisplayAllorders();



    }
}