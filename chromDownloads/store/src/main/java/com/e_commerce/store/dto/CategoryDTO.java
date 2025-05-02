package com.e_commerce.store.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryDTO {

    private Long id;
    private String name;
    private String description;
}