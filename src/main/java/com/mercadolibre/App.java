package com.mercadolibre;

import com.mercadolibre.restclient.Response;
import com.mercadolibre.restclient.RestClient;
import com.mercadolibre.restclient.exception.RestException;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		int status = -1;
		byte[] responseBuffer = null;
		try {
			Response response = RestClient.getDefault().get("https://api.mercadolibre.com/sites/MLA");

			status = response.getStatus();
			responseBuffer = response.getBytes();
		} catch (RestException e) {
			e.printStackTrace();
		}

		System.out.println("Status: " + status);
		System.out.println(String.valueOf(responseBuffer));
	}
}
