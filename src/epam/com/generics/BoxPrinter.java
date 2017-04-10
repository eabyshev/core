package epam.com.generics;

/**
 * Created by Ermek_Abyshev on 4/7/2017.
 */
public class BoxPrinter {

    private Object val;

    public BoxPrinter(Object val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "BoxPrinter{" +
               "val=" + val +
               '}';
    }

    public void setVal(Object val) {
        this.val = val;
    }

    public Object getVal() {
        return val;
    }

    public static void main(String[] args) {
        BoxPrinter value1 = new BoxPrinter(10);
        value1.setVal(55);
        System.out.println(value1.getVal());
        Integer intValue1 = (Integer) value1.getVal();
        BoxPrinter value2 = new BoxPrinter("Hello world");
//        System.out.println(value2);

        // Здесь программист допустил ошибку, присваивая
        // переменной типа Integer значение типа String.
        if ((value2.getVal() instanceof String)) {
            String intValue2 = (String) value2.getVal();
        }
        int i = 5;
        float a = 1.5F;
        System.out.println(i+a);

        value1.getVal();
    }
}
