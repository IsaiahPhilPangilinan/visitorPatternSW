public class Telco implements TelcoSubscription {

  private String telcoName;
  private double promoPrice;
  private int dataAllowance;
  private boolean unliCallText;
  
  public Telco(double promoPrice, int dataAllowance, String telcoName, boolean unliCallText) {
    
    this.promoPrice = promoPrice;
    this.dataAllowance = dataAllowance;
    this.telcoName = telcoName;
    this.unliCallText = unliCallText;
    
  }
  
  @Override
  public String accept(UsagePromo promo, double price) {
    this.promoPrice = price;
    return promo.showAllowance(telcoName, price);
  }  
  
  @Override
  public String accept(UnliCallOffer unliPackage, boolean unliCallText) {
    this.unliCallText = unliCallText;
    return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
  } 

  public void setTelcoName(String telcoName) {
    this.telcoName = telcoName;
  }

  public void setPromoPrice(double promoPrice) {
    this.promoPrice = promoPrice; 
  }

  public void setDataAllowance(int dataAllowance) {
    this.dataAllowance = dataAllowance;
  }

  public void setUnliCallText(boolean unliCallText) {
    this.unliCallText = unliCallText;
  }

  public String getTelcoName() {
    return telcoName;
  }

  public double getPromoPrice() {
    return promoPrice;
  }

  public int getDataAllowance() {
    return dataAllowance;
  }

  public boolean getUnliCallText() {
    return unliCallText;
  }

}