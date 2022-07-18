package java8assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java8assignment.Item;

public class Que_16_item {

	public static void main(String[] args) {
		List<Item> items=new ArrayList<>();

        items.add(new Item(1,"bag","travel",3000,"22/10/2024","22/10/2026"));
        items.add(new Item(2,"mouse","computer_accessories",4500,"02/01/2020","26/10/2029"));
        items.add(new Item(3,"pen","study",500,"22/10/2020","11/05/2027"));
        items.add(new Item(4,"book","study",300,"15/04/2024","16/09/2029"));
        items.add(new Item(5,"table","furniture",6000,"23/10/2021","23/10/2026"));    

        Scanner scan=new Scanner(System.in);
        System.out.println(" 1.to find item by category name\n 2.find item by starting name \n 3.find product on basis of date \n 4.find product by price range ");
        int ch=scan.nextInt();
        while(true) {
        switch(ch) {
        case 1:
            System.out.println("Enter category name");
            String category=scan.next();
            List<Item> i=items.stream().filter(e->e.category_name.contains(category)).collect(Collectors.toList());
            i.stream().forEach(System.out::println);
            break;

        case 2:
            System.out.println("Enter item starting name");
            String itemname=scan.next();
            List<Item> ii=items.stream().filter(e->e.item_name.startsWith(itemname)).collect(Collectors.toList());
            ii.stream().forEach(System.out::println);
            break;
        case 3:
            System.out.println("Enter  date");
            String date=scan.next();
            List<Item> ii2=items.stream().filter(e->e.date_of_expiring.contains(date)||e.date_of_manufacturing.contains(date)).collect(Collectors.toList());
            ii2.stream().forEach(System.out::println);
            break;
        case 4:
            System.out.println("Enter  max range");
            int maxrange=scan.nextInt();
            System.out.println("Enter  min range");
            int minrange=scan.nextInt();
            List<Item> iii=items.stream().filter(m->m.price >minrange && m.price<maxrange).collect(Collectors.toList());
            iii.stream().forEach(System.out::println);
            break;

        }
        System.out.println(" 1.to find item by cateory name\n 2.find item by starting name \n 3.find product on basis of date \n 4.find product by price range ");
        System.out.println("if want to exit press 5");
        ch=scan.nextInt();
        if(ch==5) {
            break;
        }
        }


	}

}
