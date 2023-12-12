package org.apache.jdo.tck.pc.companyAnnotatedFC;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QFCDSEmployee extends org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSPerson
{
    public static final QFCDSEmployee jdoCandidate = candidate("this");

    public static QFCDSEmployee candidate(String name)
    {
        return new QFCDSEmployee(null, name, 5);
    }

    public static QFCDSEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QFCDSEmployee parameter(String name)
    {
        return new QFCDSEmployee(FCDSEmployee.class, name, ExpressionType.PARAMETER);
    }

    public static QFCDSEmployee variable(String name)
    {
        return new QFCDSEmployee(FCDSEmployee.class, name, ExpressionType.VARIABLE);
    }

    public final DateTimeExpression hiredate;
    public final NumericExpression<Double> weeklyhours;
    public final org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSDentalInsurance dentalInsurance;
    public final org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSMedicalInsurance medicalInsurance;
    public final org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSDepartment department;
    public final org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSDepartment fundingDept;
    public final org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee manager;
    public final org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee mentor;
    public final org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee protege;
    public final org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee hradvisor;
    public final CollectionExpression reviewedProjects;
    public final CollectionExpression projects;
    public final CollectionExpression team;
    public final CollectionExpression hradvisees;

    public QFCDSEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.hiredate = new DateTimeExpressionImpl(this, "hiredate");
        this.weeklyhours = new NumericExpressionImpl<Double>(this, "weeklyhours");
        if (depth > 0)
        {
            this.dentalInsurance = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSDentalInsurance(this, "dentalInsurance", depth-1);
        }
        else
        {
            this.dentalInsurance = null;
        }
        if (depth > 0)
        {
            this.medicalInsurance = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSMedicalInsurance(this, "medicalInsurance", depth-1);
        }
        else
        {
            this.medicalInsurance = null;
        }
        if (depth > 0)
        {
            this.department = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSDepartment(this, "department", depth-1);
        }
        else
        {
            this.department = null;
        }
        if (depth > 0)
        {
            this.fundingDept = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSDepartment(this, "fundingDept", depth-1);
        }
        else
        {
            this.fundingDept = null;
        }
        if (depth > 0)
        {
            this.manager = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee(this, "manager", depth-1);
        }
        else
        {
            this.manager = null;
        }
        if (depth > 0)
        {
            this.mentor = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee(this, "mentor", depth-1);
        }
        else
        {
            this.mentor = null;
        }
        if (depth > 0)
        {
            this.protege = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee(this, "protege", depth-1);
        }
        else
        {
            this.protege = null;
        }
        if (depth > 0)
        {
            this.hradvisor = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee(this, "hradvisor", depth-1);
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

    public QFCDSEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.hiredate = new DateTimeExpressionImpl(this, "hiredate");
        this.weeklyhours = new NumericExpressionImpl<Double>(this, "weeklyhours");
        this.dentalInsurance = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSDentalInsurance(this, "dentalInsurance", 5);
        this.medicalInsurance = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSMedicalInsurance(this, "medicalInsurance", 5);
        this.department = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSDepartment(this, "department", 5);
        this.fundingDept = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSDepartment(this, "fundingDept", 5);
        this.manager = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee(this, "manager", 5);
        this.mentor = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee(this, "mentor", 5);
        this.protege = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee(this, "protege", 5);
        this.hradvisor = new org.apache.jdo.tck.pc.companyAnnotatedFC.QFCDSEmployee(this, "hradvisor", 5);
        this.reviewedProjects = new CollectionExpressionImpl(this, "reviewedProjects");
        this.projects = new CollectionExpressionImpl(this, "projects");
        this.team = new CollectionExpressionImpl(this, "team");
        this.hradvisees = new CollectionExpressionImpl(this, "hradvisees");
    }
}
