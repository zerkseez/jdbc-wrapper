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
public class WrappedSQLData implements java.sql.SQLData {
    private final java.sql.SQLData wrappedObject;

    public WrappedSQLData(final java.sql.SQLData wrappedObject) {
        this.wrappedObject = wrappedObject;
    }

    @Override
    public String getSQLTypeName() throws java.sql.SQLException {
        return wrappedObject.getSQLTypeName();
    }

    @Override
    public void readSQL(final java.sql.SQLInput p0, final String p1) throws java.sql.SQLException {
        wrappedObject.readSQL(p0, p1);
    }

    @Override
    public void writeSQL(final java.sql.SQLOutput p0) throws java.sql.SQLException {
        wrappedObject.writeSQL(p0);
    }
}
