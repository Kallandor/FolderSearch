/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foldersearch;

import java.io.File;

/**
 *
 * @author dlwilson
 */
public class FolderProcessor
{
    private String path;

    public FolderProcessor(String p)
    {
         path = p;
    }
    
    
    public void doProcess()
    {
                
        File file = new File(path);
        File[] files = file.listFiles();
        
        for(File currentFile : files)
        {
            if (currentFile.isDirectory())
            {
                doDirectory(currentFile);
            }
        }

    }
    
    private void doDirectory(File f)
    {
        System.out.println("Directory Found :" + f.getAbsolutePath());
        File[] files = f.listFiles();
        
        for(File currentFile : files)
        {
            if (currentFile.isDirectory())
            {
                doDirectory(currentFile);
            }
        }
    }
    
}
