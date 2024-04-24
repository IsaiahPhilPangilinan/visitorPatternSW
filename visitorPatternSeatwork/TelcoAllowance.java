public class TelcoAllowance implements UsagePromo {

    @Override
    public String showAllowance(String telcoName, double money) {
        
        int allowance;
        String output = "";

        if (telcoName == "Smart") {
            allowance = 15;
            output = telcoName + " offers a data allowance of " + allowance + "GB for ₱" + money + " per month.";
            return output;
        }
        if (telcoName == "Globe") {
            allowance = 10;
            output = telcoName + " offers a data allowance of " + allowance + "GB for ₱" + money + " per month.";
            return output;
        }
        if (telcoName == "Ditto") {
            allowance = 8;
            output = telcoName + " offers a data allowance of " + allowance + "GB for ₱" + money + " per month.";
            return output;
        }
        else {
            return null;
        }

    }

}
