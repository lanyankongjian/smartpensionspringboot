package com.example.smartpensionspringboot.fbm.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FbmFootCategory {
    private long fcId;
    private String fcName;
    private String fcDescribe;

}
