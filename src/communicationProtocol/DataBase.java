package communicationProtocol;

public class DataBase {
	public int Number;
	public int StartByte;
	public String Name;
	public String DataType;
	public String Description;

	public DataBase(int Number, int StartByte, String Name, String DataType, String Description) {
		this.Number = Number;
		this.StartByte = StartByte;
		this.Name = Name;
		this.DataType = DataType;
		this.Description = Description;
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	public int getStartByte() {
		return StartByte;
	}

	public void setStartByte(int startByte) {
		StartByte = startByte;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDataType() {
		return DataType;
	}

	public void setDataType(String dataType) {
		DataType = dataType;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

}
