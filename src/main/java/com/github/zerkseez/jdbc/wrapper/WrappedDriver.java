/*******************************************************************************
 * Copyright 2016 Xerxes Tsang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.github.zerkseez.jdbc.wrapper;

import javax.annotation.Generated;

@Generated("com.github.zerkseez.codegen.wrappergenerator.WrapperGenerator")
public class WrappedDriver implements java.sql.Driver {
    private final java.sql.Driver wrappedObject;

    public WrappedDriver(final java.sql.Driver wrappedObject) {
        this.wrappedObject = wrappedObject;
    }

    @Override
    public boolean acceptsURL(final String p0) throws java.sql.SQLException {
        return wrappedObject.acceptsURL(p0);
    }

    @Override
    public java.sql.Connection connect(final String p0, final java.util.Properties p1) throws java.sql.SQLException {
        return wrappedObject.connect(p0, p1);
    }

    @Override
    public int getMajorVersion() {
        return wrappedObject.getMajorVersion();
    }

    @Override
    public int getMinorVersion() {
        return wrappedObject.getMinorVersion();
    }

    @Override
    public java.util.logging.Logger getParentLogger() throws java.sql.SQLFeatureNotSupportedException {
        return wrappedObject.getParentLogger();
    }

    @Override
    public java.sql.DriverPropertyInfo[] getPropertyInfo(final String p0, final java.util.Properties p1) throws java.sql.SQLException {
        return wrappedObject.getPropertyInfo(p0, p1);
    }

    @Override
    public boolean jdbcCompliant() {
        return wrappedObject.jdbcCompliant();
    }
}
