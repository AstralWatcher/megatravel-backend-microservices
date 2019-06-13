package com.megatravel.zuulsvr.utils;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties.ZuulRoute;
import org.springframework.stereotype.Component;

@Component
public class StringUtilities {

	public static final String SOAP_PORT = "soap-port";
	public static final String SOAP_PREFIX = "/services";
	public static final String WSDL_PORT = "soap:address location";
	public static final String WSDL_SUFFIX = "?wsdl";
	public static final String INT_PREFIX = "<int:";
	
	@Autowired
	private ZuulProperties properties;
	
	public String getSoapServiceEndpointFromUrl(String url) {
		String endpoint = url.substring(url.indexOf(StringUtilities.SOAP_PREFIX));
		return endpoint;
	}

	public String getZuulPathFromURL(String url) {
		String route = url.substring(0, url.indexOf(StringUtilities.SOAP_PREFIX));
		route = route.substring(route.lastIndexOf("/") + 1);
		return "/" + route + "/**";
	}

	public String getServiceNameFromRoute(String path) {
		Collection<ZuulRoute> routes = properties.getRoutes().values();
		for(ZuulRoute route : routes) {
			if(route.getPath().equals(path)) {
				return route.getServiceId();
			}
		}
		return null;
	}

	public String getFullURL(HttpServletRequest request) {
		StringBuilder requestURL = new StringBuilder(request.getRequestURL().toString());
		String queryString = request.getQueryString();
		if (queryString == null) {
			return requestURL.toString();
		} else {
			return requestURL.append('?').append(queryString).toString();
		}
	}

	public String createLocationFromURL(String url) {
		String location = url.substring(0, url.indexOf(WSDL_SUFFIX));
		return location;
	}
	
	public String replaceWebServicePort(String wsdl, String newLocation) {
		int elementIndex = wsdl.indexOf(WSDL_PORT);
		int locationBeginIndex = wsdl.indexOf('"', elementIndex);
		int locationEndIndex = wsdl.indexOf('"', locationBeginIndex + 1);
		return wsdl.replace(wsdl.substring(locationBeginIndex + 1, locationEndIndex), newLocation);
	}
	
	public String returnSoapAction(String url, String soap) {
		int elementIndex = soap.indexOf(INT_PREFIX);
		int locationBeginIndex = soap.indexOf(':', elementIndex);
		int locationEndIndex = soap.indexOf('>', elementIndex);
		return url + "#" + soap.substring(locationBeginIndex + 1, locationEndIndex);
	}
	
}