public class Main{
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeMenu pancakeMenu = new PancakeMenu();

        dinerMenu.addItem("Burger", "Juicy burger just arrived from Buffalo");
        dinerMenu.addItem("Beef", "Prime Beef");
        pancakeMenu.addItem("Croiassont", "Vegie Croiassont with chocolate");

        Waitress waitress = new Waitress(pancakeMenu,dinerMenu);
        waitress.printMenu();

    }
}