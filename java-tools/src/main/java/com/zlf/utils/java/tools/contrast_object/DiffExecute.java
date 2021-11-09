package com.zlf.utils.java.tools.contrast_object;


import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class DiffExecute {
    
 
    /**
     * 对比接口结果
     * @param carsourceObj
     * @param popObj
     * @return
     */
    public static boolean diffObject(String diffName, Object carsourceObj, Object popObj, List<NcDiffRecord> diffRecords) {
        if (carsourceObj == null && popObj == null) {
            return true;
        }
        if (isBaseType(carsourceObj, popObj)) {
            if (carsourceObj != null && !carsourceObj.equals(popObj)) {
                addNcDiffRecord(carsourceObj, popObj, diffName, diffRecords);
                return false;
            }else if (popObj != null && !popObj.equals(carsourceObj)) {
                addNcDiffRecord(carsourceObj, popObj, diffName, diffRecords);
                return false;
            } else {
                return true;
            }
        }
        // 旧结果是list
        if (carsourceObj instanceof List) {
            // 新结果不是list报错
            if (!(popObj instanceof List)) {
                addNcDiffRecord(carsourceObj, popObj, diffName+"的类型不同"+"<oldClass>=["+carsourceObj.getClass()+"]<newClass>=["+popObj.getClass()+"]", diffRecords);
                return false;
            }
            Boolean result = true;
            List carsourList = (List) carsourceObj;
            List popList = (List) popObj;
            if (carsourList.size() != popList.size()) {
                addNcDiffRecord(carsourceObj, popObj, diffName+"的集合长度不同", diffRecords);
                return false;
            }
            for (int i = 0; i < carsourList.size(); i++) {
                result = diffObject("list", carsourList.get(i), popList.get(i), diffRecords) && result;
            }
            return result;
        }
        // 旧的不是list,新结果如果是list那么就报错
        if (popObj instanceof List) {
            addNcDiffRecord(carsourceObj, popObj, diffName+"的类型不同"+"<oldClass>=["+carsourceObj.getClass()+"]<newClass>=["+popObj.getClass()+"]", diffRecords);
            return false;
        }
 
        Boolean result = true;
        Map<String, Object> carsourceMap = JSONObject.parseObject(JSONObject.toJSONString(carsourceObj));
        Map<String, Object> popMap = JSONObject.parseObject(JSONObject.toJSONString(popObj));
        if (carsourceMap.size() != popMap.size()) {
            addNcDiffRecord(carsourceObj, popObj, diffName+"对象属性数量不同", diffRecords);
            return false;
        }
        Set<String> keySet = carsourceMap.keySet();
        for (String carsourceKey : keySet) {
            // 属性缺失的情况
            if (!popMap.containsKey(carsourceKey)) {
                addNcDiffRecord(carsourceMap.get(carsourceKey), null, "新结果没有属性为["+carsourceKey+"]的值", diffRecords);
                continue;
            }
            result = diffObject(carsourceKey, carsourceMap.get(carsourceKey), popMap.get(carsourceKey), diffRecords) && result;
        }
        return result;
    }
 
    private static boolean isBaseType(Object carsourceObj, Object popObj) {
        if (carsourceObj instanceof String) {
            return true;
        } else if (carsourceObj instanceof Integer) {
            return true;
        } else if (carsourceObj instanceof Character) {
            return true;
        } else if (carsourceObj instanceof Boolean) {
            return true;
        } else if (carsourceObj instanceof Long){
            return true;
        } else if (carsourceObj instanceof Byte) {
            return true;
        } else if (carsourceObj instanceof Double) {
            return true;
        } else if (carsourceObj instanceof Float) {
            return true;
        } else if (carsourceObj instanceof Short){
            return true;
        } else {
            return false;
        }
    }
 
    public static void addNcDiffRecord(Object carsourceObj, Object popObj, String diffName, List<NcDiffRecord> diffRecords) {
        NcDiffRecord record = new NcDiffRecord();
        record.setExpectValue(JSONObject.toJSONString(carsourceObj));
        record.setActualValue(JSONObject.toJSONString(popObj));
        record.setNewDiffItemName(diffName);
        record.setOldDiffItemName(diffName);
        diffRecords.add(record);
    }
 
}