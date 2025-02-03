package w2_1_accessmodifier.a;

public class B extends A{
    public static void main(String[] args){
//        A.printPrivateStrA(); //private (패키지 달라서 접근X)
        A.printPackagePrivateStrA(); //default
        A.printProtectedStrA(); //protected (extends A 로 상속관계기 때문에 접근가능)
        A.printPublicStrA(); //public (아무 패키지에서나 접근가능)
    }
}
