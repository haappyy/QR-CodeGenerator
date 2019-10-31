package com.github.haappyy.qrcodegenerator;

import java.io.ByteArrayOutputStream;

import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.javase.QRCode;

public class QrCodeGenerator {
	
	private ImageType imageType;
	private String charset;
	
	public QrCodeGenerator(ImageType imageType, String charset) {
		this.imageType = imageType;
		this.charset = charset;
	}
	
	public byte[] generateCode(String inputText) {
		ByteArrayOutputStream stream = QRCode.from(inputText)
				.to(imageType)
				.withCharset(charset).stream();
		return stream.toByteArray();
	}

}
