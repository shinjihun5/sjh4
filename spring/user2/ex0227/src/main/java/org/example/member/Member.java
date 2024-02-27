package org.example.Member;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;


@Getter
@Builder
@ToString
@Setter
public class member {
    private long id;
    private String email;
    private String name;
    private String password;
    private LocalDateTime wdate;

}
