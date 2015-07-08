/**
 * 
 * Copyright (C) 2015 Roberto Dominguez Estrada and Juan Carlos Sedano Salas
 *
 * This material is provided "as is", with absolutely no warranty expressed
 * or implied. Any use is at your own risk.
 *
 */
package io.github.nixtabyte.jtelebot.client;



import io.github.nixtabyte.jtelebot.request.TelegramRequest;
import io.github.nixtabyte.jtelebot.response.json.TelegramResponse;
public interface RequestHandler {
	
	public TelegramResponse<?> sendRequest(final TelegramRequest telegramRequest);

}