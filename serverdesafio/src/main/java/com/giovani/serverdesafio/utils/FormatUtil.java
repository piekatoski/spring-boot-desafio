package com.giovani.serverdesafio.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FormatUtil {
  
  public static Date formataDate(String date){
    SimpleDateFormat sdf = new SimpleDateFormat("dd/HH/yyyy");
    try{
      return sdf.parse(date);
    }catch(ParseException ex){
      ex.getCause();
      return null;
    }
  }

}
