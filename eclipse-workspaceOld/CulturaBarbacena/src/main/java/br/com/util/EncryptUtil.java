package br.com.util;

import com.google.common.hash.Hashing;
import java.nio.charset.StandardCharsets;

public class EncryptUtil {
	/**
	 * Uso Guava Library para fazer hash da senha, evitar codigos grandes!
	 */
	public static String sha256(String senha) {
		return Hashing.sha256().hashString(senha, StandardCharsets.UTF_8).toString();
	}
}
