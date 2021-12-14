package com;

import java.math.BigDecimal;

/**
 * 数据库操作
 */
public  class ConvertDB {



    /**
     * 获取数据库已经分配到的最大的短地址
     * @return 10进制的短编码地址
     */
    public static BigDecimal getMaxIndexRec(){
        BigDecimal index = null;//模拟数据库的取值,实际从数据库取
        if(index==null || index.compareTo(new BigDecimal(0))<=0 ){//第一次没有的时候
            index=new BigDecimal(0);
        }
        return index;
    }

    /**
     * 保存地址映射关系到数据库
     * @param pojo
     */
    public static void saveUrlMap(ConvertPOJO pojo) {
        //todo 查询数据库
    }


    /**
     * 根据短地址获取长地址
     * @param shortUrl
     * @return
     */
    public static String getLongUrlByShort(String shortUrl){
        String dbShortUrl=ConvertTool.convertBase62ToDecimal_v2(shortUrl);
        String ret=null;//todo 根据dbShortUrl查询数据库
        return ret;
    }


}
