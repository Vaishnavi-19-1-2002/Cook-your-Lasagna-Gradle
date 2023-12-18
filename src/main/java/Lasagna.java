public class Lasagna {
    private final int cook_actual = 40;
    private final int min_layer = 2;

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return this.cook_actual;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int curr) {
        return (this.cook_actual - curr);
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layer) {
        return (layer*min_layer);
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layer, int curr) {
        return (curr + this.preparationTimeInMinutes(layer));
    }
}
