
package com.ghyll.dp.absfp;

import com.ghyll.dp.factorypattern.Shape;

public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}
