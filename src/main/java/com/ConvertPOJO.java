package com;

import java.math.BigDecimal;

/**
 * 数据库保存的短地址和长地址映射关系
 */
public class ConvertPOJO {
    public String shortUrl;//短链接地址,是一个递增的62进制,在数据库中以十进制保存
    public String longUrl;//长链接地址

    public  ConvertPOJO(String shortUrl,String longUrl){
        this.shortUrl=shortUrl;
        this.longUrl=longUrl;
    }

    public  ConvertPOJO(){

    }




    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }


}
