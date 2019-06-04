package client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import classes.ProductCatalogServiceLocator;

public class soapClient {

	public static void main(String[] args) throws RemoteException, ServiceException {
		// TODO Auto-generated method stub
		ProductCatalogServiceLocator locator = new ProductCatalogServiceLocator();

		/*//adding
		locator.getProductCatalogPort().addProducts("chips");
		*/
		//featching
		String[] products = locator.getProductCatalogPort().fetchProducts();
		
		//Print
		System.out.println("Total Products: "+ products.length);
		int j=0;
		for(int i=0; i<products.length; i++) {
			j = i+1;
		System.out.println("Product "+j+":= "+products[i]);
	}

	}
}
