/*******************************************************************************
 * File: IDynamicTab.java
 * 
 * Date: 26 сент. 2014 г.
 * Author: Mikhail Niedre
 * 
 * Copyright (c) 2014 Original authors and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * <a href="http://www.eclipse.org/legal/epl-v10.html">epl-v1.0</a>
 *
 * Contributors:
 * Mikhail Niedre - initial API and implementation
 *******************************************************************************/
package cane.brothers.e4.commander.api;

import java.nio.file.Path;

/**
 * TODO
 */
public interface IDynamicTab {

    // public PathNatTable getTable();

    public Path getRootPath();

    public void clearSelection();

    public void setSelection();

    public void setFocus();
}
