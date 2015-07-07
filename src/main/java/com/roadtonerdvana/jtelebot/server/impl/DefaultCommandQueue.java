/**
 * 
 * Copyright (C) 2015 Roberto Dominguez Estrada and Juan Carlos Sedano Salas
 *
 * This material is provided "as is", with absolutely no warranty expressed
 * or implied. Any use is at your own risk.
 *
 */
package com.roadtonerdvana.jtelebot.server.impl;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.log4j.Logger;

import com.roadtonerdvana.jtelebot.server.Command;
import com.roadtonerdvana.jtelebot.server.CommandQueue;

public class DefaultCommandQueue implements CommandQueue {

	private static final Logger LOG = Logger.getLogger(DefaultCommandQueue.class);

	private Queue<Command> commandQueue;

	public DefaultCommandQueue() {
		commandQueue = new ConcurrentLinkedQueue<Command>();
	}

	@Override
	public void add(Command command) {
		commandQueue.add(command);
	}

	@Override
	public Command poll() {
		return commandQueue.poll();
	}
	
	@Override
	public boolean isEmpty() {
		return commandQueue.isEmpty();
	}

	@Override
	public int size() {
		return commandQueue.size();
	}

	@Override
	public boolean contains(Command command) {
		return commandQueue.contains(command);
	}
	
	@Override
	public String toString() {
		return commandQueue.toString();
	}

}
