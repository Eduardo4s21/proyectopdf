/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

/**
 *
 * @author eg993
 */
public class pdf {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa;


import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.text.StyleConstants.FontConstants;

/**
 *
 * @author hugo4295
 */
public class Eduardo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        PdfWriter pdfwriter = null;
        // TODO code application logic here
        String nombrearch = "mipdf.pdf";
        File file = new File(nombrearch);
        pdfwriter = new PdfWriter(file);
        String cadena = "este es otro parrafo el cual contendra mas informacion de lo debido ya que estamos probando que se pueda escribir dentro del archivo pdf";
        PdfDocument pdfDocument = new PdfDocument(pdfwriter);
        Document document = new Document(pdfDocument);
        Paragraph paragraph = new Paragraph("Sera mi primer linea de mi pdf la cual puede contener texto");
        document.add(paragraph);
        paragraph = new Paragraph(cadena);
        document.add(paragraph);
        PdfFont font = PdfFontFactory.createFont();
        cadena = "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno est??ndar de las industrias desde el a??o 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido us?? una galer??a de textos y los mezcl?? de tal manera que logr?? hacer un libro de textos especimen. No s??lo sobrevivi?? 500 a??os, sino que tambien ingres?? como texto de relleno en documentos electr??nicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creaci??n de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y m??s recientemente con software de autoedici??n, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.";
        paragraph = new Paragraph(cadena);
        paragraph.setFont(font);
        DeviceRgb myColor = new DeviceRgb(255, 100, 20);
        paragraph.setFontColor(myColor);
        document.add(paragraph);
        pdfDocument.close();
        pdfwriter.close(); 
        
    }
    
}

}
