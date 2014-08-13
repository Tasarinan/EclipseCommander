/*******************************************************************************
 * File: OpenPathMouseClickAction.java
 * 
 * Date: 14 авг. 2014 г.
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
package cane.brothers.e4.commander.pathTable.action;

import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.ui.action.IMouseClickAction;
import org.eclipse.swt.events.MouseEvent;

import cane.brothers.e4.commander.pathTable.command.OpenPathCommand;

/**
 * double click action in the path table -> open new path.
 */
public class OpenPathMouseClickAction implements IMouseClickAction {

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.nebula.widgets.nattable.ui.action.IMouseAction#run(org.eclipse
     * .nebula.widgets.nattable.NatTable, org.eclipse.swt.events.MouseEvent)
     */
    @Override
    public void run(NatTable natTable, MouseEvent event) {
	int rowPosition = natTable.getRowPositionByY(event.y);
	System.out.println("rowPos: " + rowPosition);

	if (rowPosition != -1) {
	    natTable.doCommand(new OpenPathCommand());
	}
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.nebula.widgets.nattable.ui.action.IMouseClickAction#isExclusive
     * ()
     */
    @Override
    public boolean isExclusive() {
	return true;
    }

}
