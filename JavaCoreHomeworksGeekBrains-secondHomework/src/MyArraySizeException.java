public class MyArraySizeException extends Exception {
    @Override
    public String getMessage() {
        return "Массив не равен 4х4";
    }
}
