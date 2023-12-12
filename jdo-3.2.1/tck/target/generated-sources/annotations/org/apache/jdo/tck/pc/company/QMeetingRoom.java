package org.apache.jdo.tck.pc.company;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QMeetingRoom extends PersistableExpressionImpl<MeetingRoom> implements PersistableExpression<MeetingRoom>
{
    public static final QMeetingRoom jdoCandidate = candidate("this");

    public static QMeetingRoom candidate(String name)
    {
        return new QMeetingRoom(null, name, 5);
    }

    public static QMeetingRoom candidate()
    {
        return jdoCandidate;
    }

    public static QMeetingRoom parameter(String name)
    {
        return new QMeetingRoom(MeetingRoom.class, name, ExpressionType.PARAMETER);
    }

    public static QMeetingRoom variable(String name)
    {
        return new QMeetingRoom(MeetingRoom.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> roomid;
    public final StringExpression name;

    public QMeetingRoom(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.roomid = new NumericExpressionImpl<Long>(this, "roomid");
        this.name = new StringExpressionImpl(this, "name");
    }

    public QMeetingRoom(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.roomid = new NumericExpressionImpl<Long>(this, "roomid");
        this.name = new StringExpressionImpl(this, "name");
    }
}
