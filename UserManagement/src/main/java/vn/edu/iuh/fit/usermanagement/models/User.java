package vn.edu.iuh.fit.usermanagement.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private int id;
    private String name;
    private Product product;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
