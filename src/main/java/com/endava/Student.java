package com.endava;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
class Student {
    private String name;
    private String surname;
    private Integer indexNumber;

}
