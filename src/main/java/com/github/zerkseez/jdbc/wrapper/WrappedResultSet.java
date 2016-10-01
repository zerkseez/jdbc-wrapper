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
public class WrappedResultSet implements java.sql.ResultSet {
    private final java.sql.ResultSet wrappedObject;

    public WrappedResultSet(final java.sql.ResultSet wrappedObject) {
        this.wrappedObject = wrappedObject;
    }

    @Override
    public boolean absolute(final int p0) throws java.sql.SQLException {
        return wrappedObject.absolute(p0);
    }

    @Override
    public void afterLast() throws java.sql.SQLException {
        wrappedObject.afterLast();
    }

    @Override
    public void beforeFirst() throws java.sql.SQLException {
        wrappedObject.beforeFirst();
    }

    @Override
    public void cancelRowUpdates() throws java.sql.SQLException {
        wrappedObject.cancelRowUpdates();
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
    public void deleteRow() throws java.sql.SQLException {
        wrappedObject.deleteRow();
    }

    @Override
    public int findColumn(final String p0) throws java.sql.SQLException {
        return wrappedObject.findColumn(p0);
    }

    @Override
    public boolean first() throws java.sql.SQLException {
        return wrappedObject.first();
    }

    @Override
    public java.sql.Array getArray(final int p0) throws java.sql.SQLException {
        return wrappedObject.getArray(p0);
    }

    @Override
    public java.sql.Array getArray(final String p0) throws java.sql.SQLException {
        return wrappedObject.getArray(p0);
    }

    @Override
    public java.io.InputStream getAsciiStream(final int p0) throws java.sql.SQLException {
        return wrappedObject.getAsciiStream(p0);
    }

    @Override
    public java.io.InputStream getAsciiStream(final String p0) throws java.sql.SQLException {
        return wrappedObject.getAsciiStream(p0);
    }

    @Override
    public java.math.BigDecimal getBigDecimal(final int p0) throws java.sql.SQLException {
        return wrappedObject.getBigDecimal(p0);
    }

    @Override
    public java.math.BigDecimal getBigDecimal(final String p0) throws java.sql.SQLException {
        return wrappedObject.getBigDecimal(p0);
    }

    @Override
    @Deprecated
    public java.math.BigDecimal getBigDecimal(final int p0, final int p1) throws java.sql.SQLException {
        return wrappedObject.getBigDecimal(p0, p1);
    }

    @Override
    @Deprecated
    public java.math.BigDecimal getBigDecimal(final String p0, final int p1) throws java.sql.SQLException {
        return wrappedObject.getBigDecimal(p0, p1);
    }

    @Override
    public java.io.InputStream getBinaryStream(final int p0) throws java.sql.SQLException {
        return wrappedObject.getBinaryStream(p0);
    }

    @Override
    public java.io.InputStream getBinaryStream(final String p0) throws java.sql.SQLException {
        return wrappedObject.getBinaryStream(p0);
    }

    @Override
    public java.sql.Blob getBlob(final int p0) throws java.sql.SQLException {
        return wrappedObject.getBlob(p0);
    }

    @Override
    public java.sql.Blob getBlob(final String p0) throws java.sql.SQLException {
        return wrappedObject.getBlob(p0);
    }

    @Override
    public boolean getBoolean(final int p0) throws java.sql.SQLException {
        return wrappedObject.getBoolean(p0);
    }

    @Override
    public boolean getBoolean(final String p0) throws java.sql.SQLException {
        return wrappedObject.getBoolean(p0);
    }

    @Override
    public byte getByte(final int p0) throws java.sql.SQLException {
        return wrappedObject.getByte(p0);
    }

    @Override
    public byte getByte(final String p0) throws java.sql.SQLException {
        return wrappedObject.getByte(p0);
    }

    @Override
    public byte[] getBytes(final int p0) throws java.sql.SQLException {
        return wrappedObject.getBytes(p0);
    }

    @Override
    public byte[] getBytes(final String p0) throws java.sql.SQLException {
        return wrappedObject.getBytes(p0);
    }

    @Override
    public java.io.Reader getCharacterStream(final int p0) throws java.sql.SQLException {
        return wrappedObject.getCharacterStream(p0);
    }

    @Override
    public java.io.Reader getCharacterStream(final String p0) throws java.sql.SQLException {
        return wrappedObject.getCharacterStream(p0);
    }

    @Override
    public java.sql.Clob getClob(final int p0) throws java.sql.SQLException {
        return wrappedObject.getClob(p0);
    }

    @Override
    public java.sql.Clob getClob(final String p0) throws java.sql.SQLException {
        return wrappedObject.getClob(p0);
    }

    @Override
    public int getConcurrency() throws java.sql.SQLException {
        return wrappedObject.getConcurrency();
    }

    @Override
    public String getCursorName() throws java.sql.SQLException {
        return wrappedObject.getCursorName();
    }

    @Override
    public java.sql.Date getDate(final int p0) throws java.sql.SQLException {
        return wrappedObject.getDate(p0);
    }

    @Override
    public java.sql.Date getDate(final String p0) throws java.sql.SQLException {
        return wrappedObject.getDate(p0);
    }

    @Override
    public java.sql.Date getDate(final int p0, final java.util.Calendar p1) throws java.sql.SQLException {
        return wrappedObject.getDate(p0, p1);
    }

    @Override
    public java.sql.Date getDate(final String p0, final java.util.Calendar p1) throws java.sql.SQLException {
        return wrappedObject.getDate(p0, p1);
    }

    @Override
    public double getDouble(final int p0) throws java.sql.SQLException {
        return wrappedObject.getDouble(p0);
    }

    @Override
    public double getDouble(final String p0) throws java.sql.SQLException {
        return wrappedObject.getDouble(p0);
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
    public float getFloat(final int p0) throws java.sql.SQLException {
        return wrappedObject.getFloat(p0);
    }

    @Override
    public float getFloat(final String p0) throws java.sql.SQLException {
        return wrappedObject.getFloat(p0);
    }

    @Override
    public int getHoldability() throws java.sql.SQLException {
        return wrappedObject.getHoldability();
    }

    @Override
    public int getInt(final int p0) throws java.sql.SQLException {
        return wrappedObject.getInt(p0);
    }

    @Override
    public int getInt(final String p0) throws java.sql.SQLException {
        return wrappedObject.getInt(p0);
    }

    @Override
    public long getLong(final int p0) throws java.sql.SQLException {
        return wrappedObject.getLong(p0);
    }

    @Override
    public long getLong(final String p0) throws java.sql.SQLException {
        return wrappedObject.getLong(p0);
    }

    @Override
    public java.sql.ResultSetMetaData getMetaData() throws java.sql.SQLException {
        return wrappedObject.getMetaData();
    }

    @Override
    public java.io.Reader getNCharacterStream(final int p0) throws java.sql.SQLException {
        return wrappedObject.getNCharacterStream(p0);
    }

    @Override
    public java.io.Reader getNCharacterStream(final String p0) throws java.sql.SQLException {
        return wrappedObject.getNCharacterStream(p0);
    }

    @Override
    public java.sql.NClob getNClob(final int p0) throws java.sql.SQLException {
        return wrappedObject.getNClob(p0);
    }

    @Override
    public java.sql.NClob getNClob(final String p0) throws java.sql.SQLException {
        return wrappedObject.getNClob(p0);
    }

    @Override
    public String getNString(final int p0) throws java.sql.SQLException {
        return wrappedObject.getNString(p0);
    }

    @Override
    public String getNString(final String p0) throws java.sql.SQLException {
        return wrappedObject.getNString(p0);
    }

    @Override
    public Object getObject(final int p0) throws java.sql.SQLException {
        return wrappedObject.getObject(p0);
    }

    @Override
    public Object getObject(final String p0) throws java.sql.SQLException {
        return wrappedObject.getObject(p0);
    }

    @Override
    public <T> T getObject(final int p0, final Class<T> p1) throws java.sql.SQLException {
        return wrappedObject.getObject(p0, p1);
    }

    @Override
    public <T> T getObject(final String p0, final Class<T> p1) throws java.sql.SQLException {
        return wrappedObject.getObject(p0, p1);
    }

    @Override
    public Object getObject(final int p0, final java.util.Map<String, Class<?>> p1) throws java.sql.SQLException {
        return wrappedObject.getObject(p0, p1);
    }

    @Override
    public Object getObject(final String p0, final java.util.Map<String, Class<?>> p1) throws java.sql.SQLException {
        return wrappedObject.getObject(p0, p1);
    }

    @Override
    public java.sql.Ref getRef(final int p0) throws java.sql.SQLException {
        return wrappedObject.getRef(p0);
    }

    @Override
    public java.sql.Ref getRef(final String p0) throws java.sql.SQLException {
        return wrappedObject.getRef(p0);
    }

    @Override
    public int getRow() throws java.sql.SQLException {
        return wrappedObject.getRow();
    }

    @Override
    public java.sql.RowId getRowId(final int p0) throws java.sql.SQLException {
        return wrappedObject.getRowId(p0);
    }

    @Override
    public java.sql.RowId getRowId(final String p0) throws java.sql.SQLException {
        return wrappedObject.getRowId(p0);
    }

    @Override
    public java.sql.SQLXML getSQLXML(final int p0) throws java.sql.SQLException {
        return wrappedObject.getSQLXML(p0);
    }

    @Override
    public java.sql.SQLXML getSQLXML(final String p0) throws java.sql.SQLException {
        return wrappedObject.getSQLXML(p0);
    }

    @Override
    public short getShort(final int p0) throws java.sql.SQLException {
        return wrappedObject.getShort(p0);
    }

    @Override
    public short getShort(final String p0) throws java.sql.SQLException {
        return wrappedObject.getShort(p0);
    }

    @Override
    public java.sql.Statement getStatement() throws java.sql.SQLException {
        return wrappedObject.getStatement();
    }

    @Override
    public String getString(final int p0) throws java.sql.SQLException {
        return wrappedObject.getString(p0);
    }

    @Override
    public String getString(final String p0) throws java.sql.SQLException {
        return wrappedObject.getString(p0);
    }

    @Override
    public java.sql.Time getTime(final int p0) throws java.sql.SQLException {
        return wrappedObject.getTime(p0);
    }

    @Override
    public java.sql.Time getTime(final String p0) throws java.sql.SQLException {
        return wrappedObject.getTime(p0);
    }

    @Override
    public java.sql.Time getTime(final int p0, final java.util.Calendar p1) throws java.sql.SQLException {
        return wrappedObject.getTime(p0, p1);
    }

    @Override
    public java.sql.Time getTime(final String p0, final java.util.Calendar p1) throws java.sql.SQLException {
        return wrappedObject.getTime(p0, p1);
    }

    @Override
    public java.sql.Timestamp getTimestamp(final int p0) throws java.sql.SQLException {
        return wrappedObject.getTimestamp(p0);
    }

    @Override
    public java.sql.Timestamp getTimestamp(final String p0) throws java.sql.SQLException {
        return wrappedObject.getTimestamp(p0);
    }

    @Override
    public java.sql.Timestamp getTimestamp(final int p0, final java.util.Calendar p1) throws java.sql.SQLException {
        return wrappedObject.getTimestamp(p0, p1);
    }

    @Override
    public java.sql.Timestamp getTimestamp(final String p0, final java.util.Calendar p1) throws java.sql.SQLException {
        return wrappedObject.getTimestamp(p0, p1);
    }

    @Override
    public int getType() throws java.sql.SQLException {
        return wrappedObject.getType();
    }

    @Override
    public java.net.URL getURL(final int p0) throws java.sql.SQLException {
        return wrappedObject.getURL(p0);
    }

    @Override
    public java.net.URL getURL(final String p0) throws java.sql.SQLException {
        return wrappedObject.getURL(p0);
    }

    @Override
    @Deprecated
    public java.io.InputStream getUnicodeStream(final int p0) throws java.sql.SQLException {
        return wrappedObject.getUnicodeStream(p0);
    }

    @Override
    @Deprecated
    public java.io.InputStream getUnicodeStream(final String p0) throws java.sql.SQLException {
        return wrappedObject.getUnicodeStream(p0);
    }

    @Override
    public java.sql.SQLWarning getWarnings() throws java.sql.SQLException {
        return wrappedObject.getWarnings();
    }

    @Override
    public void insertRow() throws java.sql.SQLException {
        wrappedObject.insertRow();
    }

    @Override
    public boolean isAfterLast() throws java.sql.SQLException {
        return wrappedObject.isAfterLast();
    }

    @Override
    public boolean isBeforeFirst() throws java.sql.SQLException {
        return wrappedObject.isBeforeFirst();
    }

    @Override
    public boolean isClosed() throws java.sql.SQLException {
        return wrappedObject.isClosed();
    }

    @Override
    public boolean isFirst() throws java.sql.SQLException {
        return wrappedObject.isFirst();
    }

    @Override
    public boolean isLast() throws java.sql.SQLException {
        return wrappedObject.isLast();
    }

    @Override
    public boolean isWrapperFor(final Class<?> p0) throws java.sql.SQLException {
        return wrappedObject.isWrapperFor(p0);
    }

    @Override
    public boolean last() throws java.sql.SQLException {
        return wrappedObject.last();
    }

    @Override
    public void moveToCurrentRow() throws java.sql.SQLException {
        wrappedObject.moveToCurrentRow();
    }

    @Override
    public void moveToInsertRow() throws java.sql.SQLException {
        wrappedObject.moveToInsertRow();
    }

    @Override
    public boolean next() throws java.sql.SQLException {
        return wrappedObject.next();
    }

    @Override
    public boolean previous() throws java.sql.SQLException {
        return wrappedObject.previous();
    }

    @Override
    public void refreshRow() throws java.sql.SQLException {
        wrappedObject.refreshRow();
    }

    @Override
    public boolean relative(final int p0) throws java.sql.SQLException {
        return wrappedObject.relative(p0);
    }

    @Override
    public boolean rowDeleted() throws java.sql.SQLException {
        return wrappedObject.rowDeleted();
    }

    @Override
    public boolean rowInserted() throws java.sql.SQLException {
        return wrappedObject.rowInserted();
    }

    @Override
    public boolean rowUpdated() throws java.sql.SQLException {
        return wrappedObject.rowUpdated();
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
    public <T> T unwrap(final Class<T> p0) throws java.sql.SQLException {
        return wrappedObject.unwrap(p0);
    }

    @Override
    public void updateArray(final int p0, final java.sql.Array p1) throws java.sql.SQLException {
        wrappedObject.updateArray(p0, p1);
    }

    @Override
    public void updateArray(final String p0, final java.sql.Array p1) throws java.sql.SQLException {
        wrappedObject.updateArray(p0, p1);
    }

    @Override
    public void updateAsciiStream(final int p0, final java.io.InputStream p1) throws java.sql.SQLException {
        wrappedObject.updateAsciiStream(p0, p1);
    }

    @Override
    public void updateAsciiStream(final String p0, final java.io.InputStream p1) throws java.sql.SQLException {
        wrappedObject.updateAsciiStream(p0, p1);
    }

    @Override
    public void updateAsciiStream(final int p0, final java.io.InputStream p1, final int p2) throws java.sql.SQLException {
        wrappedObject.updateAsciiStream(p0, p1, p2);
    }

    @Override
    public void updateAsciiStream(final int p0, final java.io.InputStream p1, final long p2) throws java.sql.SQLException {
        wrappedObject.updateAsciiStream(p0, p1, p2);
    }

    @Override
    public void updateAsciiStream(final String p0, final java.io.InputStream p1, final int p2) throws java.sql.SQLException {
        wrappedObject.updateAsciiStream(p0, p1, p2);
    }

    @Override
    public void updateAsciiStream(final String p0, final java.io.InputStream p1, final long p2) throws java.sql.SQLException {
        wrappedObject.updateAsciiStream(p0, p1, p2);
    }

    @Override
    public void updateBigDecimal(final int p0, final java.math.BigDecimal p1) throws java.sql.SQLException {
        wrappedObject.updateBigDecimal(p0, p1);
    }

    @Override
    public void updateBigDecimal(final String p0, final java.math.BigDecimal p1) throws java.sql.SQLException {
        wrappedObject.updateBigDecimal(p0, p1);
    }

    @Override
    public void updateBinaryStream(final int p0, final java.io.InputStream p1) throws java.sql.SQLException {
        wrappedObject.updateBinaryStream(p0, p1);
    }

    @Override
    public void updateBinaryStream(final String p0, final java.io.InputStream p1) throws java.sql.SQLException {
        wrappedObject.updateBinaryStream(p0, p1);
    }

    @Override
    public void updateBinaryStream(final int p0, final java.io.InputStream p1, final int p2) throws java.sql.SQLException {
        wrappedObject.updateBinaryStream(p0, p1, p2);
    }

    @Override
    public void updateBinaryStream(final int p0, final java.io.InputStream p1, final long p2) throws java.sql.SQLException {
        wrappedObject.updateBinaryStream(p0, p1, p2);
    }

    @Override
    public void updateBinaryStream(final String p0, final java.io.InputStream p1, final int p2) throws java.sql.SQLException {
        wrappedObject.updateBinaryStream(p0, p1, p2);
    }

    @Override
    public void updateBinaryStream(final String p0, final java.io.InputStream p1, final long p2) throws java.sql.SQLException {
        wrappedObject.updateBinaryStream(p0, p1, p2);
    }

    @Override
    public void updateBlob(final int p0, final java.sql.Blob p1) throws java.sql.SQLException {
        wrappedObject.updateBlob(p0, p1);
    }

    @Override
    public void updateBlob(final String p0, final java.sql.Blob p1) throws java.sql.SQLException {
        wrappedObject.updateBlob(p0, p1);
    }

    @Override
    public void updateBlob(final int p0, final java.io.InputStream p1) throws java.sql.SQLException {
        wrappedObject.updateBlob(p0, p1);
    }

    @Override
    public void updateBlob(final String p0, final java.io.InputStream p1) throws java.sql.SQLException {
        wrappedObject.updateBlob(p0, p1);
    }

    @Override
    public void updateBlob(final int p0, final java.io.InputStream p1, final long p2) throws java.sql.SQLException {
        wrappedObject.updateBlob(p0, p1, p2);
    }

    @Override
    public void updateBlob(final String p0, final java.io.InputStream p1, final long p2) throws java.sql.SQLException {
        wrappedObject.updateBlob(p0, p1, p2);
    }

    @Override
    public void updateBoolean(final int p0, final boolean p1) throws java.sql.SQLException {
        wrappedObject.updateBoolean(p0, p1);
    }

    @Override
    public void updateBoolean(final String p0, final boolean p1) throws java.sql.SQLException {
        wrappedObject.updateBoolean(p0, p1);
    }

    @Override
    public void updateByte(final int p0, final byte p1) throws java.sql.SQLException {
        wrappedObject.updateByte(p0, p1);
    }

    @Override
    public void updateByte(final String p0, final byte p1) throws java.sql.SQLException {
        wrappedObject.updateByte(p0, p1);
    }

    @Override
    public void updateBytes(final int p0, final byte[] p1) throws java.sql.SQLException {
        wrappedObject.updateBytes(p0, p1);
    }

    @Override
    public void updateBytes(final String p0, final byte[] p1) throws java.sql.SQLException {
        wrappedObject.updateBytes(p0, p1);
    }

    @Override
    public void updateCharacterStream(final int p0, final java.io.Reader p1) throws java.sql.SQLException {
        wrappedObject.updateCharacterStream(p0, p1);
    }

    @Override
    public void updateCharacterStream(final String p0, final java.io.Reader p1) throws java.sql.SQLException {
        wrappedObject.updateCharacterStream(p0, p1);
    }

    @Override
    public void updateCharacterStream(final int p0, final java.io.Reader p1, final int p2) throws java.sql.SQLException {
        wrappedObject.updateCharacterStream(p0, p1, p2);
    }

    @Override
    public void updateCharacterStream(final int p0, final java.io.Reader p1, final long p2) throws java.sql.SQLException {
        wrappedObject.updateCharacterStream(p0, p1, p2);
    }

    @Override
    public void updateCharacterStream(final String p0, final java.io.Reader p1, final int p2) throws java.sql.SQLException {
        wrappedObject.updateCharacterStream(p0, p1, p2);
    }

    @Override
    public void updateCharacterStream(final String p0, final java.io.Reader p1, final long p2) throws java.sql.SQLException {
        wrappedObject.updateCharacterStream(p0, p1, p2);
    }

    @Override
    public void updateClob(final int p0, final java.sql.Clob p1) throws java.sql.SQLException {
        wrappedObject.updateClob(p0, p1);
    }

    @Override
    public void updateClob(final int p0, final java.io.Reader p1) throws java.sql.SQLException {
        wrappedObject.updateClob(p0, p1);
    }

    @Override
    public void updateClob(final String p0, final java.sql.Clob p1) throws java.sql.SQLException {
        wrappedObject.updateClob(p0, p1);
    }

    @Override
    public void updateClob(final String p0, final java.io.Reader p1) throws java.sql.SQLException {
        wrappedObject.updateClob(p0, p1);
    }

    @Override
    public void updateClob(final int p0, final java.io.Reader p1, final long p2) throws java.sql.SQLException {
        wrappedObject.updateClob(p0, p1, p2);
    }

    @Override
    public void updateClob(final String p0, final java.io.Reader p1, final long p2) throws java.sql.SQLException {
        wrappedObject.updateClob(p0, p1, p2);
    }

    @Override
    public void updateDate(final int p0, final java.sql.Date p1) throws java.sql.SQLException {
        wrappedObject.updateDate(p0, p1);
    }

    @Override
    public void updateDate(final String p0, final java.sql.Date p1) throws java.sql.SQLException {
        wrappedObject.updateDate(p0, p1);
    }

    @Override
    public void updateDouble(final int p0, final double p1) throws java.sql.SQLException {
        wrappedObject.updateDouble(p0, p1);
    }

    @Override
    public void updateDouble(final String p0, final double p1) throws java.sql.SQLException {
        wrappedObject.updateDouble(p0, p1);
    }

    @Override
    public void updateFloat(final int p0, final float p1) throws java.sql.SQLException {
        wrappedObject.updateFloat(p0, p1);
    }

    @Override
    public void updateFloat(final String p0, final float p1) throws java.sql.SQLException {
        wrappedObject.updateFloat(p0, p1);
    }

    @Override
    public void updateInt(final int p0, final int p1) throws java.sql.SQLException {
        wrappedObject.updateInt(p0, p1);
    }

    @Override
    public void updateInt(final String p0, final int p1) throws java.sql.SQLException {
        wrappedObject.updateInt(p0, p1);
    }

    @Override
    public void updateLong(final int p0, final long p1) throws java.sql.SQLException {
        wrappedObject.updateLong(p0, p1);
    }

    @Override
    public void updateLong(final String p0, final long p1) throws java.sql.SQLException {
        wrappedObject.updateLong(p0, p1);
    }

    @Override
    public void updateNCharacterStream(final int p0, final java.io.Reader p1) throws java.sql.SQLException {
        wrappedObject.updateNCharacterStream(p0, p1);
    }

    @Override
    public void updateNCharacterStream(final String p0, final java.io.Reader p1) throws java.sql.SQLException {
        wrappedObject.updateNCharacterStream(p0, p1);
    }

    @Override
    public void updateNCharacterStream(final int p0, final java.io.Reader p1, final long p2) throws java.sql.SQLException {
        wrappedObject.updateNCharacterStream(p0, p1, p2);
    }

    @Override
    public void updateNCharacterStream(final String p0, final java.io.Reader p1, final long p2) throws java.sql.SQLException {
        wrappedObject.updateNCharacterStream(p0, p1, p2);
    }

    @Override
    public void updateNClob(final int p0, final java.io.Reader p1) throws java.sql.SQLException {
        wrappedObject.updateNClob(p0, p1);
    }

    @Override
    public void updateNClob(final int p0, final java.sql.NClob p1) throws java.sql.SQLException {
        wrappedObject.updateNClob(p0, p1);
    }

    @Override
    public void updateNClob(final String p0, final java.io.Reader p1) throws java.sql.SQLException {
        wrappedObject.updateNClob(p0, p1);
    }

    @Override
    public void updateNClob(final String p0, final java.sql.NClob p1) throws java.sql.SQLException {
        wrappedObject.updateNClob(p0, p1);
    }

    @Override
    public void updateNClob(final int p0, final java.io.Reader p1, final long p2) throws java.sql.SQLException {
        wrappedObject.updateNClob(p0, p1, p2);
    }

    @Override
    public void updateNClob(final String p0, final java.io.Reader p1, final long p2) throws java.sql.SQLException {
        wrappedObject.updateNClob(p0, p1, p2);
    }

    @Override
    public void updateNString(final int p0, final String p1) throws java.sql.SQLException {
        wrappedObject.updateNString(p0, p1);
    }

    @Override
    public void updateNString(final String p0, final String p1) throws java.sql.SQLException {
        wrappedObject.updateNString(p0, p1);
    }

    @Override
    public void updateNull(final int p0) throws java.sql.SQLException {
        wrappedObject.updateNull(p0);
    }

    @Override
    public void updateNull(final String p0) throws java.sql.SQLException {
        wrappedObject.updateNull(p0);
    }

    @Override
    public void updateObject(final int p0, final Object p1) throws java.sql.SQLException {
        wrappedObject.updateObject(p0, p1);
    }

    @Override
    public void updateObject(final String p0, final Object p1) throws java.sql.SQLException {
        wrappedObject.updateObject(p0, p1);
    }

    @Override
    public void updateObject(final int p0, final Object p1, final int p2) throws java.sql.SQLException {
        wrappedObject.updateObject(p0, p1, p2);
    }

    @Override
    public void updateObject(final String p0, final Object p1, final int p2) throws java.sql.SQLException {
        wrappedObject.updateObject(p0, p1, p2);
    }

    @Override
    public void updateObject(final int p0, final Object p1, final java.sql.SQLType p2) throws java.sql.SQLException {
        wrappedObject.updateObject(p0, p1, p2);
    }

    @Override
    public void updateObject(final String p0, final Object p1, final java.sql.SQLType p2) throws java.sql.SQLException {
        wrappedObject.updateObject(p0, p1, p2);
    }

    @Override
    public void updateObject(final int p0, final Object p1, final java.sql.SQLType p2, final int p3) throws java.sql.SQLException {
        wrappedObject.updateObject(p0, p1, p2, p3);
    }

    @Override
    public void updateObject(final String p0, final Object p1, final java.sql.SQLType p2, final int p3) throws java.sql.SQLException {
        wrappedObject.updateObject(p0, p1, p2, p3);
    }

    @Override
    public void updateRef(final int p0, final java.sql.Ref p1) throws java.sql.SQLException {
        wrappedObject.updateRef(p0, p1);
    }

    @Override
    public void updateRef(final String p0, final java.sql.Ref p1) throws java.sql.SQLException {
        wrappedObject.updateRef(p0, p1);
    }

    @Override
    public void updateRow() throws java.sql.SQLException {
        wrappedObject.updateRow();
    }

    @Override
    public void updateRowId(final int p0, final java.sql.RowId p1) throws java.sql.SQLException {
        wrappedObject.updateRowId(p0, p1);
    }

    @Override
    public void updateRowId(final String p0, final java.sql.RowId p1) throws java.sql.SQLException {
        wrappedObject.updateRowId(p0, p1);
    }

    @Override
    public void updateSQLXML(final int p0, final java.sql.SQLXML p1) throws java.sql.SQLException {
        wrappedObject.updateSQLXML(p0, p1);
    }

    @Override
    public void updateSQLXML(final String p0, final java.sql.SQLXML p1) throws java.sql.SQLException {
        wrappedObject.updateSQLXML(p0, p1);
    }

    @Override
    public void updateShort(final int p0, final short p1) throws java.sql.SQLException {
        wrappedObject.updateShort(p0, p1);
    }

    @Override
    public void updateShort(final String p0, final short p1) throws java.sql.SQLException {
        wrappedObject.updateShort(p0, p1);
    }

    @Override
    public void updateString(final int p0, final String p1) throws java.sql.SQLException {
        wrappedObject.updateString(p0, p1);
    }

    @Override
    public void updateString(final String p0, final String p1) throws java.sql.SQLException {
        wrappedObject.updateString(p0, p1);
    }

    @Override
    public void updateTime(final int p0, final java.sql.Time p1) throws java.sql.SQLException {
        wrappedObject.updateTime(p0, p1);
    }

    @Override
    public void updateTime(final String p0, final java.sql.Time p1) throws java.sql.SQLException {
        wrappedObject.updateTime(p0, p1);
    }

    @Override
    public void updateTimestamp(final int p0, final java.sql.Timestamp p1) throws java.sql.SQLException {
        wrappedObject.updateTimestamp(p0, p1);
    }

    @Override
    public void updateTimestamp(final String p0, final java.sql.Timestamp p1) throws java.sql.SQLException {
        wrappedObject.updateTimestamp(p0, p1);
    }

    @Override
    public boolean wasNull() throws java.sql.SQLException {
        return wrappedObject.wasNull();
    }
}
