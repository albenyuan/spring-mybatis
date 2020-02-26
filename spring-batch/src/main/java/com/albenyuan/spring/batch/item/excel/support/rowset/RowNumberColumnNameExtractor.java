/*
 * Copyright 2006-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.albenyuan.spring.batch.item.excel.support.rowset;

import com.albenyuan.spring.batch.item.excel.Sheet;

/**
 * {@code ColumnNameExtractor} which returns the values of a given row (default is 0) as the column
 * names.
 *
 * @author Marten Deinum
 * @since 0.5.0
 */
public class RowNumberColumnNameExtractor implements ColumnNameExtractor {

    private int headerRowNumber;

    @Override
    public String[] getColumnNames(final Sheet sheet) {
        return sheet.getRow(headerRowNumber);
    }

    public void setHeaderRowNumber(int headerRowNumber) {
        this.headerRowNumber = headerRowNumber;
    }
}