package com.solo.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// 사용자 URL 요청을 처리하겠다.
@Controller
public class BoardController {
    // static이 붙어있으면 메모리에 상주한다.
    // 쉽게 생각하자면 메모리에 동채로 박혀 있다고 생각하면 된다.
    // 결국 data 영역에 상시 배치되어 있는 것이다.

    // new 라는 것은 Heap에 할당하는것이고
    // Heap에 할당한다는것은 동적으로 할당을 한다는것이므로
    // 실제 Run-time에 실행하면서 할당을 하게되어 속도가 느리다.
    // 그러나 static으로 박아 놓은 것은 메로리를 낭비하지만
    // 프로그램이 동작할 때 초기부터 셋팅되어 있는것이라
    // 별도의 동적 할당 메커니즘이 없어 속도 측면에서 이점을 얻을 수 있다.
    static Logger log = LoggerFactory.getLogger(BoardController.class);


    // 사용자의 URL 요청 중 /test로 들어오는 녀석이 있다면
    @GetMapping("/test")
    public String test(Model model){
        // HTEML 태크중 템플릿으로 받을 수 있는 테크 가 있는데
        // 해당 태그에서 message를 받을 수 있게 해주는 작업
        // 즉 여기서 message는 일종의 key 값이라고 생각하면 되고
        // 그 뒴쪽에 있는 내용이 실제 vcalue 라고 생각하면 되겠다.
        model.addAttribute("message","Hellow Spring-Vue-MySQL-WebGL");

        // 이것은 ThymeLeaf에 의해
        // 자동으로 resources/templates/test.html로 정보를 출력하겠다는 의미가 된다.
        return "test";
    }

}
