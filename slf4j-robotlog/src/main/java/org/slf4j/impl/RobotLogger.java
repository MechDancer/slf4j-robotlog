package org.slf4j.impl;

import com.qualcomm.robotcore.util.RobotLog;

import org.slf4j.helpers.MarkerIgnoringBase;

class RobotLogger extends MarkerIgnoringBase {

	RobotLogger(String name) {
		this.name = name;
	}

	@Override
	public boolean isTraceEnabled() {
		return true;
	}

	@Override
	public void trace(String msg) {
		debug(msg);
	}

	@Override
	public void trace(String format, Object arg) {
		debug(format, arg);
	}

	@Override
	public void trace(String format, Object arg1, Object arg2) {
		debug(format, arg1, arg2);
	}

	@Override
	public void trace(String format, Object... arguments) {
		debug(format, arguments);
	}

	@Override
	public void trace(String msg, Throwable t) {
		debug(msg, t);
	}

	@Override
	public boolean isDebugEnabled() {
		return true;
	}

	@Override
	public void debug(String msg) {
		RobotLog.dd(name, msg);
	}

	@Override
	public void debug(String format, Object arg) {
		RobotLog.dd(name, format, arg);
	}

	@Override
	public void debug(String format, Object arg1, Object arg2) {
		RobotLog.dd(name, format, arg1, arg2);
	}

	@Override
	public void debug(String format, Object... arguments) {
		RobotLog.dd(name, format, arguments);
	}

	@Override
	public void debug(String msg, Throwable t) {
		RobotLog.dd(name, msg, t);
	}

	@Override
	public boolean isInfoEnabled() {
		return true;
	}

	@Override
	public void info(String msg) {
		RobotLog.ii(name, msg);
	}

	@Override
	public void info(String format, Object arg) {
		RobotLog.ii(name, format, arg);
	}

	@Override
	public void info(String format, Object arg1, Object arg2) {
		RobotLog.ii(name, format, arg1, arg2);
	}

	@Override
	public void info(String format, Object... arguments) {
		RobotLog.ii(name, format, arguments);
	}

	@Override
	public void info(String msg, Throwable t) {
		RobotLog.ii(name, msg, t);
	}

	@Override
	public boolean isWarnEnabled() {
		return true;
	}

	@Override
	public void warn(String msg) {
		RobotLog.ww(name, msg);
	}

	@Override
	public void warn(String format, Object arg) {
		RobotLog.ww(name, format, arg);
	}

	@Override
	public void warn(String format, Object... arguments) {
		RobotLog.ww(name, format, arguments);
	}

	@Override
	public void warn(String format, Object arg1, Object arg2) {
		RobotLog.ww(name, format, arg1, arg2);
	}

	@Override
	public void warn(String msg, Throwable t) {
		RobotLog.ww(name, msg, t);
	}

	@Override
	public boolean isErrorEnabled() {
		return true;
	}

	@Override
	public void error(String msg) {
		RobotLog.ee(name, msg);
	}

	@Override
	public void error(String format, Object arg) {
		RobotLog.ee(name, format, arg);
	}

	@Override
	public void error(String format, Object arg1, Object arg2) {
		RobotLog.ee(name, format, arg1, arg2);
	}

	@Override
	public void error(String format, Object... arguments) {
		RobotLog.ee(name, format, arguments);
	}

	@Override
	public void error(String msg, Throwable t) {
		RobotLog.ee(name, msg, t);
	}
}
