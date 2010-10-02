/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.testng.spi;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

/**
 * Generic description of a class that can be intercepted.
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 * @param <T> The type of interceptor this class supports
 */
public interface Interceptable<T>
{
   
   /** 
    * Add a Interceptor to the object. This will let you intercept and control
    * the execution of e.g.
    *   {@link BeforeSuite}/{@link AfterSuite} events on suite level
    *   {@link BeforeClass}/{@link AfterClass} events on class level
    *   
    *  
    * @param interceptor 
    */
   void addInterceptor(T interceptor); 
}
