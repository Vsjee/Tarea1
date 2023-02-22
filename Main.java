class Main {
  public static void main(String [] args) {
    IOSmobile iphone = new IOSmobile();
    IOSmobile iphone2 = new IOSmobile();

    System.out.println("iphone 1");
    iphone.setSize("5,4");
    iphone.setColor("red");
    System.out.println(iphone.brand+" "+iphone.getSize()+" "+ iphone.getColor());

    System.out.println("iphone 2");
    iphone2.setSize("6,4");
    iphone2.setColor("white");
    System.out.println(iphone.brand+" "+iphone2.getSize()+" "+ iphone2.getColor());
  }  
}
