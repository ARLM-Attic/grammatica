/*
 * ProcessingElement.java
 *
 * This work is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation; either version 2 of the License,
 * or (at your option) any later version.
 *
 * This work is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 * USA
 *
 * As a special exception, the copyright holders of this library give
 * you permission to link this library with independent modules to
 * produce an executable, regardless of the license terms of these
 * independent modules, and to copy and distribute the resulting
 * executable under terms of your choice, provided that you also meet,
 * for each linked independent module, the terms and conditions of the
 * license of that module. An independent module is a module which is
 * not derived from or based on this library. If you modify this
 * library, you may extend this exception to your version of the
 * library, but you are not obligated to do so. If you do not wish to
 * do so, delete this exception statement from your version.
 *
 * Copyright (c) 2003 Per Cederberg. All rights reserved.
 */

package net.percederberg.grammatica.ant;

import org.apache.tools.ant.BuildException;

import net.percederberg.grammatica.Grammar;

/**
 * An grammar processing element. A processing element transforms the
 * grammar to some other form, normally source code. One or more
 * processing elements may be present in the Grammatica Ant task.
 *
 * @author   Per Cederberg, <per at percederberg dot net>
 * @version  1.4
 * @since    1.4
 */
public interface ProcessingElement {

    /**
     * Validates all attributes in the element.
     *
     * @throws BuildException if some attribute was missing or had an
     *             invalid value
     */
    void validate() throws BuildException;

    /**
     * Proceses the specified grammar.
     *
     * @param grammar        the grammar to process
     *
     * @throws BuildException if the grammar couldn't be processed
     *             correctly
     */
    void process(Grammar grammar) throws BuildException;
}
