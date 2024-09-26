public class ExchangeTest {
        public static void main(String args[]) {

            Curency eur = new Curency();
            eur.setRate(1.11);
            Curency yen = new Curency();
            yen.setRate(0.01);
            Curency rub = new Curency();
            rub.setRate(0.01);

            double convertEURtoUSD = Exchange.convert(100, eur);
            double convertYENtoUSD = Exchange.convert(100, yen);
            double convertRUBtoUSD = Exchange.convert(100, rub);
        }
}
