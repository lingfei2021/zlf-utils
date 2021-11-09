package com.zlf.utils.java.tools.contrast_object;

import lombok.Data;

import java.io.Serializable;

@Data
public class NcDiffRecord implements Serializable {

    private String newDiffItemName;
 
    private String oldDiffItemName;
    private String expectValue;
    private String actualValue;
 
}