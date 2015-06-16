/*
 * Copyright (c) 2013 Nimbits Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either expressed or implied.  See the License for the specific language governing permissions and limitations under the License.
 */

package com.nimbits.client.common;



@Deprecated
public class Utils {

    private static final double DOUBLE = 100.0;

    private Utils() {
    }

    public static boolean isEmptyString(final String string) {
        return string == null || string.trim().isEmpty();
    }

    public static double roundDouble(final double d) {
        int ix = (int) (d * DOUBLE); // scale it
        return (double) ix / DOUBLE;
    }


    public static boolean isNotEmpty(String string) {
        return !isEmptyString(string);
    }
}
