package com.xworkz.Kite.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class KiteDto {
    private Integer id;
    private String kiteType;
    private Integer kiteCount;
    private String kiteColour;
}
