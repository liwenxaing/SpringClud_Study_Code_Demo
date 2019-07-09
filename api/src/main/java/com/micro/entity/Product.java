package com.micro.entity;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Product implements Serializable {

    private static final Long versionUID = 1L;

    private Integer id;
    private String name;
    private Integer parentId;
    private List<Product> products;

}
