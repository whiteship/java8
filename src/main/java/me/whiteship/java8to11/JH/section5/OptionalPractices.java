package me.whiteship.java8to11.JH.section5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalPractices {

    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        Optional<OnlineClass> optional = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        // 검사 안하고 꺼내기
        OnlineClass onlineClass = optional.get();

        // if 문으로 검사
        OnlineClass onlineClass1;
        if (optional.isPresent())
            onlineClass1 = optional.get();

        // orElse
        OnlineClass onlineClass2 = optional.orElse(createNewClass());

        // orElseGet
        OnlineClass onlineClass3 = optional.orElseGet(OptionalPractices::createNewClass);

        // orElseThrow
        OnlineClass onlineClass4 = optional.orElseThrow(IllegalStateException::new);

        // filter
        //// return type은 Optional 타입.
        Optional<OnlineClass> onlineClass5 = optional.filter(oc -> !oc.isClosed());

        // flatMap
        //// Optional 두 겹인 상황에서는
        Optional<Optional<Progress>> progress = optional.map(OnlineClass::getProgress);
        Optional<Progress> optionalProgress1 = progress.orElse(Optional.empty());

        //// flatMap을 사용하여 한 번에 처리가 가능하다
        Optional<Progress> optionalProgress2 = optional.flatMap(OnlineClass::getProgress);
    }

    private static OnlineClass createNewClass() {
        return new OnlineClass(10, "New Class", false);
    }
}
