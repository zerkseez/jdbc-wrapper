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
public class WrappedRef implements java.sql.Ref {
    private final java.sql.Ref wrappedObject;

    public WrappedRef(final java.sql.Ref wrappedObject) {
        this.wrappedObject = wrappedObject;
    }

    @Override
    public String getBaseTypeName() throws java.sql.SQLException {
        return wrappedObject.getBaseTypeName();
    }

    @Override
    public Object getObject() throws java.sql.SQLException {
        return wrappedObject.getObject();
    }

    @Override
    public Object getObject(final java.util.Map<String, Class<?>> p0) throws java.sql.SQLException {
        return wrappedObject.getObject(p0);
    }

    @Override
    public void setObject(final Object p0) throws java.sql.SQLException {
        wrappedObject.setObject(p0);
    }
}
