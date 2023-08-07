import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      REGION region=REGION.BATKEN;
//        System.out.println(region);
//    REGION region1=REGION.BISHKEK;
//        System.out.println(region1);
//  REGION region2 =REGION.OSH;
//        System.out.println(region2);
//        System.out.println(REGION.DJALALABAD);
//        REGION region3=REGION.NARYN;
//        System.out.println(region3);
//        REGION region4=REGION.YSYKKUL;
//        System.out.println(region4);

//          REGION[]regions=REGION.values();
//        for (REGION region5: regions) {
//            System.out.println(region5);

            Scanner sc=new Scanner(System.in);
            String word=sc.nextLine();
            REGION region=REGION.valueOf(word);

            switch (region){
                case OSH -> System.out.println("SULAIMAN TOO");
                case NARYN -> System.out.println("АЙГУЛ ГУЛУ");
                case YSYKKUL -> System.out.println("KOL");
                case BISHKEK -> System.out.println("АШЛЯНФу");
                case DJALALABAD -> System.out.println("ARSLANBAB");
                case BATKEN -> System.out.println("ОРУК");
                default -> System.out.println("МЫНДАЙ ОБЛАСТЬ ЖОК");
            }
        }
    }
