public class Mobile {
  protected String brand;
  protected String color;
  protected String size;
  protected String cableType;
  private String message;

  Mobile() {
    brand = "generic brand x";
    color = "generic color x";
    size = "generic size x*x";
    cableType = "generic usbC";
  }

  public void turnOn() {
    System.out.println("you have turned on your "+brand+" mobile");
  }

  public void turnOff() {
    System.out.println("you have turned off your "+brand+" mobile");
  }

  // brand
  public void setBrand(String gBrand) {
    brand = gBrand;
  }
  public String getBrand() {
    return brand;
  }

  // cable type
  public void setCableType(String gCableType) {
    cableType = gCableType;
  }
  public String getCableType() {
    return cableType;
  }

  // color
  public void setColor(String gColor) {
    color = gColor;
  }
  public String getColor() {
    return color;
  }

  // size
  public void setSize(String gSize) {
    size = gSize;
  }
  public String getSize() {
    return size;
  }

  // message
  public void setMessage(String writteMessage) {
    message = writteMessage;
  }
  public String getMessage() {
    return message;
  }

  public void sendMsg(String msg) {
    System.out.println("msg: "+msg);
  }
  public void sendMsg(String msg, String person) {
    System.out.println("msg: "+msg+" to: " + person);
  }
}
