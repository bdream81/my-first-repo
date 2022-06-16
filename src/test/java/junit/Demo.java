package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Demo {

    @Test
    public void test1(){
        System.out.println("This my test1");
    }

    public boolean catDog(String str) {
        int countcat = 0;
        int countdog = 0;
        for (int i = 0; i < str.length() - 2; i++){
            if (str.substring(i, i + 3).equals("cat")){
                countcat += 1;}
            if (str.substring(i, i + 3).equals("dog")){
                countdog += 1;}
        }
        if (countcat == countdog){
            return true;
        }
        return false;
    }

    @Test
    public void testCatDog(){
        String str1 = "catdog";
        boolean expectedValue1 = true;
        String str2 = "catcat";
        boolean expectedValue2 = false;
        String str3 = "1cat1cadodog";
        boolean expectedValue3 = true;
        String str4 = "catxxdogxxxdog";
        boolean expectedValue4 = false;
        String str5 = "catxdogxdogxcat";
        boolean expectedValue5 = true;
        String str6 = "catxdogxdogxca";
        boolean expectedValue6 = false;
        String str7 = "dog";
        boolean expectedValue7 = false;
        String str8 = "ca";
        boolean expectedValue8 = true;
        String str9 = "c";
        boolean expectedValue9 = true;
        String str10 = "";
        boolean expectedValue10 = true;

        Assertions.assertEquals(expectedValue1, catDog(str1));
        Assertions.assertEquals(expectedValue2, catDog(str2));
        Assertions.assertEquals(expectedValue3, catDog(str3));
        Assertions.assertEquals(expectedValue4, catDog(str4));
        Assertions.assertEquals(expectedValue5, catDog(str5));
        Assertions.assertEquals(expectedValue6, catDog(str6));
        Assertions.assertEquals(expectedValue7, catDog(str7));
        Assertions.assertEquals(expectedValue8, catDog(str8));
        Assertions.assertEquals(expectedValue9, catDog(str9));
        Assertions.assertEquals(expectedValue10, catDog(str10));

    }
}
