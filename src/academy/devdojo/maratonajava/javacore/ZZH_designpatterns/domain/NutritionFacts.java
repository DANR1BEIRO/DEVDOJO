package academy.devdojo.maratonajava.javacore.ZZH_designpatterns.domain;

// builder pattern
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Serving Size: ").append(servingSize);
        sb.append("\nServings: ").append(servings);
        appendIfNotNull(sb, "\nCalories: ", calories);
        appendIfNotNull(sb, "\nFat: ", fat);
        appendIfNotNull(sb, "\nSodium: ", sodium);
        appendIfNotNull(sb, "\nCarbohydrate: ", carbohydrate);
        return sb.toString();
    }

    private void appendIfNotNull(StringBuilder sb, String description, int value) {
        if (value != 0) {
            sb.append(description).append(value);
        }
    }

    public static class Builder {
        // required parameters
        private final int servingSize;
        private final int servings;

        // optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
}
