/*******************************************************************************
 * File: TabEvents.java
 * 
 * Date: 28 сент. 2014 г.
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
package cane.brothers.e4.commander.event;

/**
 * all tab's events.
 */
public final class TabEvents extends BaseEvents {

    /**
     * Base name of all path events
     */
    public static final String TOPIC_BASE_TAB = TOPIC_BASE + "/tab/".intern(); //$NON-NLS-1$

    /**
     * Sent when opening new tab.
     */
    public static final String TOPIC_TAB_OPEN = TOPIC_BASE_TAB
	    + "open".intern(); //$NON-NLS-1$

    /**
     * Sent when closing tab.
     */
    public static final String TOPIC_TAB_CLOSE = TOPIC_BASE_TAB
	    + "close".intern(); //$NON-NLS-1$

    /**
     * Sent when moving tab on the same panel.
     */
    public static final String TOPIC_TAB_MOVE = TOPIC_BASE_TAB
	    + "move".intern(); //$NON-NLS-1$

    /**
     * Sent when moving tab to another panel.
     */
    public static final String TOPIC_TAB_MOVE_OPPOSITE = TOPIC_BASE_TAB
	    + "moveToOpposite".intern(); //$NON-NLS-1$

    /**
     * Sent on dClick on tab label.
     */
    public static final String TOPIC_TAB_DCLICK = TOPIC_BASE_TAB
	    + "dClick".intern(); //$NON-NLS-1$

}
