package com.ohgiraffers.common;

public class CategoryDTO {

    private int categoryCode;
    private String categoryName;
    private Integer refcategoryCode;

    public CategoryDTO(){}

    public CategoryDTO(int categoryCode, String categoryName, Integer refcategoryCode) {
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.refcategoryCode = refcategoryCode;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getRefcategoryCode() {
        return refcategoryCode;
    }

    public void setRefcategoryCode(Integer refcategoryCode) {
        this.refcategoryCode = refcategoryCode;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "categoryCode=" + categoryCode +
                ", categoryName='" + categoryName + '\'' +
                ", refcategoryCode=" + refcategoryCode +
                '}';
    }
}
