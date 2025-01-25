public class Driver {


    public static void main(String[] args) {
        double charge = TicketSystem.getCharge(location.Palmdale, true, 2);
        System.out.println(charge);
        charge = TicketSystem.getCharge(location.Gardena, true, 2);
        System.out.println(charge);
        charge = TicketSystem.getCharge(location.Woodland_Hills, true, 2);
        System.out.println(charge);
        charge = TicketSystem.getCharge(location.Costa_Mesa, true, 2);
        System.out.println(charge);
    }
}
