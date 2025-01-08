//Analiza kodu
//Jaki da wynik

int i = 10;
        i = i++; //da 10
        i = ++i; //da 11
        i = i++ + ++i; //da 11 -> 12 i zwikeszane jest o 1 czyli 13
        System.out.println(i); //11 +13 = 24