package com.endava;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Account {
    private String username;
    private Integer accountNumber;
    private String password;

}
