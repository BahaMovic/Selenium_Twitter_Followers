/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.api;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author BahaMoviX
 */
public class AddUsers extends javax.swing.JFrame {

    /**
     * Creates new form DeleteUsers
     */
    private String Email;
    private String Password;
    private int numOfFollowers;
    private String[] multEmail;
    private String[] multPassword;
    public AddUsers() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        
    }

   
    public void setData(String Email , String password ,String Url ,int numOfFollowers)
    {
        this.Email = Email;
        this.Password = password;
        this.Url = Url;
        this.numOfFollowers = numOfFollowers;
        jTextPane1.setText(this.Email);
        this.addUsers();
        
    }
    
       public void setData(String[] Email , String[] password ,String Url ,int numOfFollowers)
    {
        this.multEmail = Email;
        this.multPassword = password;
        this.Url = Url;
        this.numOfFollowers = numOfFollowers;
        jTextPane1.setText(this.Email);
        this.addMultiUsers();
        
    }
    
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jProgressBar1.setAutoscrolls(true);
        jProgressBar1.setOpaque(true);
        jProgressBar1.setStringPainted(true);

        jButton1.setText("الغاء");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
           this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUsers().setVisible(true);
            }
        });
    }
   public String mass = "";
   public WebDriver open ;
   public int sum ;
   public WebElement mainClass;
   public int index;
   public int sizeOfUsers;
   
   
   public int indexOfEmail = 0;
   
   
    private void addUsers()
    {
        

        
       
     new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
           ChromeOptions options = new ChromeOptions();
           options.addArguments("--headless");
        open = new ChromeDriver(options);

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
        open.get("https://mobile.twitter.com/login");
        
        
        open.findElement(By.name("session[username_or_email]")).sendKeys(Email);
        open.findElement(By.name("session[password]")).sendKeys(Password);
        open.findElement(By.name("session[password]")).submit();
        open.get(Url);
        System.out.println("0 exception Error");
        mainClass = open.findElement(By.className("GridTimeline-items"));
        String sizeof = "";
        System.out.println("First exception Error");
        try
        {
             sizeof = open.findElement(By.xpath("//*[@id=\"page-container\"]/div[1]/div/div[2]/div/div/div[2]/div/div/ul/li[3]/a/span[3]")).getText();
        }
        catch(Exception wr)
        {
            sizeof = open.findElement(By.xpath("//*[@id=\"page-container\"]/div[1]/div/div[2]/div/div/div[2]/div/div/ul/li[2]/a/span[3]")).getText();

        }
        System.out.println("The Size of users is "+sizeof);
        if(sizeof.charAt(sizeof.length()-1) == 'K')
        {
          sizeOfUsers = 1000;
        }
        else
        {
            try{
                sizeOfUsers = Integer.parseInt(sizeof);
            }catch(Exception ex)
            {
                sizeOfUsers = 1000;
            }

        }
        System.out.println("Second exception Error");
        System.out.println(sizeOfUsers);
        int mainDiv = 1;
        int subDiv = 1;
        int counter = 0;
        for (int i = 1 ; i < sizeOfUsers ; i++)
        {
            
             System.out.println("Div = "+mainDiv+"  Element = "+subDiv + " i = "+i);
            if(i%6 == 0)
            {
                mainDiv += 1;
                subDiv = 0;
            }
            subDiv += 1;
            //JavascriptExecutor js = (JavascriptExecutor)open;
            //js.executeScript("scrollBy(0,120)");
            
            try{
                
    
                WebElement subClass = mainClass.findElement(By.xpath("//*[@id=\"page-container\"]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div["+mainDiv+"]/div["+subDiv+"]"));
                ((JavascriptExecutor) open).executeScript("arguments[0].scrollIntoView(true);", subClass);
                 delay(200);
                System.out.println(subClass.findElement(By.className("fullname ")).getText());
                if(isProbablyArabic(subClass.findElement(By.className("fullname ")).getText()) || isProbablyArabic(subClass.findElement(By.className("ProfileCard-bio")).getText()))
                {
                   
                    System.out.println("/////// AR "+subClass.findElement(By.className("fullname ")).getText());
                    subClass.findElement(By.xpath("//*[@id=\"stream-item-user-"+subClass.findElement(By.className("js-stream-item")).getAttribute("data-item-id")+"\"]/div/div/div[1]/div/div/div/span[2]/button[1]")).click();
                    mass += subClass.findElement(By.className("fullname ")).getText()+" Has been Added\n";
                    jTextPane1.setText(mass);
                    jProgressBar1.setValue(i);
                    counter++;
                    delay(100);
                }
            }
            catch(Exception ex)
            {
                
                delay(200);delay(200);
            }
            
            if(counter >= numOfFollowers)
            {
                break;
            }
            
           
        }
       
         
                return null;
            }
        }.execute();
       
    }
    
       private void addMultiUsers()
    {
        

        
     
     new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
      for( indexOfEmail = 0 ; indexOfEmail < multEmail.length ; indexOfEmail++)
     {
           ChromeOptions options = new ChromeOptions();
           options.addArguments("--headless");
        open = new ChromeDriver(options);

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
        open.get("https://mobile.twitter.com/login");
        
        
        open.findElement(By.name("session[username_or_email]")).sendKeys(multEmail[indexOfEmail]);
        open.findElement(By.name("session[password]")).sendKeys(multPassword[indexOfEmail]);
        open.findElement(By.name("session[password]")).submit();
        open.get(Url);
        delay(2000);
       
        System.out.println("0 exception Error");
        mainClass = open.findElement(By.className("GridTimeline-items"));
        String sizeof = "";
        System.out.println("First exception Error");
        try
        {
             sizeof = open.findElement(By.xpath("//*[@id=\"page-container\"]/div[1]/div/div[2]/div/div/div[2]/div/div/ul/li[3]/a/span[3]")).getText();
        }
        catch(Exception wr)
        {
            sizeof = open.findElement(By.xpath("//*[@id=\"page-container\"]/div[1]/div/div[2]/div/div/div[2]/div/div/ul/li[2]/a/span[3]")).getText();

        }
        System.out.println("The Size of users is "+sizeof);
        if(sizeof.charAt(sizeof.length()-1) == 'K')
        {
          sizeOfUsers = 1000;
        }
        else
        {
            try{
                sizeOfUsers = Integer.parseInt(sizeof);
            }catch(Exception ex)
            {
                sizeOfUsers = 1000;
            }

        }
        System.out.println("Second exception Error");
        System.out.println(sizeOfUsers);
        int mainDiv = 1;
        int subDiv = 1;
        int counter = 0;
        for (int i = 1 ; i < 1000 ; i++)
        {
            
             System.out.println("Div = "+mainDiv+"  Element = "+subDiv + " i = "+i);
            if(i%6 == 0)
            {
                mainDiv += 1;
                subDiv = 0;
            }
            subDiv += 1;
            //JavascriptExecutor js = (JavascriptExecutor)open;
            //js.executeScript("scrollBy(0,120)");
            
            try{
                
    
                WebElement subClass = mainClass.findElement(By.xpath("//*[@id=\"page-container\"]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div["+mainDiv+"]/div["+subDiv+"]"));
                ((JavascriptExecutor) open).executeScript("arguments[0].scrollIntoView(true);", subClass);
                 delay(200);
                System.out.println(subClass.findElement(By.className("fullname ")).getText());
                if(isProbablyArabic(subClass.findElement(By.className("fullname ")).getText()) || isProbablyArabic(subClass.findElement(By.className("ProfileCard-bio")).getText()))
                {
                   
                    System.out.println("/////// AR "+subClass.findElement(By.className("fullname ")).getText());
                    subClass.findElement(By.xpath("//*[@id=\"stream-item-user-"+subClass.findElement(By.className("js-stream-item")).getAttribute("data-item-id")+"\"]/div/div/div[1]/div/div/div/span[2]/button[1]")).click();
                    mass += subClass.findElement(By.className("fullname ")).getText()+" Has been Added\n";
                    jTextPane1.setText(mass);
                    jProgressBar1.setValue(i);
                    counter++;
                    delay(100);
                    if(counter >= numOfFollowers)
                    {
                        break;
                    }
                }
            }
            catch(Exception ex)
            {
                
                delay(200);delay(200);
            }
            
            
            
           
        }
        open.close();
         
            }
            return null;
            }
            
        }.execute();
     
     
    }
    
    public static boolean isProbablyArabic(String s) {
    for (int i = 0; i < s.length();) {
        int c = s.codePointAt(i);
        if (c >= 0x0600 && c <= 0x06E0)
            return true;
        i += Character.charCount(c);            
    }
    return false;
  }
    
    
    
    
      public void delay(int n)
    {
        try {
            TimeUnit.MILLISECONDS.sleep(n);
        } catch (InterruptedException ex) {
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
    private String Url;
   
}
