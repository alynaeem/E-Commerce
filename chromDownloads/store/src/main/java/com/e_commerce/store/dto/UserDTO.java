package com.e_commerce.store.dto;

import lombok.*;

@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
@Data
public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private String role;

    // Getters and Setters
}