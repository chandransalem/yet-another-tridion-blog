package com.sdltridion.contentmanager.coreservice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.6 in JDK 6 Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "CoreService2011", targetNamespace = "http://www.sdltridion.com/ContentManager/CoreService", wsdlLocation = "http://t2011sp1hr1.playground/webservices/CoreService2011.svc?wsdl")
public class CoreService2011 extends Service {

	private final static URL CORESERVICE2011_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(com.sdltridion.contentmanager.coreservice.CoreService2011.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.sdltridion.contentmanager.coreservice.CoreService2011.class.getResource(".");
			url = new URL(baseUrl, "http://t2011sp1hr1.playground/webservices/CoreService2011.svc?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://t2011sp1hr1.playground/webservices/CoreService2011.svc?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		CORESERVICE2011_WSDL_LOCATION = url;
	}

	public CoreService2011(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public CoreService2011() {
		super(CORESERVICE2011_WSDL_LOCATION, new QName("http://www.sdltridion.com/ContentManager/CoreService",
				"CoreService2011"));
	}

	/**
	 * 
	 * @return returns ICoreService
	 */
	@WebEndpoint(name = "basicHttp")
	public ICoreService getBasicHttp() {
		return super.getPort(new QName("http://www.sdltridion.com/ContentManager/CoreService", "basicHttp"),
				ICoreService.class);
	}

	/**
	 * 
	 * @param features
	 *            A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy. Supported features not in
	 *            the <code>features</code> parameter will have their default values.
	 * @return returns ICoreService
	 */
	@WebEndpoint(name = "basicHttp")
	public ICoreService getBasicHttp(WebServiceFeature... features) {
		return super.getPort(new QName("http://www.sdltridion.com/ContentManager/CoreService", "basicHttp"),
				ICoreService.class, features);
	}

	/**
	 * 
	 * @return returns IStreamDownload
	 */
	@WebEndpoint(name = "streamDownload_basicHttp")
	public IStreamDownload getStreamDownloadBasicHttp() {
		return super.getPort(new QName("http://www.sdltridion.com/ContentManager/CoreService",
				"streamDownload_basicHttp"), IStreamDownload.class);
	}

	/**
	 * 
	 * @param features
	 *            A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy. Supported features not in
	 *            the <code>features</code> parameter will have their default values.
	 * @return returns IStreamDownload
	 */
	@WebEndpoint(name = "streamDownload_basicHttp")
	public IStreamDownload getStreamDownloadBasicHttp(WebServiceFeature... features) {
		return super.getPort(new QName("http://www.sdltridion.com/ContentManager/CoreService",
				"streamDownload_basicHttp"), IStreamDownload.class, features);
	}

	/**
	 * 
	 * @return returns IStreamUpload
	 */
	@WebEndpoint(name = "streamUpload_basicHttp")
	public IStreamUpload getStreamUploadBasicHttp() {
		return super.getPort(
				new QName("http://www.sdltridion.com/ContentManager/CoreService", "streamUpload_basicHttp"),
				IStreamUpload.class);
	}

	/**
	 * 
	 * @param features
	 *            A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy. Supported features not in
	 *            the <code>features</code> parameter will have their default values.
	 * @return returns IStreamUpload
	 */
	@WebEndpoint(name = "streamUpload_basicHttp")
	public IStreamUpload getStreamUploadBasicHttp(WebServiceFeature... features) {
		return super.getPort(
				new QName("http://www.sdltridion.com/ContentManager/CoreService", "streamUpload_basicHttp"),
				IStreamUpload.class, features);
	}

}
