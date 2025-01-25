
public class TicketSystem {
        public static double getCharge(location place, boolean isAdult,
                int numTickets) {
            double basicCharge = 0.0, totalCharge = 0.0;
            switch (place) {
            case Palmdale:
                basicCharge = 10.5;
                break;
            case Gardena:
                basicCharge = 12.5;
                break;
            case Woodland_Hills:
                basicCharge = 15.5;
                break;
            case Costa_Mesa:
                basicCharge = 16.5;
                break;
            }
            if (!isAdult) {
                basicCharge *= 0.5;
            }
            totalCharge = basicCharge * numTickets;
            return totalCharge;
        }
}
