package w2_1_accessmodifier.b;

import w2_1_accessmodifier.a.A;

public class B extends A{
    public static void main(String[] args){
//        A.printPrivateStrA(); //private (다른 패키지이기 때문에 접근X)
//        A.printPackagePrivateStrA(); //default ( = private)
        A.printProtectedStrA(); //protected (상속 관계라서 접근 가능)
        A.printPublicStrA();
    }
}