package com.mycommunityrvks.authservice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    @NotBlank
    @Size(max = 15)
    private String mobileNumber;

    @NotBlank
    private String name;

    private String email;

    private Boolean isActive;
}
