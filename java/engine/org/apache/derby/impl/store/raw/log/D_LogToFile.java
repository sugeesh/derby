/*

   Licensed Materials - Property of IBM
   Cloudscape - Package org.apache.derby.impl.store.raw.log
   (C) Copyright IBM Corp. 1998, 2004. All Rights Reserved.
   US Government Users Restricted Rights - Use, duplication or
   disclosure restricted by GSA ADP Schedule Contract with IBM Corp.

 */

package org.apache.derby.impl.store.raw.log;

import org.apache.derby.impl.store.raw.log.LogCounter;
import org.apache.derby.iapi.services.diag.DiagnosticUtil;
import org.apache.derby.iapi.services.diag.Diagnosticable;
import org.apache.derby.iapi.services.diag.DiagnosticableGeneric;
import org.apache.derby.iapi.error.StandardException;
import java.util.Enumeration;

public class D_LogToFile
extends DiagnosticableGeneric
{

	/**
	  @exception StandardException Oops.
	  @see Diagnosticable#diag
	  */
    public String diag()
 		 throws StandardException
    {
		LogToFile ltf = (LogToFile)diag_object;
		StringBuffer r = new StringBuffer();
		r.append("LogToFile: \n");
		r.append("    Directory: "+ltf.dataDirectory+"\n");
		r.append("    endPosition: "+ltf.endPosition()+"\n");
		r.append("    lastFlush(offset): "+ltf.lastFlush+"\n");
		r.append("    logFileNumber: "+ltf.logFileNumber+"\n");
		r.append("    firstLogFileNumber: "+ltf.firstLogFileNumber+"\n");
		return r.toString();
	}
}



