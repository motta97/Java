public class Main{
    public static void main(String[] args) {
        MenuComponent dinerMenu = new Menu("DINER MENU", "WHEN WOULD YOU SLEEP?");
        MenuComponent pancakeMenu = new Menu("PANCAKE MENU", "PANCAKE FOR SURE!");
        MenuComponent launchMenu = new Menu("LAUNCH MENU", "READY TO HAVE A BREAK?");

        MenuComponent allMenus = new Menu("ALL MENUS", "I HAVE ALL MENUS!");
        allMenus.add(dinerMenu);
        allMenus.add(pancakeMenu);
        allMenus.add(launchMenu);

        dinerMenu.add(new MenuItem("BEEF", "SALTY BEEF YUMMMY!"));
        pancakeMenu.add(new MenuItem("CROAISOONT", "well, yes with typos"));
        launchMenu.add(new MenuItem("FRESH JUICE", "I NEED SUGAR RIGHT NOW"));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }
}