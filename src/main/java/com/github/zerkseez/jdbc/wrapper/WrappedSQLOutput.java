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
public class WrappedSQLOutput implements java.sql.SQLOutput {
    private final java.sql.SQLOutput wrappedObject;

    public WrappedSQLOutput(final java.sql.SQLOutput wrappedObject) {
        this.wrappedObject = wrappedObject;
    }

    @Override
    public void writeArray(final java.sql.Array p0) throws java.sql.SQLException {
        wrappedObject.writeArray(p0);
    }

    @Override
    public void writeAsciiStream(final java.io.InputStream p0) throws java.sql.SQLException {
        wrappedObject.writeAsciiStream(p0);
    }

    @Override
    public void writeBigDecimal(final java.math.BigDecimal p0) throws java.sql.SQLException {
        wrappedObject.writeBigDecimal(p0);
    }

    @Override
    public void writeBinaryStream(final java.io.InputStream p0) throws java.sql.SQLException {
        wrappedObject.writeBinaryStream(p0);
    }

    @Override
    public void writeBlob(final java.sql.Blob p0) throws java.sql.SQLException {
        wrappedObject.writeBlob(p0);
    }

    @Override
    public void writeBoolean(final boolean p0) throws java.sql.SQLException {
        wrappedObject.writeBoolean(p0);
    }

    @Override
    public void writeByte(final byte p0) throws java.sql.SQLException {
        wrappedObject.writeByte(p0);
    }

    @Override
    public void writeBytes(final byte[] p0) throws java.sql.SQLException {
        wrappedObject.writeBytes(p0);
    }

    @Override
    public void writeCharacterStream(final java.io.Reader p0) throws java.sql.SQLException {
        wrappedObject.writeCharacterStream(p0);
    }

    @Override
    public void writeClob(final java.sql.Clob p0) throws java.sql.SQLException {
        wrappedObject.writeClob(p0);
    }

    @Override
    public void writeDate(final java.sql.Date p0) throws java.sql.SQLException {
        wrappedObject.writeDate(p0);
    }

    @Override
    public void writeDouble(final double p0) throws java.sql.SQLException {
        wrappedObject.writeDouble(p0);
    }

    @Override
    public void writeFloat(final float p0) throws java.sql.SQLException {
        wrappedObject.writeFloat(p0);
    }

    @Override
    public void writeInt(final int p0) throws java.sql.SQLException {
        wrappedObject.writeInt(p0);
    }

    @Override
    public void writeLong(final long p0) throws java.sql.SQLException {
        wrappedObject.writeLong(p0);
    }

    @Override
    public void writeNClob(final java.sql.NClob p0) throws java.sql.SQLException {
        wrappedObject.writeNClob(p0);
    }

    @Override
    public void writeNString(final String p0) throws java.sql.SQLException {
        wrappedObject.writeNString(p0);
    }

    @Override
    public void writeObject(final java.sql.SQLData p0) throws java.sql.SQLException {
        wrappedObject.writeObject(p0);
    }

    @Override
    public void writeObject(final Object p0, final java.sql.SQLType p1) throws java.sql.SQLException {
        wrappedObject.writeObject(p0, p1);
    }

    @Override
    public void writeRef(final java.sql.Ref p0) throws java.sql.SQLException {
        wrappedObject.writeRef(p0);
    }

    @Override
    public void writeRowId(final java.sql.RowId p0) throws java.sql.SQLException {
        wrappedObject.writeRowId(p0);
    }

    @Override
    public void writeSQLXML(final java.sql.SQLXML p0) throws java.sql.SQLException {
        wrappedObject.writeSQLXML(p0);
    }

    @Override
    public void writeShort(final short p0) throws java.sql.SQLException {
        wrappedObject.writeShort(p0);
    }

    @Override
    public void writeString(final String p0) throws java.sql.SQLException {
        wrappedObject.writeString(p0);
    }

    @Override
    public void writeStruct(final java.sql.Struct p0) throws java.sql.SQLException {
        wrappedObject.writeStruct(p0);
    }

    @Override
    public void writeTime(final java.sql.Time p0) throws java.sql.SQLException {
        wrappedObject.writeTime(p0);
    }

    @Override
    public void writeTimestamp(final java.sql.Timestamp p0) throws java.sql.SQLException {
        wrappedObject.writeTimestamp(p0);
    }

    @Override
    public void writeURL(final java.net.URL p0) throws java.sql.SQLException {
        wrappedObject.writeURL(p0);
    }
}
