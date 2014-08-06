package com.exadel.service.serviceImpl;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 * Created by Вадим on 06.08.2014.
 */
public class PdfDocumentService {


    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 20,
            Font.BOLD);
    private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.NORMAL, BaseColor.RED);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.BOLD);

    public PdfDocumentService(String FILE, ArrayList<String> headers, ArrayList<StatisticsService> listStatistics) {

        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(FILE));
            document.open();
            addMetaData(document);
            for(int i=0;i<listStatistics.size();i++) {
                addContent(document,headers.get(i),listStatistics.get(i));
            }
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addMetaData(Document document) {
        document.addTitle("Statistics on student");
        document.addSubject("Statistics");
        document.addCreator("Exadel");

    }

    private static void addContent(Document document,String header,StatisticsService statistics) throws DocumentException {

        Paragraph paragraph=new Paragraph("Statistic on "+header,catFont);
        paragraph.setAlignment(Element.ALIGN_CENTER);
        addEmptyLine(paragraph,1);


        document.add(paragraph);




        // add a table
        createTable(document, statistics);

    }

    private static void createTable(Document document,StatisticsService statistics)
            throws BadElementException {
        PdfPTable table = new PdfPTable(3);


        PdfPCell c1 = new PdfPCell(new Phrase("Fields"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Values"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Percents"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);
        table.setHeaderRows(1);

        for(int i=0;i<statistics.getFields().size();i++){

            table.addCell(statistics.getFields().get(i));
            table.addCell(statistics.getValues().get(i));
            table.addCell(statistics.getPercents().get(i));
        }

        try {
            document.add(table);
        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }
    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }


}
