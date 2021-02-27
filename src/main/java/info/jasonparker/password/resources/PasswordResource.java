package info.jasonparker.password.resources;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import info.jasonparker.password.service.PasswordService;

@RestController
@RequestMapping("/password")
public class PasswordResource {

    private final PasswordService service = new PasswordService();

    @GetMapping
    public ResponseEntity<String> getPasswordWithDefaultRules(@RequestParam Integer len) {
        String pwd = service.getPassword(len);
        return ResponseEntity.ok(pwd);
    }
}
