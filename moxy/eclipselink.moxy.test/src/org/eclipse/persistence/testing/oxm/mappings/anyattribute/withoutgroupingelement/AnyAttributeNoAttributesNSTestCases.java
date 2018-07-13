/*
 * Copyright (c) 1998, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Oracle - initial API and implementation from Oracle TopLink
package org.eclipse.persistence.testing.oxm.mappings.anyattribute.withoutgroupingelement;

import java.util.HashMap;
import javax.xml.namespace.QName;
import org.eclipse.persistence.testing.oxm.mappings.XMLMappingTestCases;

public class AnyAttributeNoAttributesNSTestCases extends XMLMappingTestCases {
    public AnyAttributeNoAttributesNSTestCases(String name) throws Exception {
        super(name);
        setProject(new AnyAttributeWithoutGroupingElementNSProject());
        setControlDocument("org/eclipse/persistence/testing/oxm/mappings/anyattribute/withoutgroupingelement/no_attributes_ns.xml");
    }

    public Object getControlObject() {
        Root root = new Root();
        HashMap any = new HashMap();
        QName name = new QName("http://www.w3.org/2000/xmlns/", "myns");
        any.put(name, "www.example.com/some-dir/some.xsd");
        root.setAny(any);
        //        System.out.println(root);
        return root;
    }

    public Object getWriteControlObject() {
        Root root = new Root();
        HashMap any = new HashMap();

        root.setAny(any);
        return root;
    }

    public static void main(String[] args) {
        String[] arguments = { "-c", "org.eclipse.persistence.testing.oxm.mappings.anyattribute.withoutgroupingelement.AnyAttributeNoAttributesNSTestCases" };
        junit.textui.TestRunner.main(arguments);
    }
}
