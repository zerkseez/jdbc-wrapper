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
public class WrappedSQLXML implements java.sql.SQLXML {
    private final java.sql.SQLXML wrappedObject;

    public WrappedSQLXML(final java.sql.SQLXML wrappedObject) {
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
    public java.io.Reader getCharacterStream() throws java.sql.SQLException {
        return wrappedObject.getCharacterStream();
    }

    @Override
    public <T extends javax.xml.transform.Source> T getSource(final Class<T> p0) throws java.sql.SQLException {
        return wrappedObject.getSource(p0);
    }

    @Override
    public String getString() throws java.sql.SQLException {
        return wrappedObject.getString();
    }

    @Override
    public java.io.OutputStream setBinaryStream() throws java.sql.SQLException {
        return wrappedObject.setBinaryStream();
    }

    @Override
    public java.io.Writer setCharacterStream() throws java.sql.SQLException {
        return wrappedObject.setCharacterStream();
    }

    @Override
    public <T extends javax.xml.transform.Result> T setResult(final Class<T> p0) throws java.sql.SQLException {
        return wrappedObject.setResult(p0);
    }

    @Override
    public void setString(final String p0) throws java.sql.SQLException {
        wrappedObject.setString(p0);
    }
}
