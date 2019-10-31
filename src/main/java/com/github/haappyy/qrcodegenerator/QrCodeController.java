package com.github.haappyy.qrcodegenerator;

import java.nio.charset.StandardCharsets;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import net.glxn.qrgen.core.image.ImageType;

@Slf4j
@RestController
@RequestMapping(value = "/")
public class QrCodeController {
	
	@ResponseBody
	@RequestMapping(value = "/qrcode", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
	public byte[] getQrCode(@RequestParam(name = "inputText") String inputText) {
	    QrCodeGenerator qrCodeGenerator = new QrCodeGenerator(ImageType.PNG, StandardCharsets.UTF_8.name());
	    return qrCodeGenerator.generateCode(inputText);
	}

}
