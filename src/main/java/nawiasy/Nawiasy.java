package nawiasy;

public class Nawiasy {
    public boolean metoda(String tekst) {
        int sum = 0;
        boolean result;
        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == ('(')) {
                sum += 1;
            } else if (tekst.charAt(i) == (')')) {
                sum += -1;
            }
            if (sum < 0) {
                return false;
            }
        }
        if (sum != 0) {
            result = false;
        } else result = true;
        return result;
    }
}
