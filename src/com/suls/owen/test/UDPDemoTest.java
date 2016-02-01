package com.suls.owen.test;

import com.suls.owen.UDPDemo;

import org.junit.Test;

public class UDPDemoTest {

	@Test
	public final void UDPDemoTestClient() throws Exception {
		
		String[] args = { "client" };
		
		UDPDemo.main(args);
	}
	
	@Test
	public final void UDPDemoTestServer() throws Exception {
		
		String[] args = { "server" };
		
		UDPDemo.main(args);
	}
}
