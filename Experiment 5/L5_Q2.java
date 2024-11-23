class NotHexadecimalException extends Exception {
    public NotHexadecimalException(String message) {
        super(message);
    }
}

public class L5_Q2 {
    public static void main(String[] args) {
        String hexNumber = "1A3FAB";
        
        try {
            if (!isHexadecimal(hexNumber)) {
                throw new NotHexadecimalException(hexNumber + " is not a hexadecimal number.");
            }
            System.out.println(hexNumber + " is a hexadecimal number.");
        } catch (NotHexadecimalException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End.");
        }
    }

    public static boolean isHexadecimal(String str) {
        return str.matches("^[0-9A-Fa-f]+$");
    }
}
