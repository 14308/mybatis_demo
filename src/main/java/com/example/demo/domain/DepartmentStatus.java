package com.example.demo.domain;

/**
 * Created by 陆小凤 on 2017/7/21.
 */
public enum DepartmentStatus {
    ENABLED(1),DISABLED(0);

    private int id;
    DepartmentStatus(int id) {
        this.id = id;
    }

    public static DepartmentStatus parse(Long id){
        for (DepartmentStatus departmentStatus:DepartmentStatus.values()){
            if(departmentStatus.getId() == id)
                return departmentStatus;
        }
        return null;
    }
    /*public static void main(String[] args){
        System.out.println(DepartmentStatus.values()[0]);
    }*/
    public int getId() {
        return id;
    }

}
