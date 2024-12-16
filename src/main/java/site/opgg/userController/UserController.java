package site.opgg.userController;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String home() {
        return "main";
    }

    // 로그인 후 처리
    @GetMapping("/login/naver/callback")
    public String loginCallback(@AuthenticationPrincipal OAuth2User oAuth2User) {
  
        System.out.println("OAuth2 User Attributes: " + oAuth2User.getAttributes());

        return "redirect:/";
    }
}
