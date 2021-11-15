package Learn.function;

public class Runner {
    public static void main(String[] args) {
      // RectangleParam rectangleParam = RectangleParam.SQUARE;
        RectangleAction rectangleAction = new RectangleAction();
        double result = rectangleAction.action(RectangleParam.SQUARE, 3.0, 7.0);
        System.out.println(result);
    }
}
