package JC2;

public class ArrayChecker {
    private String[][] strings;

    public void setStrings(String[][] strings) {
        try {
            checkSizeArray(strings);
            this.strings = strings;
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }
    private void checkSizeArray(String[][] strings) throws MyArraySizeException {
        if (strings.length != 4 || checkLengthStrings(strings)) {
            throw new MyArraySizeException("Size of massive does not fit 4*4");
        }

    }
    private boolean checkLengthStrings(String[][] strings) {
        for (String[] str : strings) {
            if (str.length != 4) {
                return true;
            }
        }
        return false;
    }

    public void summ() {
        if (strings == null) {
            System.out.println("the class does not initialize an array of strings, there is nothing to sum");
            return;
        }
        try {
            summArray();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }


    private void summArray() throws MyArrayDataException {
        int[][] numerizedArray = new int[strings.length][strings.length];
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                numerizedArray[i][j] = Integer.parseInt(strings[i][j]);
                //System.out.println(numerizedArray[i][i]);
                sum += numerizedArray[i][j];
            }

        }
    }
}
