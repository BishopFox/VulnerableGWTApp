package org.apache.jdo.tck.pc.company;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QEmployee extends org.apache.jdo.tck.pc.company.QPerson
{
    public static final QEmployee jdoCandidate = candidate("this");

    public static QEmployee candidate(String name)
    {
        return new QEmployee(null, name, 5);
    }

    public static QEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QEmployee parameter(String name)
    {
        return new QEmployee(Employee.class, name, ExpressionType.PARAMETER);
    }

    public static QEmployee variable(String name)
    {
        return new QEmployee(Employee.class, name, ExpressionType.VARIABLE);
    }

    public final DateTimeExpression hiredate;
    public final NumericExpression<Double> weeklyhours;
    public final org.apache.jdo.tck.pc.company.QDentalInsurance dentalInsurance;
    public final org.apache.jdo.tck.pc.company.QMedicalInsurance medicalInsurance;
    public final org.apache.jdo.tck.pc.company.QDepartment department;
    public final org.apache.jdo.tck.pc.company.QDepartment fundingDept;
    public final org.apache.jdo.tck.pc.company.QEmployee manager;
    public final org.apache.jdo.tck.pc.company.QEmployee mentor;
    public final org.apache.jdo.tck.pc.company.QEmployee protege;
    public final org.apache.jdo.tck.pc.company.QEmployee hradvisor;
    public final CollectionExpression reviewedProjects;
    public final CollectionExpression projects;
    public final CollectionExpression team;
    public final CollectionExpression hradvisees;

    public QEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.hiredate = new DateTimeExpressionImpl(this, "hiredate");
        this.weeklyhours = new NumericExpressionImpl<Double>(this, "weeklyhours");
        if (depth > 0)
        {
            this.dentalInsurance = new org.apache.jdo.tck.pc.company.QDentalInsurance(this, "dentalInsurance", depth-1);
        }
        else
        {
            this.dentalInsurance = null;
        }
        if (depth > 0)
        {
            this.medicalInsurance = new org.apache.jdo.tck.pc.company.QMedicalInsurance(this, "medicalInsurance", depth-1);
        }
        else
        {
            this.medicalInsurance = null;
        }
        if (depth > 0)
        {
            this.department = new org.apache.jdo.tck.pc.company.QDepartment(this, "department", depth-1);
        }
        else
        {
            this.department = null;
        }
        if (depth > 0)
        {
            this.fundingDept = new org.apache.jdo.tck.pc.company.QDepartment(this, "fundingDept", depth-1);
        }
        else
        {
            this.fundingDept = null;
        }
        if (depth > 0)
        {
            this.manager = new org.apache.jdo.tck.pc.company.QEmployee(this, "manager", depth-1);
        }
        else
        {
            this.manager = null;
        }
        if (depth > 0)
        {
            this.mentor = new org.apache.jdo.tck.pc.company.QEmployee(this, "mentor", depth-1);
        }
        else
        {
            this.mentor = null;
        }
        if (depth > 0)
        {
            this.protege = new org.apache.jdo.tck.pc.company.QEmployee(this, "protege", depth-1);
        }
        else
        {
            this.protege = null;
        }
        if (depth > 0)
        {
            this.hradvisor = new org.apache.jdo.tck.pc.company.QEmployee(this, "hradvisor", depth-1);
        }
        else
        {
            this.hradvisor = null;
        }
        this.reviewedProjects = new CollectionExpressionImpl(this, "reviewedProjects");
        this.projects = new CollectionExpressionImpl(this, "projects");
        this.team = new CollectionExpressionImpl(this, "team");
        this.hradvisees = new CollectionExpressionImpl(this, "hradvisees");
    }

    public QEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.hiredate = new DateTimeExpressionImpl(this, "hiredate");
        this.weeklyhours = new NumericExpressionImpl<Double>(this, "weeklyhours");
        this.dentalInsurance = new org.apache.jdo.tck.pc.company.QDentalInsurance(this, "dentalInsurance", 5);
        this.medicalInsurance = new org.apache.jdo.tck.pc.company.QMedicalInsurance(this, "medicalInsurance", 5);
        this.department = new org.apache.jdo.tck.pc.company.QDepartment(this, "department", 5);
        this.fundingDept = new org.apache.jdo.tck.pc.company.QDepartment(this, "fundingDept", 5);
        this.manager = new org.apache.jdo.tck.pc.company.QEmployee(this, "manager", 5);
        this.mentor = new org.apache.jdo.tck.pc.company.QEmployee(this, "mentor", 5);
        this.protege = new org.apache.jdo.tck.pc.company.QEmployee(this, "protege", 5);
        this.hradvisor = new org.apache.jdo.tck.pc.company.QEmployee(this, "hradvisor", 5);
        this.reviewedProjects = new CollectionExpressionImpl(this, "reviewedProjects");
        this.projects = new CollectionExpressionImpl(this, "projects");
        this.team = new CollectionExpressionImpl(this, "team");
        this.hradvisees = new CollectionExpressionImpl(this, "hradvisees");
    }
}
