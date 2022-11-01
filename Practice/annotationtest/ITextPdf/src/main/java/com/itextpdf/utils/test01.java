package com.itextpdf.utils;

import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

public class test01 {
    public static void main(String[] args) throws Exception {
        creatPdfAdd();

        PdfWriter writer;
        Font bigFont = PdfUtils.createFont(14, Font.NORMAL, BaseColor.BLACK);
        Paragraph title = PdfUtils.createParagraph("测试pdf", bigFont);
        Document document = new Document();
        writer = PdfWriter.getInstance(document, new FileOutputStream("hello123.Pdf"));
        document.open();
        PdfPCell cell = new PdfPCell(new Paragraph("hellowterytuiop[]'kl;jhgfdasdfgfghjlk;'l" +
                "alsdgfkvjh;ljl;xfcjgvhkbjln;qwertyuiop;lkjhgfdsazxcvbnmmmmmmmmmmmkjhgfdsxcvbnpoiouerwfuigto" +
                "ayrefgegijopokhjhgsgsasfdhfgjkhjlk;jhgxzxfcvbknlsdf;bi[s[ghb'wbwhrauyfiuqwgiaugfvha'rvjdxfcgvhbjnkml,;,klj我nbh", bigFont));
        Rectangle rectangle = new Rectangle(PageSize.A4);

        document.add(title);
        PdfPTable pdfPTable = new PdfPTable(1);
        pdfPTable.addCell(cell);
        PdfPTable pdfPTable0 = new PdfPTable(1);
        document.add(pdfPTable);
        document.add(pdfPTable0);
        PdfPTable pdfPTable1 = new PdfPTable(3);
        String str[] = new String[3];
        str[0] = "1";
        str[1] = "2";
        str[2] = "3";
        PdfPCell cell1 = new PdfPCell(new Paragraph("hello", bigFont));
        PdfPCell cell2 = new PdfPCell(new Paragraph("hello", bigFont));
        PdfPCell cell3 = new PdfPCell(new Paragraph("hello", bigFont));
       /* pdfPTable1.addCell(cell1);
        pdfPTable1.addCell(cell2);
        pdfPTable1.addCell(cell3);*/
        document.add(pdfPTable1);


        if (document != null) document.close();
        if (writer != null) writer.close();

    }




        public static void creatPdfAdd() throws  Exception{
        // 利用模板生成pdf
        URL template = Thread.currentThread().getContextClassLoader().getResource("template");
        String str=template.getPath() + "/test.pdf";
        //   InputStream inputStream=new FileInputStream(template.getPath());
        System.out.println("D:/pdftest" + "/test.pdf");
       // String str = "D:/pdftest" + "/test.pdf";
        Map<String, String> map = new HashMap<>();
        map.put("phone", "Java");
        String newPDFPath = template.getPath() + "/hello123456.pdf";
        PdfReader reader;
        FileOutputStream out;
        FileOutputStream out1;

        ByteArrayOutputStream bos;
        PdfStamper stamper;
        out = new FileOutputStream(newPDFPath);// 输出流
        out1 = out;
        reader = new PdfReader(str);// 读取pdf模板
        bos = new ByteArrayOutputStream();
        stamper = new PdfStamper(reader, bos);
        AcroFields form = stamper.getAcroFields();

        // 给表单添加中文字体 这里采用系统字体。不设置的话，中文可能无法显示
        BaseFont bf = BaseFont.createFont();
        form.addSubstitutionFont(bf);

        //遍历map装入数据
        for (Entry<String, String> entry : map.entrySet()) {
            form.setField(entry.getKey(), entry.getValue());
            //System.out.println("插入PDF数据---->  key= " + entry.getKey() + " and value= " + entry.getValue());
        }
        stamper.setFormFlattening(false);// 如果为false那么生成的PDF文件还能编辑，一定要设为true
        stamper.close();
            Document doc = new Document();
            PdfCopy copy = new PdfCopy(doc, out);
            doc.open();
            for (int i = 1; i < 4; i++) {
                PdfImportedPage importPage = copy.getImportedPage(new PdfReader(bos.toByteArray()), i);
                copy.addPage(importPage);
            }


          /*  doc.newPage();
            PdfPTable pdfPTable=new PdfPTable(1);
            Font smallFont = PdfUtils.createFont(12, Font.NORMAL, BaseColor.BLACK);
            Paragraph title = PdfUtils.createParagraph("测试pdf啦啦啦啦啦", smallFont);
            doc.add(title);
            PdfPCell pdfPCell = new PdfPCell(new Paragraph("java", smallFont));
            pdfPTable.addCell(pdfPCell);
            doc.add(pdfPTable);*/
            doc.newPage();
           /* doc.newPage();*/
           /* doc.newPage();
            PdfPTable pdfPTable=new PdfPTable(1);
            Font smallFont = PdfUtils.createFont(12, Font.NORMAL, BaseColor.BLACK);
            Paragraph title = PdfUtils.createParagraph("测试pdf啦啦啦啦啦", smallFont);
            doc.add(title);
            PdfPCell pdfPCell = new PdfPCell(new Paragraph("java", smallFont));
            pdfPTable.addCell(pdfPCell);
            doc.add(pdfPTable);*/

            doc.close();

        }
}
/*
            Document doc = new Document();
      PdfWriter  writer = PdfWriter.getInstance(doc, new FileOutputStream("hello1.Pdf"));
            PdfCopy copy = new PdfCopy(doc, out);
            doc.open();
            PdfImportedPage importPage = copy.getImportedPage(new PdfReader(bos.toByteArray()), 1);
            copy.addPage(importPage);
        PdfPTable pdfPTable=new PdfPTable(1);
        Font smallFont = PdfUtils.createFont(12, Font.NORMAL, BaseColor.BLACK);
        PdfPCell pdfPCell = new PdfPCell(new Paragraph("java", smallFont));
        pdfPTable.addCell(pdfPCell);
        doc.add(pdfPTable);
        doc.close();
        writer.close();*/



