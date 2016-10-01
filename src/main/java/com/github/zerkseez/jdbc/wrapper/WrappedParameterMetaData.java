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
public class WrappedParameterMetaData implements java.sql.ParameterMetaData {
    private final java.sql.ParameterMetaData wrappedObject;

    public WrappedParameterMetaData(final java.sql.ParameterMetaData wrappedObject) {
        this.wrappedObject = wrappedObject;
    }

    @Override
    public String getParameterClassName(final int p0) throws java.sql.SQLException {
        return wrappedObject.getParameterClassName(p0);
    }

    @Override
    public int getParameterCount() throws java.sql.SQLException {
        return wrappedObject.getParameterCount();
    }

    @Override
    public int getParameterMode(final int p0) throws java.sql.SQLException {
        return wrappedObject.getParameterMode(p0);
    }

    @Override
    public int getParameterType(final int p0) throws java.sql.SQLException {
        return wrappedObject.getParameterType(p0);
    }

    @Override
    public String getParameterTypeName(final int p0) throws java.sql.SQLException {
        return wrappedObject.getParameterTypeName(p0);
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
    public int isNullable(final int p0) throws java.sql.SQLException {
        return wrappedObject.isNullable(p0);
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
    public <T> T unwrap(final Class<T> p0) throws java.sql.SQLException {
        return wrappedObject.unwrap(p0);
    }
}
