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
public class WrappedRowId implements java.sql.RowId {
    private final java.sql.RowId wrappedObject;

    public WrappedRowId(final java.sql.RowId wrappedObject) {
        this.wrappedObject = wrappedObject;
    }

    @Override
    public boolean equals(final Object p0) {
        return wrappedObject.equals(p0);
    }

    @Override
    public byte[] getBytes() {
        return wrappedObject.getBytes();
    }

    @Override
    public int hashCode() {
        return wrappedObject.hashCode();
    }

    @Override
    public String toString() {
        return wrappedObject.toString();
    }
}
