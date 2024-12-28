package output;

import output.display.PersonSortingDisplay;
import output.display.ShoppingCartDisplay;
import output.display.StringSetFilterDisplay;
import output.display.UniqueValueCheckerDisplay;

public class Menu extends BaseMenu{
    public void display(){

        while (true) {

            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    PersonSortingDisplay.display();
                    break;
                case 2:
                    ShoppingCartDisplay.display();
                    break;
                case 3:
                    UniqueValueCheckerDisplay.display();
                    break;
                case 4:
                    StringSetFilterDisplay.display();
                    break;
                case 5:
                    PersonSortingDisplay.display();
                    ShoppingCartDisplay.display();
                    UniqueValueCheckerDisplay.display();
                    StringSetFilterDisplay.display();
                    break;
                case 0:
                    cloceScanner();
                    return;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }

}
