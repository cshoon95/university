package com.myService.univ.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TreeVO {

    @JsonProperty
    private String UNIV_INFO;

    @JsonProperty
    private String UNIV_STATUS;

    @JsonProperty
    private String UNIV_NM;

    @JsonProperty
    private String UNIV_AREA;

    @JsonProperty
    private Integer UNIV_LAT;

    @JsonProperty
    private Integer UNIV_LOG;

    @JsonProperty
    private String UNIV_ADDR;

    @JsonProperty
    private String UNIV_ADDR_NEW;

    @JsonProperty
    private Integer UNIV_ZIP;

    @JsonProperty
    private String MAJOR_NM;

    @JsonProperty
    private String MAJOR_STATUS;

    @JsonProperty
    private String DAY_TIME;

}
