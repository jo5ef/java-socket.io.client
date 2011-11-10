package com.clwillingham.socket.io;

import org.json.JSONArray;
import org.json.JSONException;

public interface AckCallback {
	public void callback(JSONArray data) throws JSONException;
}
