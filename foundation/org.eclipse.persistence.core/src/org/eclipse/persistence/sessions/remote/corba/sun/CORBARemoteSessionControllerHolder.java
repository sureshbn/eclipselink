/*******************************************************************************
 * Copyright (c) 1998, 2018 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation from Oracle TopLink
 ******************************************************************************/
package org.eclipse.persistence.sessions.remote.corba.sun;


/**
 * INTERNAL:
* org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionControllerHolder.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from CorbaRemoteSessionControllerSun.idl
* Monday, November 19, 2001 1:51:44 o'clock PM EST
*/
public final class CORBARemoteSessionControllerHolder implements org.omg.CORBA.portable.Streamable {
    public org.eclipse.persistence.sessions.remote.corba.sun.CORBARemoteSessionController value = null;

    public CORBARemoteSessionControllerHolder() {
    }

    public CORBARemoteSessionControllerHolder(org.eclipse.persistence.sessions.remote.corba.sun.CORBARemoteSessionController initialValue) {
        value = initialValue;
    }

    @Override
    public void _read(org.omg.CORBA.portable.InputStream i) {
        value = org.eclipse.persistence.sessions.remote.corba.sun.CORBARemoteSessionControllerHelper.read(i);
    }

    @Override
    public void _write(org.omg.CORBA.portable.OutputStream o) {
        org.eclipse.persistence.sessions.remote.corba.sun.CORBARemoteSessionControllerHelper.write(o, value);
    }

    @Override
    public org.omg.CORBA.TypeCode _type() {
        return org.eclipse.persistence.sessions.remote.corba.sun.CORBARemoteSessionControllerHelper.type();
    }
}
