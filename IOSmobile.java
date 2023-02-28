class IOSmobile extends Mobile {
  IOSmobile() {
    super.brand = "Apple";
    super.cableType = "Lightning";
  }
  
  public void turnOn() {
    System.out.println("you have turned on your "+brand+" mobile");
  }

  public void turnOff() {
    System.out.println("you have turned off your "+brand+" mobile");
  }
}
