/**
 * 
 * Copyright (C) 2015 Roberto Dominguez Estrada and Juan Carlos Sedano Salas
 *
 * This material is provided "as is", with absolutely no warranty expressed
 * or implied. Any use is at your own risk.
 *
 */
package com.roadtonerdvana.jtelebot.server;

import com.roadtonerdvana.jtelebot.client.RequestHandler;
import com.roadtonerdvana.jtelebot.response.json.Message;

public class DummyCommandFactoryImpl implements CommandFactory{

	@Override
	public Command createCommand(Message message, RequestHandler requestHandler) {
		return new DummyCommandImpl(message,requestHandler);
	}

}
