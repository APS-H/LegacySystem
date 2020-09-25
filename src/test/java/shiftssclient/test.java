package shiftssclient;

import java.util.List;

public class test {
    public static void main(String args[]) throws Exception_Exception {
        ShiftServiceService ss=new ShiftServiceService();
        ShiftService s=ss.getShiftServicePort();
        List<Shift> res=s.getShiftService();

        res.get(0);

    }
}
