package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCDSDepartment extends PersistableExpressionImpl<FCDSDepartment> implements PersistableExpression<FCDSDepartment>
{
    public static final QFCDSDepartment jdoCandidate = candidate("this");

    public static QFCDSDepartment candidate(String name)
    {
        return new QFCDSDepartment(null, name, 5);
    }

    public static QFCDSDepartment candidate()
    {
        return jdoCandidate;
    }

    public static QFCDSDepartment parameter(String name)
    {
        return new QFCDSDepartment(FCDSDepartment.class, name, ExpressionType.PARAMETER);
    }

    public static QFCDSDepartment variable(String name)
    {
        return new QFCDSDepartment(FCDSDepartment.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> deptid;
    public final StringExpression name;
    public final org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSCompany company;
    public final org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee employeeOfTheMonth;
    public final CollectionExpression employees;
    public final CollectionExpression fundedEmps;

    public QFCDSDepartment(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.deptid = new NumericExpressionImpl<Long>(this, "deptid");
        this.name = new StringExpressionImpl(this, "name");
        if (depth > 0)
        {
            this.company = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSCompany(this, "company", depth-1);
        }
        else
        {
            this.company = null;
        }
        if (depth > 0)
        {
            this.employeeOfTheMonth = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee(this, "employeeOfTheMonth", depth-1);
        }
        else
        {
            this.employeeOfTheMonth = null;
        }
        this.employees = new CollectionExpressionImpl(this, "employees");
        this.fundedEmps = new CollectionExpressionImpl(this, "fundedEmps");
    }

    public QFCDSDepartment(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.deptid = new NumericExpressionImpl<Long>(this, "deptid");
        this.name = new StringExpressionImpl(this, "name");
        this.company = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSCompany(this, "company", 5);
        this.employeeOfTheMonth = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee(this, "employeeOfTheMonth", 5);
        this.employees = new CollectionExpressionImpl(this, "employees");
        this.fundedEmps = new CollectionExpressionImpl(this, "fundedEmps");
    }
}
