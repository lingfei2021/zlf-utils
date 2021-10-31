package com.zlf.utils.java.tools.contrast_object;

import lombok.Data;
import org.springframework.util.StringUtils;

@Data
public class SkuVo {
    private String title;
    private String sku;
    private String color;
    private String size;
    private String src;

    private String supplierColor;
    private String supplierSize;

    private Integer saleStatus;
    private Integer stockMode;


    /**
     * 颜色
     */
    private String option1;

    /**
     * 尺码
     */
    private String option2;

    public String getOption1() {
        if (StringUtils.hasText(option1)) {
            return option1;
        }
        return color;
    }

    public String getOption2() {
        if (StringUtils.hasText(option2)) {
            return option2;
        }
        return size;
    }

    public String getColor() {
        if (StringUtils.hasText(color)) {
            return color;
        }
        return option1;
    }

    public String getSize() {
        if (StringUtils.hasText(size)) {
            return size;
        }
        return option2;
    }

}
