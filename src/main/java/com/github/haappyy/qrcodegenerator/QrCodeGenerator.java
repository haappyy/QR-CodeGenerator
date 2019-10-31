package com.github.haappyy.qrcodegenerator;

import java.io.ByteArrayOutputStream;

import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.javase.QRCode;

public class QrCodeGenerator {

	private ImageType imageType;
	private String charset;

	/**
	 * The qr code generate needs to know which image type should be used and which
	 * charset should be used to convert the input string into bytes.
	 * 
	 * @param imageType for example PNG,JPG...
	 * @param charset   the charset of the input string
	 */
	public QrCodeGenerator(ImageType imageType, String charset) {
		this.imageType = imageType;
		this.charset = charset;
	}

	/**
	 * Generates a qr code as an image byte array. The image type is set in the
	 * constructor.
	 * 
	 * @param inputText
	 * @return the bytes of the resulting image
	 */
	public byte[] generateCode(String inputText) {
		ByteArrayOutputStream stream = QRCode.from(inputText).to(imageType).withCharset(charset).stream();
		return stream.toByteArray();
	}

}
