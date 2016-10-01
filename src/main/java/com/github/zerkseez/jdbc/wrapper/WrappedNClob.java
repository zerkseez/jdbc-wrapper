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
public class WrappedNClob implements java.sql.NClob {
    private final java.sql.NClob wrappedObject;

    public WrappedNClob(final java.sql.NClob wrappedObject) {
        this.wrappedObject = wrappedObject;
    }

    @Override
    public void free() throws java.sql.SQLException {
        wrappedObject.free();
    }

    @Override
    public java.io.InputStream getAsciiStream() throws java.sql.SQLException {
        return wrappedObject.getAsciiStream();
    }

    @Override
    public java.io.Reader getCharacterStream() throws java.sql.SQLException {
        return wrappedObject.getCharacterStream();
    }

    @Override
    public java.io.Reader getCharacterStream(final long p0, final long p1) throws java.sql.SQLException {
        return wrappedObject.getCharacterStream(p0, p1);
    }

    @Override
    public String getSubString(final long p0, final int p1) throws java.sql.SQLException {
        return wrappedObject.getSubString(p0, p1);
    }

    @Override
    public long length() throws java.sql.SQLException {
        return wrappedObject.length();
    }

    @Override
    public long position(final String p0, final long p1) throws java.sql.SQLException {
        return wrappedObject.position(p0, p1);
    }

    @Override
    public long position(final java.sql.Clob p0, final long p1) throws java.sql.SQLException {
        return wrappedObject.position(p0, p1);
    }

    @Override
    public java.io.OutputStream setAsciiStream(final long p0) throws java.sql.SQLException {
        return wrappedObject.setAsciiStream(p0);
    }

    @Override
    public java.io.Writer setCharacterStream(final long p0) throws java.sql.SQLException {
        return wrappedObject.setCharacterStream(p0);
    }

    @Override
    public int setString(final long p0, final String p1) throws java.sql.SQLException {
        return wrappedObject.setString(p0, p1);
    }

    @Override
    public int setString(final long p0, final String p1, final int p2, final int p3) throws java.sql.SQLException {
        return wrappedObject.setString(p0, p1, p2, p3);
    }

    @Override
    public void truncate(final long p0) throws java.sql.SQLException {
        wrappedObject.truncate(p0);
    }
}
