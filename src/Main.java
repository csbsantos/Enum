//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Days d= Days.MONDAY;
        System.out.println(d.getNumber());
        System.out.println(d.isWeekday());
        Days d1= Days.SATURDAY;
        System.out.println(d1.getNumber());
        System.out.println(d1.isWeekday());

        Days [] days= Days.values();
        for (Days d2: days){
            System.out.println(d2.name() +  "  " + d2.getNumber());
        }
    }
}
