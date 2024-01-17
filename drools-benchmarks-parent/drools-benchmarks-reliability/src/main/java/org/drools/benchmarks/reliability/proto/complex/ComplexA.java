/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License. 
 */

package org.drools.benchmarks.reliability.proto.complex;

import java.util.ArrayList;
import java.util.List;

import org.drools.benchmarks.common.model.AbstractBean;

public class ComplexA extends AbstractBean implements StringListContainer {

    private List<String> list1 = new ArrayList<String>();
    private List<String> list2 = new ArrayList<String>();
    private List<String> list3 = new ArrayList<String>();
    private List<String> list4 = new ArrayList<String>();
    private List<String> list5 = new ArrayList<String>();
    private List<String> list6 = new ArrayList<String>();
    private List<String> list7 = new ArrayList<String>();
    private List<String> list8 = new ArrayList<String>();
    private List<String> list9 = new ArrayList<String>();
    private List<String> list10 = new ArrayList<String>();

    /**
     * In this case id is autogenerated.
     *
     * @param value
     */
    public ComplexA(final int value) {
        super(value);
    }

    public ComplexA(final long id, final int value) {
        super(id, value);
    }

    public ComplexA(final long id, final int value, final List<String> list1, final List<String> list2, final List<String> list3, final List<String> list4, final List<String> list5, final List<String> list6, final List<String> list7, final List<String> list8, final List<String> list9, final List<String> list10) {
        super(id, value);
        this.list1 = list1;
        this.list2 = list2;
        this.list3 = list3;
        this.list4 = list4;
        this.list5 = list5;
        this.list6 = list6;
        this.list7 = list7;
        this.list8 = list8;
        this.list9 = list9;
        this.list10 = list10;
    }

    public List<String> getList1() {
        return list1;
    }

    public void setList1(List<String> list1) {
        this.list1 = list1;
    }

    public List<String> getList2() {
        return list2;
    }

    public void setList2(List<String> list2) {
        this.list2 = list2;
    }

    public List<String> getList3() {
        return list3;
    }

    public void setList3(List<String> list3) {
        this.list3 = list3;
    }

    public List<String> getList4() {
        return list4;
    }

    public void setList4(List<String> list4) {
        this.list4 = list4;
    }

    public List<String> getList5() {
        return list5;
    }

    public void setList5(List<String> list5) {
        this.list5 = list5;
    }

    public List<String> getList6() {
        return list6;
    }

    public void setList6(List<String> list6) {
        this.list6 = list6;
    }

    public List<String> getList7() {
        return list7;
    }

    public void setList7(List<String> list7) {
        this.list7 = list7;
    }

    public List<String> getList8() {
        return list8;
    }

    public void setList8(List<String> list8) {
        this.list8 = list8;
    }

    public List<String> getList9() {
        return list9;
    }

    public void setList9(List<String> list9) {
        this.list9 = list9;
    }

    public List<String> getList10() {
        return list10;
    }

    public void setList10(List<String> list10) {
        this.list10 = list10;
    }

    @Override
    public String toString() {
        return "ComplexA{" +
                "id=" + getId() +
                "list1=" + list1 +
                ", list2=" + list2 +
                ", list3=" + list3 +
                ", list4=" + list4 +
                ", list5=" + list5 +
                ", list6=" + list6 +
                ", list7=" + list7 +
                ", list8=" + list8 +
                ", list9=" + list9 +
                ", list10=" + list10 +
                '}';
    }
}
