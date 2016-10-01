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
public class WrappedPreparedStatement implements java.sql.PreparedStatement {
    private final java.sql.PreparedStatement wrappedObject;

    public WrappedPreparedStatement(final java.sql.PreparedStatement wrappedObject) {
        this.wrappedObject = wrappedObject;
    }

    @Override
    public void addBatch() throws java.sql.SQLException {
        wrappedObject.addBatch();
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
    public void clearParameters() throws java.sql.SQLException {
        wrappedObject.clearParameters();
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
    public boolean execute() throws java.sql.SQLException {
        return wrappedObject.execute();
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
    public long executeLargeUpdate() throws java.sql.SQLException {
        return wrappedObject.executeLargeUpdate();
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
    public java.sql.ResultSet executeQuery() throws java.sql.SQLException {
        return wrappedObject.executeQuery();
    }

    @Override
    public java.sql.ResultSet executeQuery(final String p0) throws java.sql.SQLException {
        return wrappedObject.executeQuery(p0);
    }

    @Override
    public int executeUpdate() throws java.sql.SQLException {
        return wrappedObject.executeUpdate();
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
    public java.sql.ResultSetMetaData getMetaData() throws java.sql.SQLException {
        return wrappedObject.getMetaData();
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
    public java.sql.ParameterMetaData getParameterMetaData() throws java.sql.SQLException {
        return wrappedObject.getParameterMetaData();
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
    public void setArray(final int p0, final java.sql.Array p1) throws java.sql.SQLException {
        wrappedObject.setArray(p0, p1);
    }

    @Override
    public void setAsciiStream(final int p0, final java.io.InputStream p1) throws java.sql.SQLException {
        wrappedObject.setAsciiStream(p0, p1);
    }

    @Override
    public void setAsciiStream(final int p0, final java.io.InputStream p1, final int p2) throws java.sql.SQLException {
        wrappedObject.setAsciiStream(p0, p1, p2);
    }

    @Override
    public void setAsciiStream(final int p0, final java.io.InputStream p1, final long p2) throws java.sql.SQLException {
        wrappedObject.setAsciiStream(p0, p1, p2);
    }

    @Override
    public void setBigDecimal(final int p0, final java.math.BigDecimal p1) throws java.sql.SQLException {
        wrappedObject.setBigDecimal(p0, p1);
    }

    @Override
    public void setBinaryStream(final int p0, final java.io.InputStream p1) throws java.sql.SQLException {
        wrappedObject.setBinaryStream(p0, p1);
    }

    @Override
    public void setBinaryStream(final int p0, final java.io.InputStream p1, final int p2) throws java.sql.SQLException {
        wrappedObject.setBinaryStream(p0, p1, p2);
    }

    @Override
    public void setBinaryStream(final int p0, final java.io.InputStream p1, final long p2) throws java.sql.SQLException {
        wrappedObject.setBinaryStream(p0, p1, p2);
    }

    @Override
    public void setBlob(final int p0, final java.sql.Blob p1) throws java.sql.SQLException {
        wrappedObject.setBlob(p0, p1);
    }

    @Override
    public void setBlob(final int p0, final java.io.InputStream p1) throws java.sql.SQLException {
        wrappedObject.setBlob(p0, p1);
    }

    @Override
    public void setBlob(final int p0, final java.io.InputStream p1, final long p2) throws java.sql.SQLException {
        wrappedObject.setBlob(p0, p1, p2);
    }

    @Override
    public void setBoolean(final int p0, final boolean p1) throws java.sql.SQLException {
        wrappedObject.setBoolean(p0, p1);
    }

    @Override
    public void setByte(final int p0, final byte p1) throws java.sql.SQLException {
        wrappedObject.setByte(p0, p1);
    }

    @Override
    public void setBytes(final int p0, final byte[] p1) throws java.sql.SQLException {
        wrappedObject.setBytes(p0, p1);
    }

    @Override
    public void setCharacterStream(final int p0, final java.io.Reader p1) throws java.sql.SQLException {
        wrappedObject.setCharacterStream(p0, p1);
    }

    @Override
    public void setCharacterStream(final int p0, final java.io.Reader p1, final int p2) throws java.sql.SQLException {
        wrappedObject.setCharacterStream(p0, p1, p2);
    }

    @Override
    public void setCharacterStream(final int p0, final java.io.Reader p1, final long p2) throws java.sql.SQLException {
        wrappedObject.setCharacterStream(p0, p1, p2);
    }

    @Override
    public void setClob(final int p0, final java.sql.Clob p1) throws java.sql.SQLException {
        wrappedObject.setClob(p0, p1);
    }

    @Override
    public void setClob(final int p0, final java.io.Reader p1) throws java.sql.SQLException {
        wrappedObject.setClob(p0, p1);
    }

    @Override
    public void setClob(final int p0, final java.io.Reader p1, final long p2) throws java.sql.SQLException {
        wrappedObject.setClob(p0, p1, p2);
    }

    @Override
    public void setCursorName(final String p0) throws java.sql.SQLException {
        wrappedObject.setCursorName(p0);
    }

    @Override
    public void setDate(final int p0, final java.sql.Date p1) throws java.sql.SQLException {
        wrappedObject.setDate(p0, p1);
    }

    @Override
    public void setDate(final int p0, final java.sql.Date p1, final java.util.Calendar p2) throws java.sql.SQLException {
        wrappedObject.setDate(p0, p1, p2);
    }

    @Override
    public void setDouble(final int p0, final double p1) throws java.sql.SQLException {
        wrappedObject.setDouble(p0, p1);
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
    public void setFloat(final int p0, final float p1) throws java.sql.SQLException {
        wrappedObject.setFloat(p0, p1);
    }

    @Override
    public void setInt(final int p0, final int p1) throws java.sql.SQLException {
        wrappedObject.setInt(p0, p1);
    }

    @Override
    public void setLargeMaxRows(final long p0) throws java.sql.SQLException {
        wrappedObject.setLargeMaxRows(p0);
    }

    @Override
    public void setLong(final int p0, final long p1) throws java.sql.SQLException {
        wrappedObject.setLong(p0, p1);
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
    public void setNCharacterStream(final int p0, final java.io.Reader p1) throws java.sql.SQLException {
        wrappedObject.setNCharacterStream(p0, p1);
    }

    @Override
    public void setNCharacterStream(final int p0, final java.io.Reader p1, final long p2) throws java.sql.SQLException {
        wrappedObject.setNCharacterStream(p0, p1, p2);
    }

    @Override
    public void setNClob(final int p0, final java.io.Reader p1) throws java.sql.SQLException {
        wrappedObject.setNClob(p0, p1);
    }

    @Override
    public void setNClob(final int p0, final java.sql.NClob p1) throws java.sql.SQLException {
        wrappedObject.setNClob(p0, p1);
    }

    @Override
    public void setNClob(final int p0, final java.io.Reader p1, final long p2) throws java.sql.SQLException {
        wrappedObject.setNClob(p0, p1, p2);
    }

    @Override
    public void setNString(final int p0, final String p1) throws java.sql.SQLException {
        wrappedObject.setNString(p0, p1);
    }

    @Override
    public void setNull(final int p0, final int p1) throws java.sql.SQLException {
        wrappedObject.setNull(p0, p1);
    }

    @Override
    public void setNull(final int p0, final int p1, final String p2) throws java.sql.SQLException {
        wrappedObject.setNull(p0, p1, p2);
    }

    @Override
    public void setObject(final int p0, final Object p1) throws java.sql.SQLException {
        wrappedObject.setObject(p0, p1);
    }

    @Override
    public void setObject(final int p0, final Object p1, final int p2) throws java.sql.SQLException {
        wrappedObject.setObject(p0, p1, p2);
    }

    @Override
    public void setObject(final int p0, final Object p1, final java.sql.SQLType p2) throws java.sql.SQLException {
        wrappedObject.setObject(p0, p1, p2);
    }

    @Override
    public void setObject(final int p0, final Object p1, final int p2, final int p3) throws java.sql.SQLException {
        wrappedObject.setObject(p0, p1, p2, p3);
    }

    @Override
    public void setObject(final int p0, final Object p1, final java.sql.SQLType p2, final int p3) throws java.sql.SQLException {
        wrappedObject.setObject(p0, p1, p2, p3);
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
    public void setRef(final int p0, final java.sql.Ref p1) throws java.sql.SQLException {
        wrappedObject.setRef(p0, p1);
    }

    @Override
    public void setRowId(final int p0, final java.sql.RowId p1) throws java.sql.SQLException {
        wrappedObject.setRowId(p0, p1);
    }

    @Override
    public void setSQLXML(final int p0, final java.sql.SQLXML p1) throws java.sql.SQLException {
        wrappedObject.setSQLXML(p0, p1);
    }

    @Override
    public void setShort(final int p0, final short p1) throws java.sql.SQLException {
        wrappedObject.setShort(p0, p1);
    }

    @Override
    public void setString(final int p0, final String p1) throws java.sql.SQLException {
        wrappedObject.setString(p0, p1);
    }

    @Override
    public void setTime(final int p0, final java.sql.Time p1) throws java.sql.SQLException {
        wrappedObject.setTime(p0, p1);
    }

    @Override
    public void setTime(final int p0, final java.sql.Time p1, final java.util.Calendar p2) throws java.sql.SQLException {
        wrappedObject.setTime(p0, p1, p2);
    }

    @Override
    public void setTimestamp(final int p0, final java.sql.Timestamp p1) throws java.sql.SQLException {
        wrappedObject.setTimestamp(p0, p1);
    }

    @Override
    public void setTimestamp(final int p0, final java.sql.Timestamp p1, final java.util.Calendar p2) throws java.sql.SQLException {
        wrappedObject.setTimestamp(p0, p1, p2);
    }

    @Override
    public void setURL(final int p0, final java.net.URL p1) throws java.sql.SQLException {
        wrappedObject.setURL(p0, p1);
    }

    @Override
    @Deprecated
    public void setUnicodeStream(final int p0, final java.io.InputStream p1, final int p2) throws java.sql.SQLException {
        wrappedObject.setUnicodeStream(p0, p1, p2);
    }

    @Override
    public <T> T unwrap(final Class<T> p0) throws java.sql.SQLException {
        return wrappedObject.unwrap(p0);
    }
}
