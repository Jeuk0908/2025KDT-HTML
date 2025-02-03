package w2_2_enum;

public class AutoMobileBrandsSample {
    public static void main(String[] args) {
        AutoMobileBrands brand = AutoMobileBrands.FERRARI; //객체화

        //enum 객체 비교
        if(brand == AutoMobileBrands.FORD) {
            System.out.println("FORD is American brand.");
        } else if (brand == AutoMobileBrands.TOYOTA) {
            System.out.println("TOYOTA is Japanese brand.");
        } else if (brand == AutoMobileBrands.FERRARI) {
            System.out.println("FERRARI is Italian brand.");
        } else if (brand == AutoMobileBrands.HYUNDAI) {
            System.out.println("Hyundai is Honda brand.");
        }

        for (AutoMobileBrands brands : AutoMobileBrands.values()) {
            System.out.println(brands);
        }
    }
}
