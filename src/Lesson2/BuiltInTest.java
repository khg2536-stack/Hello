package Lesson2;

import java.util.function.*;

public class BuiltInTest {
    static void main(String[] args) {

        Function<String, String> sudo =
             city -> {
                return switch (city) {
                    case "서울" -> "한국";
                    case "워싱턴" -> "미국";
                    case "도쿄" -> "일본";
                    default -> "없음";
                };
        };
        String country = sudo.apply("워싱턴");
        System.out.println(country);

        //소비자 패턴
        Consumer<Integer> phone = price ->{
            if (price > 200){
                System.out.println("부유함");
            } else if (price > 100) {
                System.out.println("평범");
            } else if (price > 50) {
                System.out.println("서민");
            }
        };
        phone.accept(220);

        //공급자 패턴
        Supplier<String> msg = () -> "감사합니다.";
        System.out.println(msg.get());

        //프레디케이트 패턴
        Predicate<Integer> acl = age -> age >= 19;
        if(acl.test(19)){
            System.out.println("음주 가능");
        }else {
            System.out.println("음주 불가 ");
        }

        //BiFunction 패턴
        BiFunction<String, String, String>  korea =
                (String city, String region) -> {
                    if (city.equals("서울") && region.equals("구로")){
                        return "오지마세요";
                    }else if (city.equals("서울") && region.equals("성수")){
                        return "많이 가세요";
                    }else {
                        return "준비중";
                    }
                };
        System.out.println(korea.apply("서울", "구로"));
        System.out.println(korea.apply("서울", "성수"));
        System.out.println(korea.apply("서울", "광진"));
    }
}

