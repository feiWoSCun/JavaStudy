package com.itextpdf.document;

import com.alibaba.fastjson2.JSON;
import com.itextpdf.entity.StuInfo;
import com.itextpdf.entity.UserData;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.utils.PdfUtils;
import com.itextpdf.utils.ReflectUtils;
import org.apache.commons.lang3.StringEscapeUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CatToTiger {
   public static void creatPdf(List[] lists) throws FileNotFoundException, DocumentException {
        Document document = null;
        PdfWriter writer = null;
        try {
        String[] annotations=null;
        //创建纵向文件
        document = PdfUtils.createPortraitDocument();
        //建立一个书写器（内存流方式）
        writer = PdfWriter.getInstance(document, new FileOutputStream("hello1.Pdf"));
        //打开文件
        document.open();
        //添加字体样式
        Font bigFont = PdfUtils.createFont(14, Font.NORMAL, BaseColor.BLACK);
        Font blueFont = PdfUtils.createFont(10, Font.NORMAL, BaseColor.BLACK);
        for (int i = 0; i < lists.length; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            //得到字段名6
            if (lists[i].get(1).getClass().getSimpleName().equals("UserData")) {
                annotations = ReflectUtils.getAnnotations(UserData.class);
            }
            if (lists[i].get(1).getClass().getSimpleName().equals("StuInfo")) {
                annotations = ReflectUtils.getAnnotations(StuInfo.class);
            }
            for (int i1 = 0; i1 < lists[i].size(); i1++) {
                stringBuffer.append(lists[i].get(i1).toString());
            }
            stringBuffer.toString();
            // List<Map<String, Object>> mapList = (List) JSON.parseArray(StringEscapeUtils.unescapeHtml4(list));

            //段落内容
            Paragraph title = PdfUtils.createParagraph("测试pdf", bigFont);
            //文字居中显示
            title.setAlignment(Element.ALIGN_CENTER);
            //添加段落内容
            document.add(title);
            //创建表格列数
            PdfPTable table = PdfUtils.createPdfPTable(annotations.length);
            //创建表头
            PdfUtils.createHeader(document, table, annotations, bigFont);
            //填充数据
            PdfUtils.dataProcessing(document, table, stringBuffer, blueFont,annotations.length);
        }
        }
        catch ( DocumentException e){}
        finally {
            if(document!=null)document.close();
            if (writer!=null) writer.close();
        }
    }
}
