package entity;

import java.time.LocalDateTime;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class User {
    private long id;
    private String name;
    private String surname;
    private String email;
    private String job;
    private LocalDateTime lastLogin;
    private String password;
    private String dayAgo;
    private String photoLink;
}
