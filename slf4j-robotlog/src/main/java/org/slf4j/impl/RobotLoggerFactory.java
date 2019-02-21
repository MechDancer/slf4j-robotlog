package org.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

class RobotLoggerFactory implements ILoggerFactory {
	@Override
	public Logger getLogger(String name) {
		return new RobotLogger(name);
	}
}
