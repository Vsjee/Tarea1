class Main {
  public static void main(String [] args) {
    Separator line = new Separator();

    Mobile genericMobile = new Mobile();
    IOSmobile iphone = new IOSmobile();
    ANDROIDmobile xiaomi = new ANDROIDmobile();

    System.out.println("iphone");
    iphone.setSize("5,4");
    iphone.setColor("red");
    System.out.println(iphone.brand+"\r\n"+iphone.getSize()+"\r\n"+ iphone.getColor()+"\r\n"+ iphone.getCableType());

    line.printSeparatorLine();

    System.out.println("generic phone");

    System.out.println(genericMobile.brand+"\r\n"+genericMobile.getSize()+"\r\n"+ genericMobile.getColor()+"\r\n"+ genericMobile.getCableType());

    line.printSeparatorLine();

    System.out.println("xiaomi phone");
    xiaomi.setBrand("xiaomi");
    xiaomi.setSize("6,7");
    xiaomi.setColor("purple");
    xiaomi.setCableType("usb");
    System.out.println(xiaomi.brand+"\r\n"+xiaomi.getSize()+"\r\n"+ xiaomi.getColor()+"\r\n"+ xiaomi.getCableType());

    line.printSeparatorLine();

    while(true) {
      ScanData sc = new ScanData();
      String msg; String person;

      System.out.println("want to text?");
      System.out.println("1. send a message");
      System.out.println("2. send a message for someone");
      System.out.println("3. EXIT.");
      
      String select = sc.scanData();
      int parseSelect = Integer.parseInt(select);

      if(parseSelect == 1) {
        System.out.print("write your text: ");
        msg = sc.scanData();

        xiaomi.setMessage(msg);
        xiaomi.sendMsg(xiaomi.getMessage());
      } else if (parseSelect == 2) {
        System.out.print("write your text: ");
        msg = sc.scanData();

        System.out.print("write the person: ");
        person = sc.scanData();
        
        xiaomi.setMessage(msg);
        xiaomi.sendMsg(xiaomi.getMessage(), person);
      } else {
        System.out.println("See ya!");
        break;
      }
      line.printSeparatorLine();
    }
    iphone.turnOff();
    genericMobile.turnOff();
    xiaomi.turnOff();
  }
}
