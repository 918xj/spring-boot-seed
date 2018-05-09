package com.ttsh.mc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 国家信息
 * </p>
 *
 * @author Mars
 * @since 2018-04-25
 */
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;
    /**
     * 名称
     */
    private String countryname;
    /**
     * 代码
     */
    private String countrycode;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    @Override
    public String toString() {
        return "Country{" +
        "Id=" + Id +
        ", countryname=" + countryname +
        ", countrycode=" + countrycode +
        "}";
    }
}
