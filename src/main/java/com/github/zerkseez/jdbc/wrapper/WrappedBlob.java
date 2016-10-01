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
public class WrappedBlob implements java.sql.Blob {
    private final java.sql.Blob wrappedObject;

    public WrappedBlob(final java.sql.Blob wrappedObject) {
        this.wrappedObject = wrappedObject;
    }

    @Override
    public void free() throws java.sql.SQLException {
        wrappedObject.free();
    }

    @Override
    public java.io.InputStream getBinaryStream() throws java.sql.SQLException {
        return wrappedObject.getBinaryStream();
    }

    @Override
    public java.io.InputStream getBinaryStream(final long p0, final long p1) throws java.sql.SQLException {
        return wrappedObject.getBinaryStream(p0, p1);
    }

    @Override
    public byte[] getBytes(final long p0, final int p1) throws java.sql.SQLException {
        return wrappedObject.getBytes(p0, p1);
    }

    @Override
    public long length() throws java.sql.SQLException {
        return wrappedObject.length();
    }

    @Override
    public long position(final byte[] p0, final long p1) throws java.sql.SQLException {
        return wrappedObject.position(p0, p1);
    }

    @Override
    public long position(final java.sql.Blob p0, final long p1) throws java.sql.SQLException {
        return wrappedObject.position(p0, p1);
    }

    @Override
    public java.io.OutputStream setBinaryStream(final long p0) throws java.sql.SQLException {
        return wrappedObject.setBinaryStream(p0);
    }

    @Override
    public int setBytes(final long p0, final byte[] p1) throws java.sql.SQLException {
        return wrappedObject.setBytes(p0, p1);
    }

    @Override
    public int setBytes(final long p0, final byte[] p1, final int p2, final int p3) throws java.sql.SQLException {
        return wrappedObject.setBytes(p0, p1, p2, p3);
    }

    @Override
    public void truncate(final long p0) throws java.sql.SQLException {
        wrappedObject.truncate(p0);
    }
}
