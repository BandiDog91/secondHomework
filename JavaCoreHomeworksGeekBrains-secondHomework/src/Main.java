public class Main {
    public static void main(String[] args) {
            String[][] array = {
                    {"1","2","4","6"},
                    {"1","/","4","6"},
                    {"1","2","4","6"},
            };
        try {
            System.out.println(getSumOfElementsFrom(array));
        } catch (MyArraySizeException | MyArrayDataException ex) {
            ex.printStackTrace();
        }
    }

    public static int getSumOfElementsFrom(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }

            for (int j = 0; j < array[i].length; j++) {
                try {
                    int element = Integer.parseInt(array[i][j]);
                    sum += element;
                } catch (NumberFormatException exception) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}
