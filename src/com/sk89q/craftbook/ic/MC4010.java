// $Id$
/*
 * CraftBook
 * Copyright (C) 2010 sk89q <http://www.sk89q.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.craftbook.ic;

/**
 * Half Adder
 * @author Lymia
 */
public class MC4010 extends _3I3OFamilyIC {
    public String getTitle() {
        return "HALF ADDER";
    }

    public void think(ChipState chip) {
        boolean B = chip.getIn(2).is();
        boolean C = chip.getIn(3).is();
        
        boolean S = B^C;
        boolean Ca = B&C;
        
        chip.getOut(1).set(S);
        chip.getOut(2).set(Ca);
        chip.getOut(3).set(Ca);
    }
}
