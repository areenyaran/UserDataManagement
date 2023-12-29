package edu.najah.cap.data.exportservice.converting;

import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserProfilePdfConverter implements PdfConverter {
    private static final Logger logger = LoggerFactory.getLogger(UserProfilePdfConverter.class);
    @Override
    public void convertToPdf(Document document, String outputPath) {
        // Implementation to convert user profile to PDF
      logger.info("Converting user profile to PDF");
    }
}
