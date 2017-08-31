package test2;

public class niuke0831 {
	public String replaceSpace(StringBuffer str) {

		String sti = str.toString();
		char[] strChar = sti.toCharArray();
		StringBuffer stb = new StringBuffer();
		for (int i = 0; i < strChar.length; i++) {
			if (strChar[i] == ' ') {
				stb.append("%20");
			} else {
				stb.append(strChar[i]);
			}
		}
		return stb.toString();
	}

}
