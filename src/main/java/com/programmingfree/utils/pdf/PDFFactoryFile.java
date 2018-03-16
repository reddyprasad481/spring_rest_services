package com.programmingfree.utils.pdf;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.programmingfree.springservice.bom.cmm.Customer;

public class PDFFactoryFile {

	 public static final String DEST = "tables/simple_table.pdf";
	 
	    public static void main(String[] args) throws IOException,
	            DocumentException {
	        File file = new File("C:\\Users\\Reddy Prasad\\Downloads\\pdfTest.pdf");
	        //file.getParentFile().mkdirs();
	        createPdf(file);
	    }
	    public static void createPdf(File file) throws IOException, DocumentException {
	        Document document = new Document();
	        PdfWriter.getInstance(document, new FileOutputStream(file));
	        document.open();
	        PdfPTable table = new PdfPTable(8);
	        for(int aw = 0; aw < 16; aw++){
	            table.addCell("hi");
	        }
	        document.add(table);
	        document.close();
	    }
	    
	    public static ByteArrayOutputStream createPdfFile(List<Customer> customers, String period, String fromDate, String toDate) throws IOException, DocumentException {
	    	ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	        Document document= new Document();
			try {
				PdfWriter.getInstance(document, byteArrayOutputStream);
				document.open();
				PdfPTable table1 = new PdfPTable(3);
				PdfPCell periodCell = new PdfPCell();
				periodCell.setBorder(Rectangle.NO_BORDER);
				periodCell.addElement(new Chunk("Period :"+period));
				table1.addCell(periodCell );
				
				PdfPCell fromDateCell = new PdfPCell();
				fromDateCell.setBorder(Rectangle.NO_BORDER);
				fromDateCell.addElement(new Chunk("From Date :"+fromDate));
				table1.addCell(fromDateCell );
				
				PdfPCell toDateCell = new PdfPCell();
				toDateCell.setBorder(Rectangle.NO_BORDER);
				toDateCell.addElement(new Chunk("To Date :"+toDate));
				table1.addCell(toDateCell );
				
				table1.setSpacingAfter(30f);
				document.add(table1);
				
				PdfPTable table = new PdfPTable(5);
				/*for(int aw = 0; aw < 16; aw++){
				    table.addCell("hi");
				}*/
				for (Customer customer : customers) {
					
					 table.addCell(customer.getId()+"");
					 table.addCell(customer.getFirstName());
					 table.addCell(customer.getLastName());
					 table.addCell(customer.getAddress());
					 table.addCell(customer.getCity());
				}
				document.add(table);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				
				document.close();
			}
			return byteArrayOutputStream;
			
	    }
}
