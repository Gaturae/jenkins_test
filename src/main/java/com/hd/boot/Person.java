package com.hd.boot;

import lombok.Data;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelTarget;

import java.util.Date;
import java.util.UUID;

@ExcelTarget("black_list")
@Data
public class Person {

    private String id= UUID.randomUUID().toString();// UUID
    @Excel(name = "证件号码", orderNum = "2", mergeVertical = false, isImportField = "cardNo",width = 20)
    private String cardNo;   //身份证号码
    @Excel(name = "姓名", orderNum = "1", mergeVertical = false, isImportField = "name",width = 20)
    private String name;   //姓名
    @Excel(name = "黑名单类型", orderNum = "3", mergeVertical = false, isImportField = "warntype",width = 20)
    private String warntype; //黑名单类型信息
    @Excel(name = "黑名单编号", orderNum = "4", mergeVertical = false, isImportField = "warncode",width = 20)
    private Integer warncode;  //黑名单类型编号

    @Excel(name = "有效时间", orderNum = "7", mergeVertical = false, isImportField = "agingDate",width = 20,importFormat = "yyyy-MM-dd HH:mm:ss",exportFormat ="yyyy-MM-dd HH:mm:ss" )
    private Date agingDate;   //入库时间
    @Excel(name = "黑名单信息", orderNum = "5", mergeVertical = false, isImportField = "warninfo",width = 20)
    private String warninfo;  //黑名单描述


}
