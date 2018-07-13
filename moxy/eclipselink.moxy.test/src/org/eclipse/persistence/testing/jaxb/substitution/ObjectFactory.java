/*
 * Copyright (c) 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2010, 2015 .05.05 at 01:57:10 PM EDT
//


package org.eclipse.persistence.testing.jaxb.substitution;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mynamespace package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Nom_QNAME = new QName("myNamespace", "nom");
    private final static QName _Person_QNAME = new QName("myNamespace", "person");
    private final static QName _Name_QNAME = new QName("myNamespace", "name");
    private final static QName _Personne_QNAME = new QName("myNamespace", "personne");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mynamespace
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     *
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "myNamespace", name = "nom", substitutionHeadNamespace = "myNamespace", substitutionHeadName = "name")
    public JAXBElement<String> createNom(String value) {
        return new JAXBElement<String>(_Nom_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "myNamespace", name = "person", substitutionHeadNamespace = "myNamespace", substitutionHeadName = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "myNamespace", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "myNamespace", name = "personne", substitutionHeadNamespace = "myNamespace", substitutionHeadName = "person")
    public JAXBElement<Person> createPersonne(Person value) {
        return new JAXBElement<Person>(_Personne_QNAME, Person.class, null, value);
    }

}
