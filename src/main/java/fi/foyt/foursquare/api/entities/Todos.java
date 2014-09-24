/*
 * FoursquareAPI - Foursquare API for Java Copyright (C) 2008 - 2011 Antti Leppä / Foyt http://www.foyt.fi
 * 
 * License:
 * 
 * Licensed under GNU Lesser General Public License Version 3 or later (the "LGPL")
 * http://www.gnu.org/licenses/lgpl.html
 */

package fi.foyt.foursquare.api.entities;

/**
 * Group of PhotoGroups
 * 
 * @author Antti Leppä
 */
public class Todos
    extends Count {

    private static final long serialVersionUID = 1974338391344968466L;

    public String[] getItems()
    {
        return items;
    }

    private String[] items;
}
