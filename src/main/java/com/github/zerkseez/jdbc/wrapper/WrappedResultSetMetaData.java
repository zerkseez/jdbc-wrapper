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
public class WrappedResultSetMetaData implements java.sql.ResultSetMetaData {
    private final java.sql.ResultSetMetaData wrappedObject;

    public WrappedResultSetMetaData(final java.sql.ResultSetMetaData wrappedObject) {
        this.wrappedObject = wrappedObject;
    }

    @Override
    public String getCatalogName(final int p0) throws java.sql.SQLException {
        return wrappedObject.getCatalogName(p0);
    }

    @Override
    public String getColumnClassName(final int p0) throws java.sql.SQLException {
        return wrappedObject.getColumnClassName(p0);
    }

    @Override
    public int getColumnCount() throws java.sql.SQLException {
        return wrappedObject.getColumnCount();
    }

    @Override
    public int getColumnDisplaySize(final int p0) throws java.sql.SQLException {
        return wrappedObject.getColumnDisplaySize(p0);
    }

    @Override
    public String getColumnLabel(final int p0) throws java.sql.SQLException {
        return wrappedObject.getColumnLabel(p0);
    }

    @Override
    public String getColumnName(final int p0) throws java.sql.SQLException {
        return wrappedObject.getColumnName(p0);
    }

    @Override
    public int getColumnType(final int p0) throws java.sql.SQLException {
        return wrappedObject.getColumnType(p0);
    }

    @Override
    public String getColumnTypeName(final int p0) throws java.sql.SQLException {
        return wrappedObject.getColumnTypeName(p0);
    }

    @Override
    public int getPrecision(final int p0) throws java.sql.SQLException {
        return wrappedObject.getPrecision(p0);
    }

    @Override
    public int getScale(final int p0) throws java.sql.SQLException {
        return wrappedObject.getScale(p0);
    }

    @Override
    public String getSchemaName(final int p0) throws java.sql.SQLException {
        return wrappedObject.getSchemaName(p0);
    }

    @Override
    public String getTableName(final int p0) throws java.sql.SQLException {
        return wrappedObject.getTableName(p0);
    }

    @Override
    public boolean isAutoIncrement(final int p0) throws java.sql.SQLException {
        return wrappedObject.isAutoIncrement(p0);
    }

    @Override
    public boolean isCaseSensitive(final int p0) throws java.sql.SQLException {
        return wrappedObject.isCaseSensitive(p0);
    }

    @Override
    public boolean isCurrency(final int p0) throws java.sql.SQLException {
        return wrappedObject.isCurrency(p0);
    }

    @Override
    public boolean isDefinitelyWritable(final int p0) throws java.sql.SQLException {
        return wrappedObject.isDefinitelyWritable(p0);
    }

    @Override
    public int isNullable(final int p0) throws java.sql.SQLException {
        return wrappedObject.isNullable(p0);
    }

    @Override
    public boolean isReadOnly(final int p0) throws java.sql.SQLException {
        return wrappedObject.isReadOnly(p0);
    }

    @Override
    public boolean isSearchable(final int p0) throws java.sql.SQLException {
        return wrappedObject.isSearchable(p0);
    }

    @Override
    public boolean isSigned(final int p0) throws java.sql.SQLException {
        return wrappedObject.isSigned(p0);
    }

    @Override
    public boolean isWrapperFor(final Class<?> p0) throws java.sql.SQLException {
        return wrappedObject.isWrapperFor(p0);
    }

    @Override
    public boolean isWritable(final int p0) throws java.sql.SQLException {
        return wrappedObject.isWritable(p0);
    }

    @Override
    public <T> T unwrap(final Class<T> p0) throws java.sql.SQLException {
        return wrappedObject.unwrap(p0);
    }
}
