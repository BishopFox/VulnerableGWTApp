package org.apache.jdo.tck.pc.company;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QDepartment extends PersistableExpressionImpl<Department> implements PersistableExpression<Department>
{
    public static final QDepartment jdoCandidate = candidate("this");

    public static QDepartment candidate(String name)
    {
        return new QDepartment(null, name, 5);
    }

    public static QDepartment candidate()
    {
        return jdoCandidate;
    }

    public static QDepartment parameter(String name)
    {
        return new QDepartment(Department.class, name, ExpressionType.PARAMETER);
    }

    public static QDepartment variable(String name)
    {
        return new QDepartment(Department.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> deptid;
    public final StringExpression name;
    public final org.apache.jdo.tck.pc.company.QCompany company;
    public final org.apache.jdo.tck.pc.company.QEmployee employeeOfTheMonth;
    public final CollectionExpression employees;
    public final CollectionExpression fundedEmps;
    public final ListExpression meetingRooms;

    public QDepartment(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.deptid = new NumericExpressionImpl<Long>(this, "deptid");
        this.name = new StringExpressionImpl(this, "name");
        if (depth > 0)
        {
            this.company = new org.apache.jdo.tck.pc.company.QCompany(this, "company", depth-1);
        }
        else
        {
            this.company = null;
        }
        if (depth > 0)
        {
            this.employeeOfTheMonth = new org.apache.jdo.tck.pc.company.QEmployee(this, "employeeOfTheMonth", depth-1);
        }
        else
        {
            this.employeeOfTheMonth = null;
        }
        this.employees = new CollectionExpressionImpl(this, "employees");
        this.fundedEmps = new CollectionExpressionImpl(this, "fundedEmps");
        this.meetingRooms = new ListExpressionImpl(this, "meetingRooms");
    }

    public QDepartment(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.deptid = new NumericExpressionImpl<Long>(this, "deptid");
        this.name = new StringExpressionImpl(this, "name");
        this.company = new org.apache.jdo.tck.pc.company.QCompany(this, "company", 5);
        this.employeeOfTheMonth = new org.apache.jdo.tck.pc.company.QEmployee(this, "employeeOfTheMonth", 5);
        this.employees = new CollectionExpressionImpl(this, "employees");
        this.fundedEmps = new CollectionExpressionImpl(this, "fundedEmps");
        this.meetingRooms = new ListExpressionImpl(this, "meetingRooms");
    }
}
