/**
 *
 * Copyright (c) 2006-2016, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.plugins.reactor.component;

import com.speedment.runtime.Speedment;
import com.speedment.runtime.component.ComponentConstructor;


/**
 * The installer for the Reactor Plugin. Add the following code to the
 * {@code speedment-maven-plugin} in the {@code pom.xml}-file to use this
 * plugin:
 * <p>
 * {@code
 * <configuration>
 *     <components>
 *         <component implementation="
 *             com.speedment.fika.reactor.plugin.ReactorPluginInstaller
 *         " />
 *     </components>
 * </configuration>
 * }
 * 
 * @author Emil Forslund
 * @since  1.1.0
 */
public final class ReactorPluginInstaller 
    implements ComponentConstructor<ReactorPlugin> {

    @Override
    public ReactorPlugin create(Speedment speedment) {
        return new ReactorPlugin(speedment);
    }
}