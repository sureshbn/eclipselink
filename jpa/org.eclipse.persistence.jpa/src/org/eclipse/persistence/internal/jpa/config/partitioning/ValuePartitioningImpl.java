/*******************************************************************************
 * Copyright (c) 2013, 2018  Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Guy Pelletier - initial API and implementation
 ******************************************************************************/
package org.eclipse.persistence.internal.jpa.config.partitioning;

import java.util.ArrayList;

import org.eclipse.persistence.internal.jpa.config.MetadataImpl;
import org.eclipse.persistence.internal.jpa.config.columns.ColumnImpl;
import org.eclipse.persistence.internal.jpa.metadata.partitioning.ValuePartitionMetadata;
import org.eclipse.persistence.internal.jpa.metadata.partitioning.ValuePartitioningMetadata;
import org.eclipse.persistence.jpa.config.Column;
import org.eclipse.persistence.jpa.config.ValuePartition;
import org.eclipse.persistence.jpa.config.ValuePartitioning;

/**
 * JPA scripting API implementation.
 *
 * @author Guy Pelletier
 * @since EclipseLink 2.5.1
 */
public class ValuePartitioningImpl extends MetadataImpl<ValuePartitioningMetadata> implements ValuePartitioning {

    public ValuePartitioningImpl() {
        super(new ValuePartitioningMetadata());

        getMetadata().setPartitions(new ArrayList<ValuePartitionMetadata>());
    }

    @Override
    public ValuePartition addPartition() {
        ValuePartitionImpl valuePartition = new ValuePartitionImpl();
        getMetadata().getPartitions().add(valuePartition.getMetadata());
        return valuePartition;
    }

    @Override
    public ValuePartitioning setDefaultConnectionPool(String defaultConnectionPool) {
        getMetadata().setDefaultConnectionPool(defaultConnectionPool);
        return this;
    }

    @Override
    public ValuePartitioning setName(String name) {
        getMetadata().setName(name);
        return this;
    }

    @Override
    public Column setPartitionColumn() {
        ColumnImpl column = new ColumnImpl();
        getMetadata().setPartitionColumn(column.getMetadata());
        return column;
    }

    @Override
    public ValuePartitioning setPartitionValueType(String partitionValueType) {
        getMetadata().setPartitionValueTypeName(partitionValueType);
        return this;
    }

    @Override
    public ValuePartitioning setUnionUnpartitionableQueries(Boolean unionUnpartitionableQueries) {
        getMetadata().setUnionUnpartitionableQueries(unionUnpartitionableQueries);
        return this;
    }

}
