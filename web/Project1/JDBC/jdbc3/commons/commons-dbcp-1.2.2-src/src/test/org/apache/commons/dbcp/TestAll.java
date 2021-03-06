/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.dbcp;

import junit.framework.*;
import org.apache.commons.dbcp.datasources.TestSharedPoolDataSource;
import org.apache.commons.dbcp.datasources.TestPerUserPoolDataSource;
import org.apache.commons.dbcp.datasources.TestFactory;

/**
 * @author Rodney Waldhoff
 * @version $Revision: 479137 $ $Date: 2006-11-25 08:51:48 -0700 (Sat, 25 Nov 2006) $
 */
public class TestAll extends TestCase {
    public TestAll(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(TestAbandonedObjectPool.suite());
        suite.addTest(TestManual.suite());
        suite.addTest(TestJOCLed.suite());
        suite.addTest(TestBasicDataSourceFactory.suite());
        suite.addTest(TestBasicDataSource.suite());
        suite.addTest(TestAbandonedBasicDataSource.suite());
        suite.addTest(TestPStmtPoolingBasicDataSource.suite());
        suite.addTest(TestDelegatingConnection.suite());
        suite.addTest(TestDelegatingStatement.suite());
        suite.addTest(TestDelegatingPreparedStatement.suite());
        suite.addTest(TestPoolableConnection.suite());
        suite.addTest(TestSharedPoolDataSource.suite());
        suite.addTest(TestPerUserPoolDataSource.suite());
        suite.addTest(TestFactory.suite());
        return suite;
    }

    public static void main(String args[]) {
        String[] testCaseName = { TestAll.class.getName() };
        junit.textui.TestRunner.main(testCaseName);
    }
}
