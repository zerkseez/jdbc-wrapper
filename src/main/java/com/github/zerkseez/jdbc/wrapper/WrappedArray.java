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
public class WrappedArray implements java.sql.Array {
    private final java.sql.Array wrappedObject;

    public WrappedArray(final java.sql.Array wrappedObject) {
        this.wrappedObject = wrappedObject;
    }

    @Override
    public void free() throws java.sql.SQLException {
        wrappedObject.free();
    }

    @Override
    public Object getArray() throws java.sql.SQLException {
        return wrappedObject.getArray();
    }

    @Override
    public Object getArray(final long p0, final int p1) throws java.sql.SQLException {
        return wrappedObject.getArray(p0, p1);
    }

    @Override
    public Object getArray(final java.util.Map<String, Class<?>> p0) throws java.sql.SQLException {
        return wrappedObject.getArray(p0);
    }

    @Override
    public Object getArray(final long p0, final int p1, final java.util.Map<String, Class<?>> p2) throws java.sql.SQLException {
        return wrappedObject.getArray(p0, p1, p2);
    }

    @Override
    public int getBaseType() throws java.sql.SQLException {
        return wrappedObject.getBaseType();
    }

    @Override
    public String getBaseTypeName() throws java.sql.SQLException {
        return wrappedObject.getBaseTypeName();
    }

    @Override
    public java.sql.ResultSet getResultSet() throws java.sql.SQLException {
        return wrappedObject.getResultSet();
    }

    @Override
    public java.sql.ResultSet getResultSet(final long p0, final int p1) throws java.sql.SQLException {
        return wrappedObject.getResultSet(p0, p1);
    }

    @Override
    public java.sql.ResultSet getResultSet(final java.util.Map<String, Class<?>> p0) throws java.sql.SQLException {
        return wrappedObject.getResultSet(p0);
    }

    @Override
    public java.sql.ResultSet getResultSet(final long p0, final int p1, final java.util.Map<String, Class<?>> p2) throws java.sql.SQLException {
        return wrappedObject.getResultSet(p0, p1, p2);
    }
}
