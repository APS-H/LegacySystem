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
    public List<Shift> getShiftService() {
        return shiftData.getShifts();
    }

}
