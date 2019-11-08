/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog9;

import java.util.Calendar;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author c3
 */
public class Datetag extends SimpleTagSupport {

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
          
            out.println("Date and Time : " + Calendar.getInstance().getTime());
                

            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }

           
        } catch (java.io.IOException ex) {
            throw new JspException("Error in Datetag tag", ex);
        }
    }
    
}
