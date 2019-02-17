package data;

import communicationProtocol.DataBase;

public class JT808_Headers {
	public static int HEAD_NUM = 5;
	DataBase[] data = new DataBase[HEAD_NUM];
	DataBase MessageID = new DataBase(1,0,"消息ID","WORD","");
	DataBase Messageattribute = new DataBase(2,2,"消息体属性","WORD","");
	DataBase PhoneNumber = new DataBase(3,4,"终端手机号","BCD[6]","根据安装后终端自身的手机号转换。手机号不足 12位，则在前补充数字，大陆手机号补充数字 0，港澳台则根据其区号进行位数补充。");
	DataBase SerialNumber = new DataBase(4,10,"消息流水号","WORD","按发送顺序从 0 开始循环累加");
	DataBase MessagePackage = new DataBase(5,12,"消息包封装项","","如果消息体属性中相关标识位确定消息分包处理，则该项有内容，否则无该项");
	public DataBase[] getHeaderRule() {
		this.data[0]= this.MessageID;
		this.data[1]=this.Messageattribute;
		this.data[2]=this.PhoneNumber;
		this.data[3]=this.SerialNumber;
		this.data[4]=this.MessagePackage;
		return data;
	}
}
