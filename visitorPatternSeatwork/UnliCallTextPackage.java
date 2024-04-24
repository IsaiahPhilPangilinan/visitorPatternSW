public class UnliCallTextPackage implements UnliCallsTextOffer {

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean UnliCallText) {
        String output = "";
        
        if (telcoName == "Smart" || UnliCallText == false) {
            return "They do not offer any free calls or texts, and you will be charged per use.";
        }

        if (telcoName == "Globe" || UnliCallText == true){
            return "This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.";
        }

        if (telcoName == "Ditto" || UnliCallText == true){
            return "This plan includes unlimited calls and texts to all networks within the country.";
        }

        return output;
        
    }

}
