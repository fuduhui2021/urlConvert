package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;

@Controller
public class ConvertController {

    /**
     * 根据长地址获取短地址
     * @param longUrl
     * @return
     */
    @ResponseBody
    @RequestMapping("/getShortUrl")
    public String getShortUrl(String longUrl)
    {
        BigDecimal maxIndex=ConvertDB.getMaxIndexRec();
        BigDecimal nextUrl=maxIndex.add(new BigDecimal(1));
        ConvertPOJO pojo=new ConvertPOJO(nextUrl.toString(),longUrl);
        ConvertDB.saveUrlMap(pojo);
        String shortUrl=ConvertTool._10_to_62(nextUrl.longValue(),0);
        return shortUrl;
    }


    /**
     * 根据短地址获取长地址
     * @param shortUrl
     * @return
     */
    @ResponseBody
    @RequestMapping("/getLongUrl")
    public String getLongUrl(String shortUrl)
    {
        return ConvertDB.getLongUrlByShort(shortUrl);

    }
}