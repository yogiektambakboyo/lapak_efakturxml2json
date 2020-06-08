package com.lapakkreatiflamongan.xmljsonefaktur;

import android.util.Log;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class readXML {
    public static resValidateFakturPm readValues(String xml){
        XmlMapper mapper = new XmlMapper();
        resValidateFakturPm result = null;
        try {
            result = mapper.readValue(xml, resValidateFakturPm.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            Log.e("onCreates : ",  e.getMessage().toString());

        }

        return result;
    }

    }
