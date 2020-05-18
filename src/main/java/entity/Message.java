package entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class Message {

    private String type;
    private String message;
    private long writeTo;
}
