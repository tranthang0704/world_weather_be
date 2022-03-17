package tthang.world_weather.backend.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws ServletException, IOException {

//        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
//
//        String redirectURL = request.getContextPath();
//
//        if (userDetails.hasRole("Salesperson")) {
//            redirectURL = "sales_home";
//        } else if (userDetails.hasRole("Editor")) {
//            redirectURL = "editor_home";
//        } else if (userDetails.hasRole("Shipper")) {
//            redirectURL = "shipper_home";
//        }

        response.sendRedirect("/home");

    }
}
