/*******************************************************************************
 * Copyright 2012 Urbancode, Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.urbancode.terraform.tasks.common;


public class EnvironmentTask extends Task {
    
    private String name;
    private long startTime;
    
    //----------------------------------------------------------------------------------------------
    public EnvironmentTask() {
        super(null);
    }
    
    //----------------------------------------------------------------------------------------------
    public EnvironmentTask(Context context) {
        super(context);
    }
    
    //----------------------------------------------------------------------------------------------
    public String getName() {
        return name;
    }
    
    //----------------------------------------------------------------------------------------------
    public long getStartTime() {
        return startTime;
    }
    
    //----------------------------------------------------------------------------------------------
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    
    //----------------------------------------------------------------------------------------------
    public void setName(String name) {
        this.name = name;
    }

    //----------------------------------------------------------------------------------------------
    @Override
    public void create() throws Exception {
        // TODO Auto-generated method stub
    }

    //----------------------------------------------------------------------------------------------
    @Override
    public void destroy() throws Exception {
        // TODO Auto-generated method stub
    }
}
