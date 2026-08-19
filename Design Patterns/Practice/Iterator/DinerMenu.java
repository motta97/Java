public class DinerMenu{
    MenuItem items[];
    int number_of_items = 0;
    public DinerMenu(){
        this.items = new MenuItem[6];//max number of items
    }
    public void addItem(String name, String description){
        if(number_of_items==6)
            number_of_items = 0;
        items[number_of_items++]=new MenuItem(name, description);
    }
    public Iterator createIterator(){
        return new DinerMenuIterator(items);
    } 
}