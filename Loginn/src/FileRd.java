
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRd {
	static TextField txtUser = new TextField();
	static TextField txtPass= new TextField(); 
	static File file;
	public FileRd() {
        String AdminFile = "admin.txt";
		setLayout(new BorderLayout());
        String username = txtUser.getText();
        String password = txtPass.getText();
		Button valider = new Button("Submit");
		add.(txtUser); add.(txtPass);
    
		setVisible(true);
        try {

    		file = new File("Admin.txt");
            try {
    			if(file.createNewFile()){
    			    System.out.println("file.txt File Created in Project root directory");    
    			}else System.out.println("File Admin.txt already exists in the project root directory");
    		} catch (IOException e1) {
    			e1.printStackTrace();
    		}
            FileReader fr = new FileReader(AdminFile);
            BufferedReader br = new BufferedReader(fr);
            String line, user, pass;
            boolean isLoginSuccess = false;
            while ((line = br.readLine()) != null) {
                user = line.split(" ")[1].toLowerCase();
                pass = line.split(" ")[2].toLowerCase();
                if (user.equals(username) && pass.equals(password)) {
                    isLoginSuccess = true;
                    System.out.println("Login Successfuly");
                    break;
                } 
            }
            if (!isLoginSuccess) {
                System.out.println("error");
                }
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
    public static void main(String args[]) {

    }
}