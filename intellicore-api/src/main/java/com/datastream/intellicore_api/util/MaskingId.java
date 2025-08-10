package com.datastream.intellicore_api.util;

import org.springframework.stereotype.Component;

@Component
public class MaskingId {

    public static String MaskingIdUtility(String id){
//        if (id.length() > 10) {
            String maskedId = id.substring(0, 10) + "********" + id.substring(id.length()-1);
            return maskedId;

    }

}
