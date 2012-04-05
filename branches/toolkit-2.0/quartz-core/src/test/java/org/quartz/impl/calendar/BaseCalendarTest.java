/* 
 * All content copyright Terracotta, Inc., unless otherwise indicated. All rights reserved. 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not 
 * use this file except in compliance with the License. You may obtain a copy 
 * of the License at 
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0 
 *   
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and limitations 
 * under the License.
 * 
 */
  package org.quartz.impl.calendar;

import junit.framework.TestCase;

public class BaseCalendarTest extends TestCase {

    public void testClone() {
        BaseCalendar base = new BaseCalendar();
        BaseCalendar clone = (BaseCalendar) base.clone();

        assertEquals(base.getDescription(), clone.getDescription());
        assertEquals(base.getBaseCalendar(), clone.getBaseCalendar());
        assertEquals(base.getTimeZone(), clone.getTimeZone());
    }


}
