package cm;

import java.math.BigDecimal;

public interface calculateInterface {
    public BigDecimal calculate(BigDecimal cost);
}

class VisitorRate implements calculateInterface
{
    BigDecimal visitorReduce = new BigDecimal("8");
    BigDecimal greaterBy, visitorPercent = new BigDecimal(".50");

    @Override
    public BigDecimal calculate(BigDecimal cost)
    {
        if (cost.compareTo(visitorReduce) == 1)
        {
            greaterBy = cost.subtract(visitorReduce);
            cost = greaterBy.multiply(visitorPercent);
        }
        return cost;
    }

}

class ManagementRate implements calculateInterface
{
    BigDecimal manageMin = new BigDecimal("3");

    @Override
    public BigDecimal calculate(BigDecimal cost)
    {
        if (cost.compareTo(manageMin) == -1) {
            cost =  manageMin;
        }
        return cost;
    }
}

class StudentRate implements calculateInterface
{
    BigDecimal greaterBy, reduce, studentPercent = new BigDecimal(".75");
    BigDecimal reduceStudent = new BigDecimal("5.50");

    @Override
    public BigDecimal calculate(BigDecimal cost)
    {
        if (cost.compareTo(reduceStudent) == 1) {
            greaterBy = cost.subtract(reduceStudent);
            reduce = greaterBy.multiply(studentPercent);
            cost = reduceStudent.add(reduce);
        }
            return cost;
    }
}

class StaffRate implements calculateInterface
{
    BigDecimal staffMin = new BigDecimal("16");

    @Override
    public BigDecimal calculate(BigDecimal cost)
    {
        if (cost.compareTo(staffMin) == -1)
        {
            cost =  staffMin;
        }
        return cost;
    }
}