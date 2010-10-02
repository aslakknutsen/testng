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


/**
 * The top level model
 * 
 * {@link Visitable}<{@link TestClass}> <br />
 * Visit all resolved classes in this test suite.<br />
 * <br /><br />
 * Usage: <br />
 *   - Filter classes on some criteria by disabling the {@link TestClass}<br />
 *   - Register a {@link TestInterceptor} on a {@link TestClass}<br />
 * 
 * <br /><br />
 * 
 * {@link Interceptable}<{@link SuiteInterceptor}> <br />
 * Intercept the Suite level Configuration methods. Call {@link MethodInvocation#proceed()} to invoke
 * the underlying Suite level Configuration methods. <br />
 * <em>The interceptor is called whether the user has defined a Configuration method or not.</em> 
 * 
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public interface Suite extends Interceptable<SuiteInterceptor>, Visitable<TestClass>
{
}
