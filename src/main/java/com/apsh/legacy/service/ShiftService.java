package com.apsh.legacy.service;

import com.apsh.legacy.data.ShiftData;
import com.apsh.legacy.entity.Shift;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class ShiftService {

    private final ShiftData shiftData;

    public ShiftService() {
        this.shiftData = new ShiftData();
    }

    @WebMethod
    public List<Shift> getShiftAll() {
        return shiftData.getShifts();
    }

    @WebMethod
    public List<Shift> getGroupShiftByTime(String beginTime,String endTime) {
        return shiftData.getGroupShiftsByTime(beginTime,endTime);
    }

    @WebMethod
    public List<Shift> getGroupShiftByCode(String code) {
        return shiftData.getGroupShiftsByCode(code);
    }

    @WebMethod
    public List<Shift> getGroupShiftByGroupId(String GroupId) {
        return shiftData.getGroupShiftsByGroupId(GroupId);
    }

    @WebMethod
    public Shift getShiftByCode(String Code) {
        return shiftData.getShiftsByCode(Code);
    }

    @WebMethod
    public List<Shift> getShiftByTime(String beginTime,String endTime) {
        return shiftData.getShiftsByTime(beginTime, endTime);
    }

}
