/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */
package org.wso2.andes.management.ui.jmx;

import javax.management.Notification;
import javax.management.ObjectName;

import org.wso2.andes.management.ui.ManagedServer;

public class ClientNotificationListener extends ClientListener
{   
    public ClientNotificationListener(ManagedServer server)
    {
        super(server);
    }
    
    public void handleNotification(Notification notification, Object handback)
    {
        ObjectName objName = (ObjectName)notification.getSource();
        getServerRegistry().addNotification(objName, notification);
    }
}
