/*******************************************************************************
 * Copyright (c) 2016 Contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Andy Clement - initial API and implementation
 *******************************************************************************/
package org.aspectj.systemtest.ajc189;

import java.io.File;

import junit.framework.Test;

import org.aspectj.testing.XMLBasedAjcTestCase;

/**
 * @author Andy Clement
 */
public class Ajc189Tests extends org.aspectj.testing.XMLBasedAjcTestCase {

	public void testWhileNPE_486203() throws Exception {
		runTest("while npe");
	}
	
	// ---

	public static Test suite() {
		return XMLBasedAjcTestCase.loadSuite(Ajc189Tests.class);
	}

	@Override
	protected File getSpecFile() {
		return getClassResource("ajc189.xml");
	}

}