//	//测试
//	public static void main(String[] args) {
//		Map<String,Object> map=new HashMap<>();
//		map.put("jobtitle", "Java工程师面试报告");
//		map.put("name", "李四");
//		map.put("gender", "男");
//		map.put("age", "22");
//		/*map.put("phone", "151515151");
//		map.put("marriage", "未婚");
//		map.put("email", "1294608448@qq.com");*/
//		map.put("jobyear", "10");
//		map.put("education", "院士");
//		map.put("location", "天堂");
//
//		System.out.println(map);
//		interviewReportPDF(map);
//
//	}
/*public static void interviewReportPDF(Map<String, String> map) {

    // 模板路径
    String templatePath = UtilPath.getWEB_INF() + "pdf/面试报告模板.pdf";
    // 生成的新文件路径
    String newPDFPath ="F:/pdf/interviewReport/"+map.get("phone")+"-"+FileNameUtil.newFileName()+".pdf";
    PdfReader reader;
    FileOutputStream out;
    ByteArrayOutputStream bos;
    PdfStamper stamper;
    try {
        out = new FileOutputStream(newPDFPath);// 输出流
        reader = new PdfReader(templatePath);// 读取pdf模板
        bos = new ByteArrayOutputStream();
        stamper = new PdfStamper(reader, bos);
        AcroFields form = stamper.getAcroFields();

        // 给表单添加中文字体 这里采用系统字体。不设置的话，中文可能无法显示
        BaseFont bf = BaseFont.createFont(UtilPath.getRootPath() + "fonts/simsun.ttc,0", BaseFont.IDENTITY_H,
                BaseFont.EMBEDDED);
        form.addSubstitutionFont(bf);

        //遍历map装入数据
        for (Entry<String, String> entry : map.entrySet()) {
            form.setField(entry.getKey(), entry.getValue());
            //System.out.println("插入PDF数据---->  key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        stamper.setFormFlattening(true);// 如果为false那么生成的PDF文件还能编辑，一定要设为true
        stamper.close();

        Document doc = new Document();
        PdfCopy copy = new PdfCopy(doc, out);
        doc.open();
        PdfImportedPage importPage = copy.getImportedPage(new PdfReader(bos.toByteArray()), 1);
        copy.addPage(importPage);
        doc.close();

    } catch (IOException e) {

    } catch (DocumentException e) {

    }
        }
    }*/
