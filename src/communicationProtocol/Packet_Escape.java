package communicationProtocol;

public class Packet_Escape {
	public String socurcewords;
	String Identification_before_7e = "7e";
	String Identification_after_7e = "7d02";
	String Identification_before_7d = "7d";
	String Identification_after_7d = "7d01";

	public Packet_Escape(String socurcewords) {
		this.socurcewords = socurcewords;
	}

	public String toEscape() {
		String words = this.socurcewords;
		if (words.contains(Identification_after_7e)) {
			words.replace(Identification_after_7e, Identification_before_7e);
		} else if (words.contains(Identification_after_7d)) {
			words.replace(Identification_after_7d, Identification_before_7d);
		}

		return words;
	}

	public String getSocurcewords() {
		return socurcewords;
	}

	public void setSocurcewords(String socurcewords) {
		this.socurcewords = socurcewords;
	}

}
