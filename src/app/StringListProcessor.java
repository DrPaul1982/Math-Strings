package src.app;

public class StringListProcessor {
     static int countUppercase(String s) {;
       if (s == null || s.isEmpty()){
           return 0;
       }
       return (int) s.chars()
               .filter(Character::isUpperCase)
               .count();
    }
}
