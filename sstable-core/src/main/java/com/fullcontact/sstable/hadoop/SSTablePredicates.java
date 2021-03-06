/*
 * Copyright 2014 FullContact, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fullcontact.sstable.hadoop;

import com.google.common.base.Predicate;

/**
 * Predicates that apply to C* SSTables.
 *
 * @author ben <ben.vanberg@fullcontact.com>
 */
public class SSTablePredicates {

    public static final Predicate<String> IS_SSTABLE = isSSTable();

    private static Predicate<String> isSSTable() {
        return new Predicate<String>() {
            @Override
            public boolean apply(String fileName) {
                return fileName.endsWith("-Data.db");
            }
        };
    }
}
