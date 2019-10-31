package com.github.haappyy.qrcodegenerator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import net.glxn.qrgen.core.image.ImageType;

@SpringBootTest
class QrCodegeneratorApplicationTests {

	@Test
	void qrCodeGenerator() {
		byte[] correctbyteArray = { -119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 125, 0, 0,
				0, 125, 1, 0, 0, 0, 0, -89, -5, 81, -120, 0, 0, 0, -95, 73, 68, 65, 84, 120, -38, -19, -43, 59, 14,
				-128, 48, 12, 3, 80, -33, -64, -9, -65, 101, 70, -74, -32, 4, 9, -119, 110, 117, 96, -125, -113, 74,
				-33, 16, -87, 78, 36, -112, -49, -21, -64, 15, 47, 64, 0, -56, -120, 94, 108, -56, -38, 70, -12, -105,
				11, 1, 109, 89, -53, 8, -70, -18, 16, 116, -78, 25, -76, -27, 114, -38, 77, 64, 85, 92, 82, -33, -124,
				-70, 98, -19, -2, 38, 4, -87, -120, -95, -101, 54, 36, 73, -24, 101, -6, 16, 96, 55, 27, 119, -56, 14,
				92, 49, -125, -16, 33, -21, 104, -84, -46, 54, 116, -56, -111, -64, 35, -11, 61, -24, 102, 83, -3, 38,
				125, -88, 71, 67, -57, -124, 15, -107, -112, 122, -99, -32, 8, -86, -94, -26, 102, 4, 26, 26, 53, 106,
				0, 87, -58, 26, 62, -8, -128, 30, 55, 109, 105, -61, -1, -113, -6, 26, 78, 59, -50, 84, -20, -2, 31,
				-112, -44, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126 };
		QrCodeGenerator qrCodeGenerator = new QrCodeGenerator(ImageType.PNG, StandardCharsets.UTF_8.name());
		byte[] qrCode = qrCodeGenerator.generateCode("Test");
		assertTrue(Arrays.equals(correctbyteArray, qrCode));
	}

}
