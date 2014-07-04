/*******************************************************************************
 * File: IdStorage.java
 * 
 * Date: Jul 5, 2014
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
 * Original authors and others - initial API and implementation
 ******************************************************************************/
package cane.brothers.e4.commander;

/**
 * All id's contains in this file available as well in the model.
 * 
 */
public final class IdStorage {
	/** part sash container id */
	// public static final String PART_SASH_CONTAINER_ID =
	// "cane.brothers.e4.commander.partsashcontainer.main"
	// .intern();

	/** perspective id */
	public static final String MAIN_PERSPECTIVE_ID = "cane.brothers.e4.commander.perspective.main";

	/** part descriptor id */
	public static final String DYNAMIC_PART_DESCRIPTOR_ID = "cane.brothers.e4.commander.partdescriptor.dynamic"
	        .intern();

	/** panel id's */
	public static String LEFT_PANEL_ID = "cane.brothers.e4.commander.partstack.left"
	        .intern();

	public static String RIGHT_PANEL_ID = "cane.brothers.e4.commander.partstack.right"
	        .intern();
}
