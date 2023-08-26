package com.cns.cement.domain.apply.controller;

import com.cns.cement.domain.apply.dto.ApplyMemberRequest;
import com.cns.cement.domain.apply.dto.ApplyMemberResponse;
import com.cns.cement.domain.apply.service.ApplyMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ApplyMemberController {

    private final ApplyMemberService applyMemberService;

    // form으로 데이터를 묶어서 들어오는 경우 @RequestBody 어노테이션이 없어야 정상 작동함
    @PostMapping("/register")
    public ApplyMemberResponse applyMember(ApplyMemberRequest request) {
        return applyMemberService.addApplyMember(request);
    }
}