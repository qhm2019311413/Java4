package system;

public class PoetryUtils {

    public String processPoetry(String str){
        String poetry = "";
        int count = 0;
        for (int i = 1; i <= str.length(); i++) {
            if (i%7 == 0){
                count++;
                if (count%2 == 0)
                    poetry += str.substring(i-7,i)+"。\n";
                else
                    poetry += str.substring(i-7,i)+"，";
            }
        }
        return poetry;
    }

}
