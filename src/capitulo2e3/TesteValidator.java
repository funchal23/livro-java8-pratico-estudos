package capitulo2e3;

public class TesteValidator {

    public static void main(String[] args) {
        Validator<String> v1 = new Validator<String>() {
            @Override
            public boolean valid(String s) {
                return s.matches("[0-9]{5}-[0-9]{3}");
            }
        };

        boolean b1 = v1.valid("10154-013");
        System.out.println(b1);

        boolean b2 = v1.valid("1a154-013");
        System.out.println(b2);

        boolean b3 = v1.valid("177154-013");
        System.out.println(b3);

        Validator<String> v2 = ( s -> {
            return s.matches("[0-9]{5}-[0-9]{3}");
        });

        boolean b4 = v2.valid("10154-013");
        System.out.println(b4);

        Validator<String> v3 = s -> s.matches("[0-9]{5}-[0-9]{3}");
        boolean b5 = v3.valid("10154-013");
        System.out.println(b5);

    }
}
