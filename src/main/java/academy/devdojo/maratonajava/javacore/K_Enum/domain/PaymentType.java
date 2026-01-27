package academy.devdojo.maratonajava.javacore.K_Enum.domain;

    public enum PaymentType {

        DEBIT {
            @Override
            public double calculateDiscount(double value) {
                return value * 0.1;
            }
        }, CREDIT {
            @Override
            public double calculateDiscount(double value) {
                return value * 0.05;
            }
        };

        public abstract double calculateDiscount(double value);
    }

/**
 * An abstract method inside an enum requires each enum constant
 * to provide its own implementation. This allows each constant
 * to have unique behavior for that method.
 */

/**
 * Um metodo abstrato dentro de um enum obriga cada constante
 * do enum a implementar sua própria versão. Isso permite que
 * cada constante tenha um comportamento único para esse metodo.
 */


