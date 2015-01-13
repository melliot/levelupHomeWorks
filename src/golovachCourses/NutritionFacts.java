package golovachCourses;

// паттерн Builder
class NutritionFact {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    @Override
    public String toString() {
        return this.servings + " " + this.servingSize + this.calories + this.fat + this.sodium + this.carbohydrate;
    }

    public static class Builder {
        // Обязательные параметры
        private final int servingSize;
        private final int servings;
        // Дополнительные параметры - инициализируются значениями по умолчанию
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public NutritionFact build() {
            return new NutritionFact(this);
        }
    }

    private NutritionFact(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

}
public class NutritionFacts {
    public static void main(String[] args) {

        NutritionFact nutritionFact = new NutritionFact.Builder(12, 21).build();
        NutritionFact nutritionFact1 = new NutritionFact.Builder(12, 221).calories(12).carbohydrate(1232).build();
        System.out.println(nutritionFact);
        System.out.println(nutritionFact1);
        System.out.println(nutritionFact);
    }
}