import java.util.*;

public class TelcoAllowance implements UsagePromo {

    private static Map<String, Double, Int, Boolean> allowanceMap = new HashMap<>();

    static {

        allowanceMap.put(Smart, 500.0, 15, false);
        allowanceMap.put(Globe, 450.0, 10, true);
        allowanceMap.put(Ditto, 400.0, 8, true);

    }

    @Override
    public String showAllowance(String telcoName, double money) {
        double allowanceValue = allowanceMap.getOrDefault(telcoName, 0.0);
        
        if (allowanceValue == 15) {
            String output = "";
            output += allowanceMap.getTelcoName + " offers a data allowance of ";
            return output;
        }

        if (allowanceValue){
            return "";
        }
    }

}