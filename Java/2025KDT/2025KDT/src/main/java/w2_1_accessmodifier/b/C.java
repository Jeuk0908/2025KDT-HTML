package w2_1_accessmodifier.b;

import w2_1_accessmodifier.a.A;

public class C {
    public static void main(String[] args){
//        A.printPrivateStrA();
//        A.printPackagePrivateStrA();
//        A.printProtectedStrA();  //protected (상속 관계 아니니깐 당연히 접근X)
        A.printPublicStrA();
    }
}