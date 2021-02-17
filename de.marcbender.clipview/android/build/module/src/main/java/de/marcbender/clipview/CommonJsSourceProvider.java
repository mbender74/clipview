/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2019 by Axway, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 * Warning: This file is GENERATED, and should not be modified
 */
package de.marcbender.clipview;

import org.appcelerator.kroll.common.KrollSourceCodeProvider;
import org.appcelerator.kroll.util.KrollAssetHelper;

public class CommonJsSourceProvider implements KrollSourceCodeProvider
{
	public String getSourceCode()
	{
		return getSourceCode("de.marcbender.clipview");
	}

	public String getSourceCode(String module)
	{
		if (module.equals("${moduleid}/de.marcbender.clipview")) {
			module = "de.marcbender.clipview";
		}

		return KrollAssetHelper.readAsset("Resources/de.marcbender.clipview/" + module + ".js");
	}
}
