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
public class WrappedConnection implements java.sql.Connection {
    private final java.sql.Connection wrappedObject;

    public WrappedConnection(final java.sql.Connection wrappedObject) {
        this.wrappedObject = wrappedObject;
    }

    @Override
    public void abort(final java.util.concurrent.Executor p0) throws java.sql.SQLException {
        wrappedObject.abort(p0);
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
    public void commit() throws java.sql.SQLException {
        wrappedObject.commit();
    }

    @Override
    public java.sql.Array createArrayOf(final String p0, final Object[] p1) throws java.sql.SQLException {
        return wrappedObject.createArrayOf(p0, p1);
    }

    @Override
    public java.sql.Blob createBlob() throws java.sql.SQLException {
        return wrappedObject.createBlob();
    }

    @Override
    public java.sql.Clob createClob() throws java.sql.SQLException {
        return wrappedObject.createClob();
    }

    @Override
    public java.sql.NClob createNClob() throws java.sql.SQLException {
        return wrappedObject.createNClob();
    }

    @Override
    public java.sql.SQLXML createSQLXML() throws java.sql.SQLException {
        return wrappedObject.createSQLXML();
    }

    @Override
    public java.sql.Statement createStatement() throws java.sql.SQLException {
        return wrappedObject.createStatement();
    }

    @Override
    public java.sql.Statement createStatement(final int p0, final int p1) throws java.sql.SQLException {
        return wrappedObject.createStatement(p0, p1);
    }

    @Override
    public java.sql.Statement createStatement(final int p0, final int p1, final int p2) throws java.sql.SQLException {
        return wrappedObject.createStatement(p0, p1, p2);
    }

    @Override
    public java.sql.Struct createStruct(final String p0, final Object[] p1) throws java.sql.SQLException {
        return wrappedObject.createStruct(p0, p1);
    }

    @Override
    public boolean getAutoCommit() throws java.sql.SQLException {
        return wrappedObject.getAutoCommit();
    }

    @Override
    public String getCatalog() throws java.sql.SQLException {
        return wrappedObject.getCatalog();
    }

    @Override
    public java.util.Properties getClientInfo() throws java.sql.SQLException {
        return wrappedObject.getClientInfo();
    }

    @Override
    public String getClientInfo(final String p0) throws java.sql.SQLException {
        return wrappedObject.getClientInfo(p0);
    }

    @Override
    public int getHoldability() throws java.sql.SQLException {
        return wrappedObject.getHoldability();
    }

    @Override
    public java.sql.DatabaseMetaData getMetaData() throws java.sql.SQLException {
        return wrappedObject.getMetaData();
    }

    @Override
    public int getNetworkTimeout() throws java.sql.SQLException {
        return wrappedObject.getNetworkTimeout();
    }

    @Override
    public String getSchema() throws java.sql.SQLException {
        return wrappedObject.getSchema();
    }

    @Override
    public int getTransactionIsolation() throws java.sql.SQLException {
        return wrappedObject.getTransactionIsolation();
    }

    @Override
    public java.util.Map<String, Class<?>> getTypeMap() throws java.sql.SQLException {
        return wrappedObject.getTypeMap();
    }

    @Override
    public java.sql.SQLWarning getWarnings() throws java.sql.SQLException {
        return wrappedObject.getWarnings();
    }

    @Override
    public boolean isClosed() throws java.sql.SQLException {
        return wrappedObject.isClosed();
    }

    @Override
    public boolean isReadOnly() throws java.sql.SQLException {
        return wrappedObject.isReadOnly();
    }

    @Override
    public boolean isValid(final int p0) throws java.sql.SQLException {
        return wrappedObject.isValid(p0);
    }

    @Override
    public boolean isWrapperFor(final Class<?> p0) throws java.sql.SQLException {
        return wrappedObject.isWrapperFor(p0);
    }

    @Override
    public String nativeSQL(final String p0) throws java.sql.SQLException {
        return wrappedObject.nativeSQL(p0);
    }

    @Override
    public java.sql.CallableStatement prepareCall(final String p0) throws java.sql.SQLException {
        return wrappedObject.prepareCall(p0);
    }

    @Override
    public java.sql.CallableStatement prepareCall(final String p0, final int p1, final int p2) throws java.sql.SQLException {
        return wrappedObject.prepareCall(p0, p1, p2);
    }

    @Override
    public java.sql.CallableStatement prepareCall(final String p0, final int p1, final int p2, final int p3) throws java.sql.SQLException {
        return wrappedObject.prepareCall(p0, p1, p2, p3);
    }

    @Override
    public java.sql.PreparedStatement prepareStatement(final String p0) throws java.sql.SQLException {
        return wrappedObject.prepareStatement(p0);
    }

    @Override
    public java.sql.PreparedStatement prepareStatement(final String p0, final int p1) throws java.sql.SQLException {
        return wrappedObject.prepareStatement(p0, p1);
    }

    @Override
    public java.sql.PreparedStatement prepareStatement(final String p0, final int[] p1) throws java.sql.SQLException {
        return wrappedObject.prepareStatement(p0, p1);
    }

    @Override
    public java.sql.PreparedStatement prepareStatement(final String p0, final String[] p1) throws java.sql.SQLException {
        return wrappedObject.prepareStatement(p0, p1);
    }

    @Override
    public java.sql.PreparedStatement prepareStatement(final String p0, final int p1, final int p2) throws java.sql.SQLException {
        return wrappedObject.prepareStatement(p0, p1, p2);
    }

    @Override
    public java.sql.PreparedStatement prepareStatement(final String p0, final int p1, final int p2, final int p3) throws java.sql.SQLException {
        return wrappedObject.prepareStatement(p0, p1, p2, p3);
    }

    @Override
    public void releaseSavepoint(final java.sql.Savepoint p0) throws java.sql.SQLException {
        wrappedObject.releaseSavepoint(p0);
    }

    @Override
    public void rollback() throws java.sql.SQLException {
        wrappedObject.rollback();
    }

    @Override
    public void rollback(final java.sql.Savepoint p0) throws java.sql.SQLException {
        wrappedObject.rollback(p0);
    }

    @Override
    public void setAutoCommit(final boolean p0) throws java.sql.SQLException {
        wrappedObject.setAutoCommit(p0);
    }

    @Override
    public void setCatalog(final String p0) throws java.sql.SQLException {
        wrappedObject.setCatalog(p0);
    }

    @Override
    public void setClientInfo(final java.util.Properties p0) throws java.sql.SQLClientInfoException {
        wrappedObject.setClientInfo(p0);
    }

    @Override
    public void setClientInfo(final String p0, final String p1) throws java.sql.SQLClientInfoException {
        wrappedObject.setClientInfo(p0, p1);
    }

    @Override
    public void setHoldability(final int p0) throws java.sql.SQLException {
        wrappedObject.setHoldability(p0);
    }

    @Override
    public void setNetworkTimeout(final java.util.concurrent.Executor p0, final int p1) throws java.sql.SQLException {
        wrappedObject.setNetworkTimeout(p0, p1);
    }

    @Override
    public void setReadOnly(final boolean p0) throws java.sql.SQLException {
        wrappedObject.setReadOnly(p0);
    }

    @Override
    public java.sql.Savepoint setSavepoint() throws java.sql.SQLException {
        return wrappedObject.setSavepoint();
    }

    @Override
    public java.sql.Savepoint setSavepoint(final String p0) throws java.sql.SQLException {
        return wrappedObject.setSavepoint(p0);
    }

    @Override
    public void setSchema(final String p0) throws java.sql.SQLException {
        wrappedObject.setSchema(p0);
    }

    @Override
    public void setTransactionIsolation(final int p0) throws java.sql.SQLException {
        wrappedObject.setTransactionIsolation(p0);
    }

    @Override
    public void setTypeMap(final java.util.Map<String, Class<?>> p0) throws java.sql.SQLException {
        wrappedObject.setTypeMap(p0);
    }

    @Override
    public <T> T unwrap(final Class<T> p0) throws java.sql.SQLException {
        return wrappedObject.unwrap(p0);
    }
}
