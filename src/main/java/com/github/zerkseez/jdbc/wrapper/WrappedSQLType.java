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
public class WrappedSQLType implements java.sql.SQLType {
    private final java.sql.SQLType wrappedObject;

    public WrappedSQLType(final java.sql.SQLType wrappedObject) {
        this.wrappedObject = wrappedObject;
    }

    @Override
    public String getName() {
        return wrappedObject.getName();
    }

    @Override
    public String getVendor() {
        return wrappedObject.getVendor();
    }

    @Override
    public Integer getVendorTypeNumber() {
        return wrappedObject.getVendorTypeNumber();
    }
}
