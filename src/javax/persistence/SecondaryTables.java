/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright 1997-2007 Sun Microsystems, Inc. All rights reserved.
 * 
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License. You can obtain
 * a copy of the License at https://glassfish.dev.java.net/public/CDDL+GPL.html
 * or glassfish/bootstrap/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at glassfish/bootstrap/legal/LICENSE.txt.
 * Sun designates this particular file as subject to the "Classpath" exception
 * as provided by Sun in the GPL Version 2 section of the License file that
 * accompanied this code.  If applicable, add the following below the License
 * Header, with the fields enclosed by brackets [] replaced by your own
 * identifying information: "Portions Copyrighted [year]
 * [name of copyright owner]"
 * 
 * Contributor(s):
 * 
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package javax.persistence;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * This annotation is used to specify multiple secondary tables 
 * for an entity.
 *
 * <pre>
 *    Example 1: Multiple secondary tables assuming primary key columns are named the same in all tables.
 *
 *    &#064;Entity
 *    &#064;Table(name="EMPLOYEE")
 *    &#064;SecondaryTables({
 *        &#064;SecondaryTable(name="EMP_DETAIL"),
 *        &#064;SecondaryTable(name="EMP_HIST")
 *    })
 *    public class Employee { ... }
 *    
 *    Example 2: Multiple secondary tables with differently named primary key columns. 
 *
 *    &#064;Entity
 *    &#064;Table(name="EMPLOYEE")
 *    &#064;SecondaryTables({
 *        &#064;SecondaryTable(name="EMP_DETAIL", 
 *            pkJoinColumns=&#064;PrimaryKeyJoinColumn(name="EMPL_ID")),
 *        &#064;SecondaryTable(name="EMP_HIST", 
 *            pkJoinColumns=&#064;PrimaryKeyJoinColumn(name="EMPLOYEE_ID"))
 *    })
 *    public class Employee { ... }
 * </pre>
 *
 * @since Java Persistence 1.0
 */
@Target(TYPE) 
@Retention(RUNTIME)

public @interface SecondaryTables {

    /** The secondary tables for an entity. */
    SecondaryTable[] value();
}
