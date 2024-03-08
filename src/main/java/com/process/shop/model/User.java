package com.process.shop.model;

import java.util.Date;
import lombok.Data;  //Dependencia de @Data


//@Getter0
//@Setter
//@RequiredArgsConstructor
@Data  //Forma rapida de crear Setter Getters y constructores, nos evitamos las 3 anteriores lineas
public class User {


    private  String fullName;
    private Date birthDay;
    private String identification;
    private String identificationType;
    private String phoneNumber;
    private String email;
    private String password;
    private String address;




}
