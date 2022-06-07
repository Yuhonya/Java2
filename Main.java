package JC2;

public class Main {

    public static void main(String[] args){
        String [][] strings=createArray();
        ArrayChecker arrayChecker = new ArrayChecker();
        arrayChecker.setStrings(strings);

        arrayChecker.summ();


    }
    public static String [][] createArray(){
        String[][] array =  {
                {"4","5","6","7"},
                {"1","2","3","4"},
                {"8","4","6","7"},
                {"9","3","5","1"}
        };

        return array;
    }

}
