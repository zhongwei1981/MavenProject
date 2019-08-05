package CommonTools;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
	private String _strURI = "";
	private static long _sLine = 0;

	private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public Log(String strURI) {
		_strURI = strURI;
	}

	public void d(String str, Object... args) {
		String prefix = String.format(df.format(new Date()) + ": [%d - Debug] %s: ", _sLine++, _strURI);
		System.out.println(String.format(prefix + str, args));
	}

	public void e(String str, Object... args) {
		String prefix = String.format(df.format(new Date()) + ": [%d - ERROR] %s: ", _sLine++, _strURI);
		System.out.println(String.format(prefix + str, args));
	}

	public void e(Exception e) {
		e(e.toString());
		// e.printStackTrace();
	}
}
