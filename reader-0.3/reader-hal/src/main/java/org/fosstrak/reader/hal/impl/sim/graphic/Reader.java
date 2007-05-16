/*
 * Copyright (C) 2007 ETH Zurich
 *
 * This file is part of Accada (www.accada.org).
 *
 * Accada is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1, as published by the Free Software Foundation.
 *
 * Accada is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Accada; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

package org.accada.reader.hal.impl.sim.graphic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

import org.accada.reader.hal.impl.sim.multi.GraphicSimulatorServer;


/**
 * @author regli
 */
public class Reader extends JComponent {
	
	/** the serial version uid */
	private static final long serialVersionUID = 1L;
	
	private final String id;
	private final GraphicSimulatorServer simulator;
	private final Properties properties;
	private final TreeMap antennas = new TreeMap();
	
	private ImageIcon icon;

	/**
	 * the constructor creates a new graphical representation of a reader
	 * 
	 * @param id of the reader
	 * @param pos on the pane of the reader
	 * @param simulator graphic simulator to which this reader belongs to
	 */
	public Reader(String id, Set antennas, final GraphicSimulatorServer simulator) {
		super();
		
		// set properties
		this.id = id;
		this.simulator = simulator;
		this.properties = simulator.getProperties();
		String filename = simulator.getProperties().getProperty("ReaderImage");
		icon = new ImageIcon(this.getClass().getResource(filename));
		
		// listener
		simulator.getTranslationListener().add(this);
		
		// add antennas
		Iterator antennaIt = antennas.iterator();
		while (antennaIt.hasNext()) {
			createAntenna((String)antennaIt.next());
		}
		
		// TODO: initialize context menu
	}
	
	/**
	 * moves the reader to the position pos
	 * 
	 * @param pos position to move
	 */
	public void setPosition(Point pos) {
		setBounds(new java.awt.Rectangle(pos, new Dimension(simulator.getProperty("ReaderWidth"), simulator.getProperty("ReaderHeight"))));
		Iterator antennaIt = antennas.values().iterator();
		while (antennaIt.hasNext()) {
			Antenna antenna = (Antenna)antennaIt.next();
			antenna.setPosition(getAntennaPosition(antenna.getId()));
		}
	}
	
	/**
	 * creates an antenna and adds it to the layered pane
	 * 
	 * @param id of the antenna
	 * @param reader which contains the antenna
	 */
	private void createAntenna(String id) {
		// add antenna
		Antenna newAntenna = new Antenna(id, simulator);
		addAntenna(newAntenna);
		Point antennaPos = getAntennaPosition(id);
		newAntenna.setPosition(antennaPos);
		simulator.addToJLayeredPane(newAntenna, new Integer(0));
		
		// add cable
		Cable newCable = new Cable(antennaPos, getProperty("ReaderPaneX"), simulator);
		newAntenna.setCable(newCable);
		simulator.addToJLayeredPane(newCable, new Integer(-1));
	}
	
	private Point getAntennaPosition(String antennaId) {
		Point readerPos = simulator.getReaderPosition(id);
		int antennaNbr = getAntennas().headMap(antennaId).size();
		int x = antennaNbr * (getProperty("AntennaWidth") + getProperty("HorizontalInterAntennaPadding")) + getProperty("AntennaPaneX");
		int y = readerPos.y + (getProperty("ReaderHeight") - getProperty("AntennaHeight")) / 2;
		return new Point(x, y);
	}
	
	private int getProperty(String key) {
		return simulator.getProperty(key);
	}
	
	/**
	 * returns the id of the reader
	 * 
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * paints the reader
	 * 
	 * @param the graphic representation of the component
	 */
	protected void paintComponent(Graphics g) {
		icon.paintIcon(this, g, 0, 0);
		g.setColor(Color.BLACK);
		g.setFont(new Font(simulator.getProperties().getProperty("ReaderLabelFont"), 0, simulator.getProperty("ReaderLabelSize")));
		g.drawString(id, (18 - id.length()) * 9 / 2, simulator.getProperty("ReaderHeight"));
	}

	public void addAntenna(Antenna antenna) {
		antennas.put(antenna.getId(), antenna);
	}
	
	public void removeAntenna(Antenna antenna) {
		// remove cable
		simulator.removeFromJLayeredPane(antenna.getCable());
		
		// remove antenna
		simulator.removeFromJLayeredPane(antenna);
		antennas.remove(antenna.getId());
	}
	
	public Antenna getAntenna(String id) {
		return (Antenna)antennas.get(id);
	}
	
	public TreeMap getAntennas() {
		return antennas;
	}

	public void checkTag(Tag tag) {
		Iterator antennaIt = antennas.values().iterator();
		while (antennaIt.hasNext()) {
			((Antenna)antennaIt.next()).checkTag(tag, this);
		}
	}

}