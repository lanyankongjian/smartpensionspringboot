package com.example.smartpensionspringboot.fbm.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FbmFood {
    private long fdId;
    private long fcId;
    private String fdName;
    private double fdPrice;
    private String fdFlavor;
    private String fdFtatd;
    private String fdPadoo;
    private String fdPicture;
    private String fdDegree;
    private int fdInventory;
    private FbmFootCategory fbmFootCategory;
}
