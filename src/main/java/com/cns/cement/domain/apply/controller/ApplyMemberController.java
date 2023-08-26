package com.cns.cement.domain.apply.controller;

import com.cns.cement.domain.apply.dto.ApplyMemberRequest;
import com.cns.cement.domain.apply.service.ApplyMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class ApplyMemberController {

    private final ApplyMemberService applyMemberService;

    // form으로 데이터를 묶어서 들어오는 경우 @RequestBody 어노테이션이 없어야 정상 작동함
    @PostMapping("/register")
    public String applyMember(ApplyMemberRequest request) {
        applyMemberService.addApplyMember(request);
        return "redirect:/login";
    }
}
