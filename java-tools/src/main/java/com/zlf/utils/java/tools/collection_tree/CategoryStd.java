package com.zlf.utils.java.tools.collection_tree;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 类目标准
 */
@Data
@Builder
public class CategoryStd implements Serializable {
    private Long id;
    private Long parentId;
    private String parentName;
    private String categoryName;
    private Integer level;
    private String categoryId;
    private String code;
}