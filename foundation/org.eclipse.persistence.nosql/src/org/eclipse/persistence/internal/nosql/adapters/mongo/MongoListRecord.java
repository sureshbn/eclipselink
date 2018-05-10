/*******************************************************************************
 * Copyright (c) 2011, 2018 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.persistence.internal.nosql.adapters.mongo;

import java.util.ArrayList;

import javax.resource.cci.*;

/**
 * Simple list result.
 *
 * @author James
 * @since EclipseLink 2.4
 */
public class MongoListRecord extends ArrayList implements IndexedRecord {
    protected String description;
    protected String name;

    /**
     * Default constructor.
     */
    public MongoListRecord() {
        super();
        this.name = "Mongo record";
        this.description = "List of Mongo BSon data";
    }

    @Override
    public String getRecordShortDescription() {
        return description;
    }

    @Override
    public void setRecordShortDescription(String description) {
        this.description = description;
    }

    @Override
    public String getRecordName() {
        return name;
    }

    @Override
    public void setRecordName(String name) {
        this.name = name;
    }
}
