package com.dna.def.Vd;
import java.util.Date;

public class Vd implements Cloneable {
    private String vdCode;
    private String vdName;
    private String vdDescription;
    private int serNo;//序号，用于排序
    private String dataType;
    private String mdCode;//主数据代码
    private String vdControl=null;
    private Date lastTime;//最近更新时间
    //private VdExtension extension = null;
}
