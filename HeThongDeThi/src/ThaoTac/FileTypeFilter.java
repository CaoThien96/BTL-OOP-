/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThaoTac;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author CaoThienHUST
 */
public class FileTypeFilter extends FileFilter{
    private String extention;
    private String description;

    public FileTypeFilter(String extention, String description) {
        this.extention = extention;
        this.description = description;
    }

    public FileTypeFilter() {
    }
    
    @Override
    public boolean accept(File f) {
        if(f.isDirectory()){
            return true;
        }else
            return f.getName().endsWith(extention);
    }

    @Override
    public String getDescription() {
        return description+"  (*%s)"+extention;
    }
    
}
