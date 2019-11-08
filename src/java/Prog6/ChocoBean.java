/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prog6;

import java.io.Serializable;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author c3
 */
public class ChocoBean extends SimpleTagSupport implements Serializable {

    private String texture;
    
    public ChocoBean(){}

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            
            
            if("Chewy".equals(texture)){
                out.println("FiveStar, BarOne");
            }
            else if("Crunchy".equals(texture)){
                out.println("Munch, KitKat");
            }
            else{
                out.println("Choose Correct Texture");
            }

            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }

            
        } catch (java.io.IOException ex) {
            throw new JspException("Error in ChocoBean tag", ex);
        }
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }
    
    public String getTexture(){
        return this.texture;
    }
    
}
