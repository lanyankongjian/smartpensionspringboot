package com.example.smartpensionspringboot.ljb.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FbmRecipes {
    private long reId;
    private String reName;
    private String reNote;
    private double reMonth;
    private double reDay;
    private String reCategory;

}
