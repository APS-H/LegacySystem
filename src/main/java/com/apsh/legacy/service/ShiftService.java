package com.apsh.legacy.service;

import com.apsh.legacy.data.ShiftData;
import com.apsh.legacy.entity.Shift;
import com.apsh.legacy.entity.Shifts;
import com.apsh.legacy.util.Transformer;

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
    public String getShiftService() throws Exception {
        List<Shift> res = shiftData.getShifts();
        Shifts sfs = new Shifts(res);
        Transformer<Shifts> jtx = new Transformer<>();
        return jtx.java2Xml(sfs);
    }

}
