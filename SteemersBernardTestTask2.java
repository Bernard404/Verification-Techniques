package cm;

import org.junit.Test;

import java.util.ArrayList;
import java.math.BigDecimal;

import static org.junit.Assert.*;


public class SteemersBernardTestTask2 {

    /////////////////////////Rate Test Cases////////////////////////////////////////////
    //1
    @Test
    public void normalRateSuccess()
    {
        CarParkKind kind =  CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(8,10);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(6,7);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //2
    @Test(expected = IllegalArgumentException.class)
    public void normalRateNegative()
    {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(-10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(8,10);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(6,7);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }


    //3
    @Test(expected = IllegalArgumentException.class)
    public void normalRateNull()
    {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = null;
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(8,10);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(6,7);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //4
    @Test
    public void reducedRateSuccess()
    {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(8,10);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(6,7);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //5
    @Test(expected = IllegalArgumentException.class)
    public void reducedRateNegative()
    {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(-5);
        Period np = new Period(8,10);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(6,7);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //6
    @Test(expected = IllegalArgumentException.class)
    public void reducedRateNull()
    {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = null;
        Period np = new Period(8,10);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(6,7);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //7
    @Test()
    public void NRGreaterRRSuccess()
    {
        CarParkKind kind = CarParkKind.VISITOR;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);;
        Period np = new Period(8,10);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(6,7);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //8
    @Test(expected = IllegalArgumentException.class)
    public void RRGreaterNR()
    {
        CarParkKind kind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(15);;
        Period np = new Period(8,10);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(6,7);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //9
    @Test(expected = IllegalArgumentException.class)
    public void NRNullGreaterRR()
    {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = null;
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(8,10);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(6,7);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //10
    @Test(expected = IllegalArgumentException.class)
    public void NRGreaterRRNull()
    {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = null;
        Period np = new Period(8,10);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(6,7);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //11
    @Test()
    public void overLapSuccess()
    {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(8,10);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(6,7);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //12
    @Test(expected = NullPointerException.class)
    public void overLapNPNull()
    {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = null;
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(6,7);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //13
    @Test(expected = NullPointerException.class)
    public void overLapRPNull()
    {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(8,10);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = null;
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //14
    @Test(expected = IllegalArgumentException.class)
    public void overLap()
    {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(7,10);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(6,8);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //15
    @Test(expected = IllegalArgumentException.class)
    public void negativeNPOverLap()
    {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(-7,10);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(6,8);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //16
    @Test(expected = IllegalArgumentException.class)
    public void negativeRPoverLap()
    {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(7,10);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(-6,8);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //21
    @Test(expected = IllegalArgumentException.class)
    public void normalPeriodNullTest()
    {
        CarParkKind kind =  CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(8,10);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(6,7);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,null,reducedPeriods);
    }

    //22
    @Test(expected = IllegalArgumentException.class)
    public void reducedRateNullTest()
    {
        CarParkKind kind =  CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(8,10);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(6,7);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,null);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////

    //23
    @Test
    public void overLapping()
    {
        CarParkKind kind =  CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(8,10);
        Period np2 = new Period(11,13);
        Period np3 = new Period(14,16);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        normalPeriods.add(np2);
        normalPeriods.add(np3);
        Period rp = new Period(4,5);
        Period rp2 = new Period(5,6);
        Period rp3 = new Period(6,7);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        reducedPeriods.add(rp2);
        reducedPeriods.add(rp3);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //24
    @Test(expected = IllegalArgumentException.class)
    public void npOverLapping()
    {
        CarParkKind kind =  CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(8,10);
        Period np2 = new Period(9,12);
        Period np3 = new Period(11,14);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        normalPeriods.add(np2);
        normalPeriods.add(np3);
        Period rp = new Period(4,5);
        Period rp2 = new Period(5,6);
        Period rp3 = new Period(6,7);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        reducedPeriods.add(rp2);
        reducedPeriods.add(rp3);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //25
    @Test(expected = IllegalArgumentException.class)
    public void rpOverLapping()
    {
        CarParkKind kind =  CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(8,10);
        Period np2 = new Period(9,12);
        Period np3 = new Period(11,14);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        normalPeriods.add(np2);
        normalPeriods.add(np3);
        Period rp = new Period(3,5);
        Period rp2 = new Period(4,6);
        Period rp3 = new Period(5,7);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        reducedPeriods.add(rp2);
        reducedPeriods.add(rp3);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //26
    @Test(expected = IllegalArgumentException.class)
    public void npRPOverLapping()
    {
        CarParkKind kind =  CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(8,10);
        Period np2 = new Period(10,12);
        Period np3 = new Period(12,14);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        normalPeriods.add(np2);
        normalPeriods.add(np3);
        Period rp = new Period(13,14);
        Period rp2 = new Period(14,16);
        Period rp3 = new Period(16,18);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        reducedPeriods.add(rp2);
        reducedPeriods.add(rp3);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //27
    @Test(expected = IllegalArgumentException.class)
    public void NPRPOverLapping()
    {
        CarParkKind kind =  CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(8,10);
        Period np2 = new Period(10,12);
        Period np3 = new Period(12,14);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        normalPeriods.add(np2);
        normalPeriods.add(np3);
        Period rp = new Period(7,11);
        Period rp2 = new Period(10,12);
        Period rp3 = new Period(11,15);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        reducedPeriods.add(rp2);
        reducedPeriods.add(rp3);
        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }

    //28
    @Test(expected = IllegalArgumentException.class)
    public void oneLessOverLapping()
    {
        CarParkKind kind =  CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(8,10);
        Period np2 = new Period(10,12);
        Period np3 = new Period(12,14);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        normalPeriods.add(np2);
        normalPeriods.add(np3);
        Period rp = new Period(7,11);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);

        Rate rate = new Rate(kind,normalRate,reducedRate,normalPeriods,reducedPeriods);
    }


    /////////////////////////Calculate Test Cases////////////////////////////////////////////
    //17
    @Test
    public void calculateNormal()
    {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(9,17);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(1,8);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriods,normalPeriods);

        Period stayPeriod = new Period(12,13);
        assertEquals(new BigDecimal("8.8750"), rate.calculate(stayPeriod));
    }
    //18
    @Test
    public void calculateLessNR()
    {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(6);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(9,17);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(1,8);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriods,normalPeriods);

        Period stayPeriod = new Period(7,12);
        assertEquals(new BigDecimal("18.6250"), rate.calculate(stayPeriod));
    }
    //19
    @Test
    public void calculateLessRR()
    {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(3);
        Period np = new Period(9,17);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(1,8);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriods,normalPeriods);

        Period stayPeriod = new Period(7,12);
        assertEquals(new BigDecimal("26.1250"), rate.calculate(stayPeriod));
    }
    //20
    @Test
    public void calculateFreePortion()
    {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(9,17);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(1,8);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriods,normalPeriods);

        Period stayPeriod = new Period(7,12);
        assertEquals(new BigDecimal("27.6250"), rate.calculate(stayPeriod));
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////

    //29
    @Test
    public void calculateSLessThanStaffMin()
    {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(9,17);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(1,8);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriods,normalPeriods);

        Period stayPeriod = new Period(2,3);
        assertEquals(new BigDecimal("16"), rate.calculate(stayPeriod));
    }

    //30
    @Test
    public void calculateSMoreThanStaffMin()
    {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(9,17);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(1,8);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriods,normalPeriods);

        Period stayPeriod = new Period(3, 9);
        assertEquals(new BigDecimal("25"), rate.calculate(stayPeriod));
    }

    //31
    @Test
    public void calculateMoreThanReduceStudent()
    {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(9,17);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(1,8);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriods,normalPeriods);

        Period stayPeriod = new Period(4,5);
        assertEquals(new BigDecimal("5"), rate.calculate(stayPeriod));
    }

    //32
    @Test
    public void calculateLessThanManagement()
    {
        CarParkKind kind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);
        Period np = new Period(9,17);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(1,8);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriods,normalPeriods);

        Period stayPeriod = new Period(6,7);
        assertEquals(new BigDecimal("3"), rate.calculate(stayPeriod));
    }

    //32
    @Test
    public void calculateMoreThanManagement()
    {
        CarParkKind kind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);
        Period np = new Period(9,17);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(1,8);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriods,normalPeriods);

        Period stayPeriod = new Period(6,12);
        assertEquals(new BigDecimal("8"), rate.calculate(stayPeriod));
    }

    //32
    @Test
    public void calculateMoreThanVisitor()
    {
        CarParkKind kind = CarParkKind.VISITOR;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(9,17);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(1,8);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriods,normalPeriods);

        Period stayPeriod = new Period(11,15);
        assertEquals(new BigDecimal("16.00"), rate.calculate(stayPeriod));
    }

    //33
    @Test
    public void calculateLessThanVisitor()
    {
        CarParkKind kind = CarParkKind.VISITOR;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        Period np = new Period(9,17);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(np);
        Period rp = new Period(1,8);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(rp);
        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriods,normalPeriods);

        Period stayPeriod = new Period(5,6);
        assertEquals(new BigDecimal("5"), rate.calculate(stayPeriod));
    }

}
/*
* Test Case #:
1: Test normal rate greater than or equal to 0 Successfully.
2: Test normal rate greater than or equal to 0 with negative normal rate.
3: Test normal rate greater than or equal to 0 w/ null normal rate.
4: Test reduced rate greater than or equal to 0 Successfully.
5: Test reduced rate greater than or equal to 0 w/ negative reduced value.
6: Test reduced rate greater than or equal to 0 w/ null reduced value.
7: Test normal rate greater than or equal to reduced rate Successfully.
8: Test normal rate greater than or equal to reduced rate w/ larger RR value.
9: Test normal rate greater than or equal to reduced rate w/ Null NR value.
10: Test normal rate greater than or equal to reduced rate w/ Null RR value.
11: Test period overlap with non overlapping times successfully
12: Test period overlap with null NR value
13: Test period overlap with null RR value
14: Test period overlap with overlapping times from 7 until 8
15: Test period overlap with negative normal rate time -7 hours
16: Test period overlap with negative reduced rate time -6 hours

calculate()
17: Test calculate() Reduced and Normal rate
18: Test calculate() Reduced and lesser Normal rate
19:Test calculate() lesser Reduced and Normal rate
20: Test calculate() Reduced,Normal and Free rate

* */