package com.itextpdf;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.utils.PdfUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) throws DocumentException, FileNotFoundException {
        PdfWriter writer;
        Font bigFont = PdfUtils.createFont(14, Font.NORMAL, BaseColor.BLACK);
        Paragraph title = PdfUtils.createParagraph("测试pdf", bigFont);
        Document document=new Document();
        writer = PdfWriter.getInstance(document, new FileOutputStream("hello123.Pdf"));
        document.open();
        PdfPCell cell = new PdfPCell(new Paragraph("hellowterytuiop[]'kl;jhgfdasdfgfghjlk;'l" +
                "alsdgfkvjh;ljl;xfcjgvhkbjln;qwertyuiop;lkjhgfdsazxcvbnmmmmmmmmmmmkjhgfdsxcvbnpoiouerwfuigto" +
                "ayrefgegijopokhjhgsgsasfdhfgjkhjlk;jhgxzxfcvbknlsdf;bi[s[ghb'wbwhrauyfiuqwgiaugfvha'rvjdxfcgvhbjnkml,;,klj我nbh" ,bigFont));
        Rectangle rectangle = new Rectangle(PageSize.A4);

        document.add(title);
        PdfPTable pdfPTable=new PdfPTable(1);
        pdfPTable.addCell(cell);
        PdfPTable pdfPTable0=new PdfPTable(1);
        document.add(pdfPTable);
        document.add(pdfPTable0);
        PdfPTable pdfPTable1=new PdfPTable(3);
        String str[] =new String[3];
        str[0]="1";
        str[1]="2";
        str[2]="3";
        PdfPCell cell1 = new PdfPCell(new Paragraph("hello" ,bigFont));
        PdfPCell cell2 = new PdfPCell(new Paragraph("hello" ,bigFont));
        PdfPCell cell3 = new PdfPCell(new Paragraph("hello" ,bigFont));
       /* pdfPTable1.addCell(cell1);
        pdfPTable1.addCell(cell2);
        pdfPTable1.addCell(cell3);*/
        document.add(pdfPTable1);


        if(document!=null)document.close();
        if (writer!=null) writer.close();
    }
}
