package es.upm.aled.lab2.kinematics;
import java.util.ArrayList;
import java.util.List;

import es.upm.aled.lab2.gui.Node;


// - private; + public; () quiere decir que son métodos

// TODO: Implemente la clase

/*
 * Esta clase representa un segmento del exoesqueleto
 * @author teresa
 */
public class Segment {
	
	private double length, angle;
	private List<Segment> children;
	
	/*
	 * @param length longitud del segmento
	 * @param angle
	 */
	
	public Segment(double length, double angle) {
		this.length = length;
		this.angle = angle;
		this.children = new ArrayList<>();
	}
	
	public double getLength() {
		return length;
	}
	
	public double getAngle() {
		return angle;
	}
	
	public void setAngle(double angle) {
		this.angle = angle;
	}
	
	public List<Segment> getChildren() {
		return children;
	}
	
	public void addChild(Segment child) {
		if (!children.contains(child)) // No hace falta poner el this. en este caso
			children.add(child);    // No hace falta poner el this. en este caso
	}
	
}
