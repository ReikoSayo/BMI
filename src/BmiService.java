public class BmiService {
    public float calculate(float weight, float growth) {
        float index = weight * 10000 / (float) (Math.pow(growth, 2));
        return index;
    }
}
