import javax.swing.*;

public class Main {
    // create a university
    public static University amirkabir = new University("Amirkabir University");

    public static void setLookAndFeel(){
        // set look and feel to "Nimbus"
        try {
            for (UIManager.LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())){
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (Exception ex){
            try {
                System.err.println(ex);
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }
            catch (Exception exception){
                System.err.println(exception);
            }
        }
    }
    public static void main(String[] args){
//        // create a university
//        University amirkabir = new University("Amirkabir University");
//        // create an admin so the admin can do rest of the duties through GUI
//        Admin mainAdmin = new Admin("Main Admin", "12345678");
//        // add the created admin to university's users list
//        amirkabir.getUsers().add(mainAdmin);


        // GUI part
        Main.setLookAndFeel();
        UniversitySystem universitySystem = new UniversitySystem("Amirkabir");
    }
}
