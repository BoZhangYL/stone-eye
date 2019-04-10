package UI;

import util.BCD8421Operater;
import util.HexStringUtils;
import util.JT808ProtocolUtils;

public class StoneUI {
	public static void main(String args[]) {
		BCD8421Operater obr = new BCD8421Operater();
		String in = "7E0F40007E020171227E06001656F96E0104AE7E";
		HexStringUtils hu =new HexStringUtils();
		
		byte[] inb = obr.string2Bcd(in);
		System.out.print(inb[1]+"\n");
		for (int j=0;j<inb.length;j++) {
			System.out.print(inb[j]);
		}
		System.out.print("\n");
		JT808ProtocolUtils jt808head = new JT808ProtocolUtils();
		byte[] coinb = null;
		try {
			coinb = jt808head.doEscape4Receive(inb, 0, inb.length);
			for(int i =0 ;i<coinb.length;i++) {
				System.out.print(coinb[i]);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(obr.bcd2String(coinb));
		
	}
}
