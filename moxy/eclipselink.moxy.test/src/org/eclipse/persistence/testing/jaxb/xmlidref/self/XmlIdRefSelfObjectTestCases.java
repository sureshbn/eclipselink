/*******************************************************************************
* Copyright (c) 2011, 2015 Oracle and/or its affiliates. All rights reserved.
* This program and the accompanying materials are made available under the
* terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
* which accompanies this distribution.
* The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
* and the Eclipse Distribution License is available at
* http://www.eclipse.org/org/documents/edl-v10.php.
*
* Contributors:
*     bdoughan - April 14/2010 - 2.1 - Initial implementation
******************************************************************************/
package org.eclipse.persistence.testing.jaxb.xmlidref.self;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Vector;

import org.eclipse.persistence.testing.jaxb.JAXBWithJSONTestCases;

/**
 *
 */
public class XmlIdRefSelfObjectTestCases extends JAXBWithJSONTestCases {

    private final static String XML_RESOURCE = "org/eclipse/persistence/testing/jaxb/xmlidref/self.xml";
    private final static String JSON_RESOURCE = "org/eclipse/persistence/testing/jaxb/xmlidref/self.json";


    public XmlIdRefSelfObjectTestCases(String name) throws Exception {
        super(name);
        Class[] classes = new Class[2];
        classes[0] = Root.class;
        classes[1] = Item.class;
        setClasses(classes);
        setControlDocument(XML_RESOURCE);
        setControlJSON(JSON_RESOURCE);
    }

    protected Object getControlObject() {
        Item item1 = new Item();
        item1.m_name = "test";

        Item item2 = new Item();
        item2.m_name = "test2";
        item1.m_parent = item2;


        Root obj = new Root();
        obj.items = new ArrayList<Item>();
        obj.items.add(item1);
        obj.items.add(item2);
        return obj;
    }


}
