package com.endava;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Account {
    private String username;
    private Integer accountNumber;
    private String password;

}
