package org.itstep.task02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class City {

    private String name;
    private String region;
    private String country;
    private int inhabitants;
    private String index;
    private String code;

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", inhabitants=" + inhabitants +
                ", index='" + index + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
