public class Waitress{
    // PancakeMenu pancakeMenu;
    // DinerMenu dinerMenu;
    // public Waitress(PancakeMenu pancakeMenu, DinerMenu dinerMenu){
    //     this.dinerMenu = dinerMenu;
    //     this.pancakeMenu = pancakeMenu;
    // }
    MenuComponent allMenus;
    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }
     public void printMenu(){
        //  Iterator dinerIterator = dinerMenu.createIterator();
        //  Iterator pancakIterator = pancakeMenu.createPancakeIterator();
        //  System.out.println("Diner Items:");
        //  printMenu(dinerIterator);
        //  System.out.println("Breakfast Items");
        //  printMenu(pancakIterator);
        allMenus.print();
     }
    // public void printMenu(Iterator iterator){
    //     // while(iterator.hasNext()){
    //     //     MenuComponent item = iterator.next();
    //     //     item.print();
    //     // }
    // }
}