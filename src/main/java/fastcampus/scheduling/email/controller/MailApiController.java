package fastcampus.scheduling.email.controller;

//import fastcampus.scheduling._core.util.ApiResponse;
//import fastcampus.scheduling._core.util.ApiResponse.Result;
//import fastcampus.scheduling.user.dto.UserRequest;
//import fastcampus.scheduling.user.dto.UserRequest.SendEmailDTO;
//import fastcampus.scheduling.user.dto.UserResponse;
//import fastcampus.scheduling.user.dto.UserResponse.AuthEmail;
import fastcampus.scheduling.email.service.MailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class MailApiController {

    private final MailService mailService;
//    @PostMapping("/api/v1/auth/checkEmail")
//    public ResponseEntity<Result<Object>> checkEmail(@RequestBody UserRequest.CheckEmailDTO checkEmailDTO, Errors errors) {
//        log.info("/api/v1/auth/checkEmail POST " + checkEmailDTO);
//        mailService.checkEmail(checkEmailDTO);
//
//        return ResponseEntity.ok(ApiResponse.success(null));
//    }
//
//    @PostMapping("/api/v1/auth/sendEmail")
//    public ResponseEntity<ApiResponse.Result<UserResponse.AuthEmail>> sendEmail(@RequestBody SendEmailDTO sendEmailDTO, Errors errors) {
//        log.info("/api/v1/auth/sendEmail POST " + sendEmailDTO);
//        AuthEmail authEmail = mailService.sendEmail(sendEmailDTO);
//
//        return ResponseEntity.ok(ApiResponse.success(authEmail));
//    }

}
