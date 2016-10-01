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
public class WrappedStatement implements java.sql.Statement {
    private final java.sql.Statement wrappedObject;

    public WrappedStatement(final java.sql.Statement wrappedObject) {
        this.wrappedObject = wrappedObject;
    }

    @Override
    public void addBatch(final String p0) throws java.sql.SQLException {
        wrappedObject.addBatch(p0);
    }

    @Override
    public void cancel() throws java.sql.SQLException {
        wrappedObject.cancel();
    }

    @Override
    public void clearBatch() throws java.sql.SQLException {
        wrappedObject.clearBatch();
    }

    @Override
    public void clearWarnings() throws java.sql.SQLException {
        wrappedObject.clearWarnings();
    }

    @Override
    public void close() throws java.sql.SQLException {
        wrappedObject.close();
    }

    @Override
    public void closeOnCompletion() throws java.sql.SQLException {
        wrappedObject.closeOnCompletion();
    }

    @Override
    public boolean execute(final String p0) throws java.sql.SQLException {
        return wrappedObject.execute(p0);
    }

    @Override
    public boolean execute(final String p0, final int p1) throws java.sql.SQLException {
        return wrappedObject.execute(p0, p1);
    }

    @Override
    public boolean execute(final String p0, final int[] p1) throws java.sql.SQLException {
        return wrappedObject.execute(p0, p1);
    }

    @Override
    public boolean execute(final String p0, final String[] p1) throws java.sql.SQLException {
        return wrappedObject.execute(p0, p1);
    }

    @Override
    public int[] executeBatch() throws java.sql.SQLException {
        return wrappedObject.executeBatch();
    }

    @Override
    public long[] executeLargeBatch() throws java.sql.SQLException {
        return wrappedObject.executeLargeBatch();
    }

    @Override
    public long executeLargeUpdate(final String p0) throws java.sql.SQLException {
        return wrappedObject.executeLargeUpdate(p0);
    }

    @Override
    public long executeLargeUpdate(final String p0, final int p1) throws java.sql.SQLException {
        return wrappedObject.executeLargeUpdate(p0, p1);
    }

    @Override
    public long executeLargeUpdate(final String p0, final int[] p1) throws java.sql.SQLException {
        return wrappedObject.executeLargeUpdate(p0, p1);
    }

    @Override
    public long executeLargeUpdate(final String p0, final String[] p1) throws java.sql.SQLException {
        return wrappedObject.executeLargeUpdate(p0, p1);
    }

    @Override
    public java.sql.ResultSet executeQuery(final String p0) throws java.sql.SQLException {
        return wrappedObject.executeQuery(p0);
    }

    @Override
    public int executeUpdate(final String p0) throws java.sql.SQLException {
        return wrappedObject.executeUpdate(p0);
    }

    @Override
    public int executeUpdate(final String p0, final int p1) throws java.sql.SQLException {
        return wrappedObject.executeUpdate(p0, p1);
    }

    @Override
    public int executeUpdate(final String p0, final int[] p1) throws java.sql.SQLException {
        return wrappedObject.executeUpdate(p0, p1);
    }

    @Override
    public int executeUpdate(final String p0, final String[] p1) throws java.sql.SQLException {
        return wrappedObject.executeUpdate(p0, p1);
    }

    @Override
    public java.sql.Connection getConnection() throws java.sql.SQLException {
        return wrappedObject.getConnection();
    }

    @Override
    public int getFetchDirection() throws java.sql.SQLException {
        return wrappedObject.getFetchDirection();
    }

    @Override
    public int getFetchSize() throws java.sql.SQLException {
        return wrappedObject.getFetchSize();
    }

    @Override
    public java.sql.ResultSet getGeneratedKeys() throws java.sql.SQLException {
        return wrappedObject.getGeneratedKeys();
    }

    @Override
    public long getLargeMaxRows() throws java.sql.SQLException {
        return wrappedObject.getLargeMaxRows();
    }

    @Override
    public long getLargeUpdateCount() throws java.sql.SQLException {
        return wrappedObject.getLargeUpdateCount();
    }

    @Override
    public int getMaxFieldSize() throws java.sql.SQLException {
        return wrappedObject.getMaxFieldSize();
    }

    @Override
    public int getMaxRows() throws java.sql.SQLException {
        return wrappedObject.getMaxRows();
    }

    @Override
    public boolean getMoreResults() throws java.sql.SQLException {
        return wrappedObject.getMoreResults();
    }

    @Override
    public boolean getMoreResults(final int p0) throws java.sql.SQLException {
        return wrappedObject.getMoreResults(p0);
    }

    @Override
    public int getQueryTimeout() throws java.sql.SQLException {
        return wrappedObject.getQueryTimeout();
    }

    @Override
    public java.sql.ResultSet getResultSet() throws java.sql.SQLException {
        return wrappedObject.getResultSet();
    }

    @Override
    public int getResultSetConcurrency() throws java.sql.SQLException {
        return wrappedObject.getResultSetConcurrency();
    }

    @Override
    public int getResultSetHoldability() throws java.sql.SQLException {
        return wrappedObject.getResultSetHoldability();
    }

    @Override
    public int getResultSetType() throws java.sql.SQLException {
        return wrappedObject.getResultSetType();
    }

    @Override
    public int getUpdateCount() throws java.sql.SQLException {
        return wrappedObject.getUpdateCount();
    }

    @Override
    public java.sql.SQLWarning getWarnings() throws java.sql.SQLException {
        return wrappedObject.getWarnings();
    }

    @Override
    public boolean isCloseOnCompletion() throws java.sql.SQLException {
        return wrappedObject.isCloseOnCompletion();
    }

    @Override
    public boolean isClosed() throws java.sql.SQLException {
        return wrappedObject.isClosed();
    }

    @Override
    public boolean isPoolable() throws java.sql.SQLException {
        return wrappedObject.isPoolable();
    }

    @Override
    public boolean isWrapperFor(final Class<?> p0) throws java.sql.SQLException {
        return wrappedObject.isWrapperFor(p0);
    }

    @Override
    public void setCursorName(final String p0) throws java.sql.SQLException {
        wrappedObject.setCursorName(p0);
    }

    @Override
    public void setEscapeProcessing(final boolean p0) throws java.sql.SQLException {
        wrappedObject.setEscapeProcessing(p0);
    }

    @Override
    public void setFetchDirection(final int p0) throws java.sql.SQLException {
        wrappedObject.setFetchDirection(p0);
    }

    @Override
    public void setFetchSize(final int p0) throws java.sql.SQLException {
        wrappedObject.setFetchSize(p0);
    }

    @Override
    public void setLargeMaxRows(final long p0) throws java.sql.SQLException {
        wrappedObject.setLargeMaxRows(p0);
    }

    @Override
    public void setMaxFieldSize(final int p0) throws java.sql.SQLException {
        wrappedObject.setMaxFieldSize(p0);
    }

    @Override
    public void setMaxRows(final int p0) throws java.sql.SQLException {
        wrappedObject.setMaxRows(p0);
    }

    @Override
    public void setPoolable(final boolean p0) throws java.sql.SQLException {
        wrappedObject.setPoolable(p0);
    }

    @Override
    public void setQueryTimeout(final int p0) throws java.sql.SQLException {
        wrappedObject.setQueryTimeout(p0);
    }

    @Override
    public <T> T unwrap(final Class<T> p0) throws java.sql.SQLException {
        return wrappedObject.unwrap(p0);
    }
}
