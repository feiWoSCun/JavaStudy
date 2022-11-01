package com.itextpdf.utils;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @version V1.0
 * @Description：生成PDF文件
 * @Author: Mr.LJie
 * @Date: 2021/11/30 14:17
 */
public class PdfUtils{

        /**
         * 固定高
         */
        public static float fixedHeight = 27f;
        /**
         * 跨行
         */
        public static int rowSpan = 0;
        /**
         * 跨列
         */
        public static int colSpan = 0;
        /**
         * 左边距
         */
        public static float marginLeft = 20;
        /**
         * 右边距
         */
        public static float marginRight = 20;
        /**
         * 上边距
         */
        public static float marginTop = 20;
        /**
         * 下边距
         */
        public static float marginBottom = 20;

        /***
         * @Description :创建A4纵向文件
         * @param
         * @return com.itextpdf.text.Document
         * @Author Mr.Jie
         * @Date 2021/11/30 14:25
         */
        public static Document createPortraitDocument() {
            //生成pdf
            Document document = new Document();
            // 页面大小
            Rectangle rectangle = new Rectangle(PageSize.A4);
            // 页面背景颜色
            rectangle.setBackgroundColor(BaseColor.WHITE);
            document.setPageSize(rectangle);
            // 页边距 左，右，上，下
            document.setMargins(marginLeft, marginRight, marginTop, marginBottom);
            return document;
        }

        /***
         * @Description :创建A4横向文件
         * @param
         * @return com.itextpdf.text.Document
         * @Author Mr.Jie
         * @Date 2021/11/30 15:42
         */
        public static Document createTransverseDocument() {
            //生成pdf
            Document document = new Document();
            // 页面大小
            Rectangle rectangle = new Rectangle(new RectangleReadOnly(842F, 595F));
            // 页面背景颜色
            rectangle.setBackgroundColor(BaseColor.WHITE);
            document.setPageSize(rectangle);
            // 页边距 左，右，上，下
            document.setMargins(marginLeft, marginRight, marginTop, marginBottom);

            return document;
        }

        /**
         * @param text 段落内容
         * @param font 字体设置
         * @return com.itextpdf.text.Paragraph
         * @Description :创建段落内容
         * @Author Mr.Jie
         * @Date 2021/11/30 14:59
         */
        public static Paragraph createParagraph(String text, Font font) {
            Paragraph elements = new Paragraph(text, font);
            elements.setSpacingBefore(5);
            elements.setSpacingAfter(5);
            return elements;
        }


        /***
         * @Description :创建字体样式
         * @param fontNumber    字号
         * @param fontSize      字体大小
         * @param fontColor     字体颜色
         * @return com.itextpdf.text.Font
         * @Author Mr.Jie
         * @Date 2021/11/30 14:57
         */
        public static Font createFont(int fontNumber, int fontSize, BaseColor fontColor) {
            //中文字体 ----不然中文会乱码
            BaseFont bf = null;
            try {
                bf = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
                return new Font(bf, fontNumber, fontSize, fontColor);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new Font(bf, Font.DEFAULTSIZE, Font.NORMAL, BaseColor.BLACK);
        }

        /***
         * @Description :隐藏表格边框线
         * @param cell  单元格
         * @return void
         * @Author Mr.Jie
         * @Date 2021/11/30 14:57
         */
        public static void disableBorderSide(PdfPCell cell) {
            if (cell != null) {
                cell.disableBorderSide(1);
                cell.disableBorderSide(2);
                cell.disableBorderSide(4);
                cell.disableBorderSide(8);
            }
        }


        /***
         * @Description :创建居中得单元格
         * @param
         * @return com.itextpdf.text.pdf.PdfPCell
         * @Author Mr.Jie
         * @Date 2021/11/30 14:57
         */
        public static PdfPCell createCenterPdfPCell() {
            PdfPCell cell = new PdfPCell();
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setFixedHeight(fixedHeight);
            return cell;
        }

        /***
         * @Description :创建指定文字得单元格
         * @param text      文字内容
         * @param rowSpan   跨行合并单元格
         * @param colSpan   跨列合并单元格
         * @param font      字体
         * @return com.itextpdf.text.pdf.PdfPCell
         * @Author Mr.Jie
         * @Date 2021/11/30 14:50
         */
        public static PdfPCell createCenterPdfPCell(String text, int rowSpan, int colSpan, Font font) {
            PdfPCell cell = new PdfPCell(new Paragraph(text, font));
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell.setFixedHeight(fixedHeight);
            cell.setRowspan(rowSpan);
            cell.setColspan(colSpan);
            return cell;
        }

        /***
         * @Description :表格列数
         * @param len
         * @return com.itextpdf.text.pdf.PdfPTable
         * @Author Mr.Jie
         * @Date 2021/11/30 14:52
         */
        //生成table
        public static PdfPTable createPdfPTable(int len) {
            PdfPTable pdfPTable = new PdfPTable(len);
            //宽度100%填充
            pdfPTable.setWidthPercentage(100);
            return pdfPTable;
        }

        /***
         * @Description :创建表头
         * @param document
         * @param headers
         * @param font
         * @return void
         * @Author Mr.Jie
         * @Date 2021/11/30 15:27
         */
        public static void createHeader(Document document, PdfPTable table, String[] headers, Font font) throws DocumentException {
            for (int i = 0; i < headers.length; i++) {
                //默认不跨行、跨列
                PdfPCell cell = PdfUtils.createCenterPdfPCell(headers[i], rowSpan, rowSpan, font);
                //居中显示
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cell);
            }
            document.add(table);
        }

        /***
         * @Description :数据处理
         * @param document
         * @param table
         * @param font
         * @return void
         * @Author Mr.Jie
         * @Date 2021/11/30 15:32
         */
        public static void dataProcessing(Document document, PdfPTable table, StringBuffer buffer, Font font,int length) throws DocumentException {
            String[] split = buffer.toString().split(",");
            for (int i = 0; i < split.length; i++) {
                PdfPCell cell = PdfUtils.createCenterPdfPCell(split[i], rowSpan, rowSpan, font);
                table.addCell(cell);
                if(i!=0&&(i+1)%length==0)
                    document.add(table);
            }

            }
        }


