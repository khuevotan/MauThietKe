/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Structural.compositeopattern.BaiHTML;

/**
 *
 * @author THIS PC
 */
public class TestCompositePattern {
    public static void main(String[] args) {
         HtmlTag parentTag = new HtmlParentElement("<html>");  
        parentTag.setStartTag("<html>");  
        parentTag.setEndTag("</html>");  

        HtmlTag p1 = new HtmlParentElement("<body>");  
        p1.setStartTag("<body>");  
        p1.setEndTag("</body>");  

        parentTag.addChildTag(p1);  

        HtmlTag child1 = new HtmlElement("<p>");  
        child1.setStartTag("<p>");  
        child1.setEndTag("</p>");  
        child1.setTagBody("Testing html tag library");  
        p1.addChildTag(child1);  

        child1 = new HtmlElement("<p>");  
        child1.setStartTag("<p>");  
        child1.setEndTag("</p>");  
        child1.setTagBody("Paragraph 2");  
        p1.addChildTag(child1);  

        parentTag.generateHtml();  
    }
}
