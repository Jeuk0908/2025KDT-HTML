package w2_2_enum;

public class Automobil {
    public static void main(String[] args) {

//        Brands brand = Brands.FERRARI;
//
//        //enum 값과 필드 출력
//        System.out.println(brand);
//        System.out.println(brand.getType());

        for (Brands country : Brands.values()) {
            System.out.println(country + " : " + country.getType());
        }
    }
}
