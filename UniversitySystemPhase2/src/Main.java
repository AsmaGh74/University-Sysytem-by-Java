import javax.swing.*;

public class Main {
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
        Main.setLookAndFeel();
        UniversitySystem universitySystem = new UniversitySystem("Amirkabir");
    }
}
