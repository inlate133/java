import java.util.Currency;

public class CryptoCurrency {

        private String name;
        private double price;

        private static long CirculatingSupply;

        public CryptoCurrency(String name, double price, long circ) {

        }


        static double calculateTotalPrice(CryptoCurrency[] currency) {
                double result = 0;
                for (CryptoCurrency curr : currency) {
                        result += curr.price * CirculatingSupply;
                }
                return result;
        }
}