package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCAppDepartment extends PersistableExpressionImpl<FCAppDepartment> implements PersistableExpression<FCAppDepartment>
{
    public static final QFCAppDepartment jdoCandidate = candidate("this");

    public static QFCAppDepartment candidate(String name)
    {
        return new QFCAppDepartment(null, name, 5);
    }

    public static QFCAppDepartment candidate()
    {
        return jdoCandidate;
    }

    public static QFCAppDepartment parameter(String name)
    {
        return new QFCAppDepartment(FCAppDepartment.class, name, ExpressionType.PARAMETER);
    }

    public static QFCAppDepartment variable(String name)
    {
        return new QFCAppDepartment(FCAppDepartment.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> deptid;
    public final StringExpression name;
    public final org.apache.jdo.tck.pc.companyAnnotatedFC.QFCAppCompany company;
    public final ObjectExpression<org.apache.jdo.tck.pc.companyAnnotatedFC.FCAppEmployee> employeeOfTheMonth;
    public final CollectionExpression employees;
    public final CollectionExpression fundedEmps;

    public QFCAppDepartment(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.deptid = new NumericExpressionImpl<Long>(this, "deptid");
        this.name = new StringExpressionImpl(this, "name");
        if (depth > 0)
        {
            this.company = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCAppCompany(this, "company", depth-1);
        }
        else
        {
            this.company = null;
        }
        this.employeeOfTheMonth = new ObjectExpressionImpl<org.apache.jdo.tck.pc.companyAnnotatedFC.FCAppEmployee>(this, "employeeOfTheMonth");
        this.employees = new CollectionExpressionImpl(this, "employees");
        this.fundedEmps = new CollectionExpressionImpl(this, "fundedEmps");
    }

    public QFCAppDepartment(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.deptid = new NumericExpressionImpl<Long>(this, "deptid");
        this.name = new StringExpressionImpl(this, "name");
        this.company = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCAppCompany(this, "company", 5);
        this.employeeOfTheMonth = new ObjectExpressionImpl<org.apache.jdo.tck.pc.companyAnnotatedFC.FCAppEmployee>(this, "employeeOfTheMonth");
        this.employees = new CollectionExpressionImpl(this, "employees");
        this.fundedEmps = new CollectionExpressionImpl(this, "fundedEmps");
    }
}
