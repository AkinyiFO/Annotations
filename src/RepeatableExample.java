import java.lang.annotation.Repeatable;

class RepeatableExample {
    // Container Annotations are required when using repeatable annotation to "wrap" repeated annotations.
    @interface Schedules {
        Schedule[] value();
    }

    @Repeatable(Schedules.class)
    @interface Schedule {
        String dayOfMonth() default "first";
        String dayOfWeek() default "Mon";
        int hour() default 12;
    }

    @Schedule(dayOfMonth="last")
    @Schedule(dayOfWeek="Fri", hour = 23)
    public void doPeriodicCleanup() {  }
}

class AnnotationTest {
    // Container Annotations are required when using repeatable annotation to "wrap" repeated annotations.
    @interface MealContainer {
        Meal[] value();
    }

    @Repeatable(MealContainer.class)
    @interface Meal {
        String value();
        String mainDish();
    }

    @Meal(value = "breakfast", mainDish = "cereal")
    @Meal(value = "lunch", mainDish = "pizza")
    @Meal(value = "dinner", mainDish = "salad")
    public void evaluateDiet() {
    }
}
