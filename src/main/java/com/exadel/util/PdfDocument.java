package com.exadel.util;

import com.exadel.entity.Statistics;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

/**
 * Created by Вадим on 06.08.2014.
 */
public class PdfDocument {


    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 20,
            Font.BOLD);
    private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.NORMAL, BaseColor.RED);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.BOLD);

    public PdfDocument(String FILE, Statistics statistics) {

        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(FILE));
            document.open();
            addMetaData(document);
            createTables(document,statistics);

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



    private static void createTables(Document document,Statistics statistics)
            throws BadElementException {

        int temp=0;
     for(int j=0;j<statistics.getHeaders().size();j++) {

          Paragraph paragraph=new Paragraph("Statistic on "+statistics.getHeaders().get(j),catFont);
           paragraph.setAlignment(Element.ALIGN_CENTER);
           addEmptyLine(paragraph,1);
         try {
             document.add(paragraph);
         } catch (DocumentException e) {
             e.printStackTrace();
         }

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


         for (int i = temp; i<statistics.getFields().size() && !statistics.getFields().get(i).toString().equals("Total ") ; i++) {

             table.addCell(statistics.getFields().get(i));
             table.addCell(statistics.getValues().get(i));
             table.addCell(statistics.getPercents().get(i));
             temp=i;

         }
         temp++;
         table.addCell(statistics.getFields().get(temp));
         table.addCell(statistics.getValues().get(temp));
         table.addCell(statistics.getPercents().get(temp));
         temp++;



         try {
             document.add(table);
         } catch (DocumentException e) {
             e.printStackTrace();
         }
     }
    }
    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }


}
