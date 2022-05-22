package ch.teachu.teachuapi.child.dto;

import ch.teachu.teachuapi.enums.UserSex;
import ch.teachu.teachuapi.student.dto.StudentSemesterDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChildResponse {

    public static final String EMAIL = "email";
    public static final String FIRST_NAME = "firstName";
    public static final String LAST_NAME = "lastName";
    public static final String BIRTHDAY = "birthday";
    public static final String SEX = "sex";
    public static final String CITY = "city";
    public static final String POSTAL_CODE = "postalCode";
    public static final String STREET = "street";
    public static final String PHONE = "phone";
    public static final String PROFILE_IMAGE = "profileImage";

    private String email;
    private String firstName;
    private String lastName;
    private Date birthday;
    private UserSex sex;
    private String city;
    private String postalCode;
    private String street;
    private String phone;
    private String profileImage;
    private List<StudentSemesterDTO> marks;
    // TODO timetable
}