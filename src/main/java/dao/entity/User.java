package dao.entity;


import dao.core.Identifier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User implements Identifier {
    private int user_id;
    private String login;
    private String password;
    private String email;
    private String phone;
    private LocalDateTime created;


    @Override
    public int getId() {
        return user_id;
    }
}
