package com.portfolio.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class ContactDTO {
    public String name;
    public String email;
    public String phone;
    public Date birthDate;
}
