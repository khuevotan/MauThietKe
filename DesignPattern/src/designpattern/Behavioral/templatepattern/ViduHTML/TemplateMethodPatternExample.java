package designpattern.Behavioral.templatepattern.ViduHTML;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author THIS PC
 */
public class TemplateMethodPatternExample {
      public static void main(String[] args) {
         
        PageTemplate homePage = new HomePage();
        homePage.showPage();
         
        System.out.println();
        PageTemplate detailPage = new DetailPage();
        detailPage.showPage();
 
        System.out.println();
        PageTemplate contactPage = new ContactPage();
        contactPage.showPage();
    }
}
