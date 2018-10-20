/*
* untitled.java
* 
* Copyright 2018  <pi@raspberrypi>
* 
* This program is free software; you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation; either version 2 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program; if not, write to the Free Software
* Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
* MA 02110-1301, USA.
* 
* 
*/

package it.marconicivitavecchia.as2018_19.c5Ainf;

import javax.swing.*;

public class MainClass extends JFrame {

	public MainClass() {
		super("Lista Bar");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<h1>Menu</h1>");

		// Create div for table
		sb.append("<div style='display:table'>");

		// create the first row
		sb.append("<div style='display:table-row'>");

		// create the Product cell
		sb.append("<div style='display:table-cell'>");
		sb.append("Prodotto");
		sb.append("</div>");
		// create the Price cell
		sb.append("<div style='display:table-cell'>");
		sb.append("Prezzo");
		sb.append("</div>");

		// close first row
		sb.append("</div>");

		// close div for table
		sb.append("</div>");

		sb.append("</html>");

		String str = sb.toString();

		super.add(new JLabel(str));

		super.pack();
		super.setVisible(true);

		System.out.println("Monolithics application from 5Ainf");
	}

	public static void main(String[] args) {
		MainClass main = new MainClass();
	}
}
