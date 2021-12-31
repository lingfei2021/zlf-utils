package com.zlf.utils.java.tools.json;

import lombok.Data;

import java.util.List;

@Data
public class AttrVo {

    /**
     * \"id\": \"31\",\n" +
     *                 "        \"enName\": \"Details\",\n" +
     *                 "        \"name\": \"细节\",\n" +
     *                 "        \"children\": [\n" +
     */
    private String id;
    private String enName;
    private String name;
    private List<AttrVo> children;

}
