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
public class WrappedSQLInput implements java.sql.SQLInput {
    private final java.sql.SQLInput wrappedObject;

    public WrappedSQLInput(final java.sql.SQLInput wrappedObject) {
        this.wrappedObject = wrappedObject;
    }

    @Override
    public java.sql.Array readArray() throws java.sql.SQLException {
        return wrappedObject.readArray();
    }

    @Override
    public java.io.InputStream readAsciiStream() throws java.sql.SQLException {
        return wrappedObject.readAsciiStream();
    }

    @Override
    public java.math.BigDecimal readBigDecimal() throws java.sql.SQLException {
        return wrappedObject.readBigDecimal();
    }

    @Override
    public java.io.InputStream readBinaryStream() throws java.sql.SQLException {
        return wrappedObject.readBinaryStream();
    }

    @Override
    public java.sql.Blob readBlob() throws java.sql.SQLException {
        return wrappedObject.readBlob();
    }

    @Override
    public boolean readBoolean() throws java.sql.SQLException {
        return wrappedObject.readBoolean();
    }

    @Override
    public byte readByte() throws java.sql.SQLException {
        return wrappedObject.readByte();
    }

    @Override
    public byte[] readBytes() throws java.sql.SQLException {
        return wrappedObject.readBytes();
    }

    @Override
    public java.io.Reader readCharacterStream() throws java.sql.SQLException {
        return wrappedObject.readCharacterStream();
    }

    @Override
    public java.sql.Clob readClob() throws java.sql.SQLException {
        return wrappedObject.readClob();
    }

    @Override
    public java.sql.Date readDate() throws java.sql.SQLException {
        return wrappedObject.readDate();
    }

    @Override
    public double readDouble() throws java.sql.SQLException {
        return wrappedObject.readDouble();
    }

    @Override
    public float readFloat() throws java.sql.SQLException {
        return wrappedObject.readFloat();
    }

    @Override
    public int readInt() throws java.sql.SQLException {
        return wrappedObject.readInt();
    }

    @Override
    public long readLong() throws java.sql.SQLException {
        return wrappedObject.readLong();
    }

    @Override
    public java.sql.NClob readNClob() throws java.sql.SQLException {
        return wrappedObject.readNClob();
    }

    @Override
    public String readNString() throws java.sql.SQLException {
        return wrappedObject.readNString();
    }

    @Override
    public Object readObject() throws java.sql.SQLException {
        return wrappedObject.readObject();
    }

    @Override
    public <T> T readObject(final Class<T> p0) throws java.sql.SQLException {
        return wrappedObject.readObject(p0);
    }

    @Override
    public java.sql.Ref readRef() throws java.sql.SQLException {
        return wrappedObject.readRef();
    }

    @Override
    public java.sql.RowId readRowId() throws java.sql.SQLException {
        return wrappedObject.readRowId();
    }

    @Override
    public java.sql.SQLXML readSQLXML() throws java.sql.SQLException {
        return wrappedObject.readSQLXML();
    }

    @Override
    public short readShort() throws java.sql.SQLException {
        return wrappedObject.readShort();
    }

    @Override
    public String readString() throws java.sql.SQLException {
        return wrappedObject.readString();
    }

    @Override
    public java.sql.Time readTime() throws java.sql.SQLException {
        return wrappedObject.readTime();
    }

    @Override
    public java.sql.Timestamp readTimestamp() throws java.sql.SQLException {
        return wrappedObject.readTimestamp();
    }

    @Override
    public java.net.URL readURL() throws java.sql.SQLException {
        return wrappedObject.readURL();
    }

    @Override
    public boolean wasNull() throws java.sql.SQLException {
        return wrappedObject.wasNull();
    }
}
