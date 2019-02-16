package file_upload;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.Files;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.PartialResponseWriter;
import javax.servlet.http.Part;
@ManagedBean
@ViewScoped
public class Fileupload implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Part uploadedFile;
	private String folder = "G://cours//PI//Jakarta//ide output files//uploaded files";

	public Part getUploadedFile() {
		return uploadedFile;
	}

	public void setUploadedFile(Part uploadedFile) {
		this.uploadedFile = uploadedFile;
	}

	
	public void saveFile(){
		
		try (InputStream input = uploadedFile.getInputStream()) 
		{
			String fileName = uploadedFile.getSubmittedFileName().substring(42);
	        Files.copy(input, new File(folder, fileName).toPath());
	    }
	    catch (IOException e) 
		{
	        e.printStackTrace();
	    }
	}
	
}
