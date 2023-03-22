package com.dna.def.Vd;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;
import  java.util.Date;

public class Dna {

    private long id;
    private String businessType;
    private String dnaCode;
    private int serNo;//序号，用于排序
    @JsonIgnore
    private Dna parent;
    private String category;
    private String secondCategory;
    private String dbMapCode;
    private String dnaName;
    private String dnaDescription;
    private int minCount;
    private int maxCount;
    private boolean cursive = false;
    private List<Dna> children = new ArrayList<Dna>();
    private List<Vd> vds = new ArrayList<Vd>();
    private Date lastTime;

    public Dna(String businessType, String dnaCode, String dnaName, String Description) {
        this.businessType = businessType;
        this.dnaCode = dnaCode;
        this.dnaName = dnaName;
        this.dnaDescription = dnaDescription;
    }
}
