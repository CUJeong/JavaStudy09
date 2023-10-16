package chanung.submit09.q01;

import java.util.ArrayList;
import java.util.Collections;

public class ProductMain {
    public static void main(String[] args) {
        Product ref = new Product("냉장고", 2000000);
        Product tv = new Product("TV", 1000000);
        Product air = new Product("에어컨", 800000);
        Product com = new Product("컴퓨터", 1300000);
        Product fan = new Product("선풍기", 100000);

        ArrayList<Product> prodList = new ArrayList<>();

        prodList.add(ref);
        prodList.add(tv);
        prodList.add(air);
        prodList.add(com);
        prodList.add(fan);

        Collections.sort(prodList, (prodA, prodB) -> prodA.getPrice() - prodB.getPrice());

        for(int i = 0; i < prodList.size(); i++){
            System.out.println(prodList.get(i));
        }

        for(int i = 0; i < prodList.size(); i++){
            // prodList.get(i) -> Product 객체가 튀어나옴
            // prodList.get(i).getName() 이 TV인 것을 찾아야한다.
            if(prodList.get(i).getName().equals("TV")){
                System.out.println(i);
            }
        }


    }
}
