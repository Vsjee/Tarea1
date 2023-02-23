class Main {
  public static void main(String [] args) {
    Separator line = new Separator();
    IOSmobile iphone = new IOSmobile();
    IOSmobile iphone2 = new IOSmobile();
    ANDROIDmobile xiaomi = new ANDROIDmobile();

    System.out.println("iphone 1");
    iphone.setSize("5,4");
    iphone.setColor("red");
    System.out.println(iphone.brand+" "+iphone.getSize()+" "+ iphone.getColor());

    line.printSeparatorLine();

    System.out.println("iphone 2");
    iphone2.setSize("6,4");
    iphone2.setColor("white");
    System.out.println(iphone.brand+" "+iphone2.getSize()+" "+ iphone2.getColor());

    line.printSeparatorLine();

    System.out.println("xiaomi phone");
    xiaomi.setBrand("xiaomi");
    xiaomi.setSize("6,7");
    xiaomi.setColor("purple");
    xiaomi.setCableType("usb");

    line.printSeparatorLine();
  }
}
