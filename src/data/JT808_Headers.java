package data;

import communicationProtocol.DataBase;

public class JT808_Headers {
	public static int HEAD_NUM = 5;
	DataBase[] data = new DataBase[HEAD_NUM];
	DataBase MessageID = new DataBase(1,0,"��ϢID","WORD","");
	DataBase Messageattribute = new DataBase(2,2,"��Ϣ������","WORD","");
	DataBase PhoneNumber = new DataBase(3,4,"�ն��ֻ���","BCD[6]","���ݰ�װ���ն�������ֻ���ת�����ֻ��Ų��� 12λ������ǰ�������֣���½�ֻ��Ų������� 0���۰�̨����������Ž���λ�����䡣");
	DataBase SerialNumber = new DataBase(4,10,"��Ϣ��ˮ��","WORD","������˳��� 0 ��ʼѭ���ۼ�");
	DataBase MessagePackage = new DataBase(5,12,"��Ϣ����װ��","","�����Ϣ����������ر�ʶλȷ����Ϣ�ְ���������������ݣ������޸���");
	public DataBase[] getHeaderRule() {
		this.data[0]= this.MessageID;
		this.data[1]=this.Messageattribute;
		this.data[2]=this.PhoneNumber;
		this.data[3]=this.SerialNumber;
		this.data[4]=this.MessagePackage;
		return data;
	}
}
