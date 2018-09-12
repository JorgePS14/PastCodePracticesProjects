package avltrees.rdc5;

import avltrees.rdc5.ui.UI;

public class AVLTreesRdC5 {
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new UI().setVisible(true);
        });
    }

    /*
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Scanner read = new Scanner(System.in);
        
        AVLTree avl = new AVLTree();
        
        avl.loadFile();
        
        for(int i = 0; i!=2;) {
            
            System.out.println("1 Introducir. 2 Salir. 3 buscar clave de materia");
            i = read.nextInt();
            
            String id, name, description, branch, professor;
            int open;
            
            if(i == 1) {
                System.out.println("Enter subject ID");
                id = read.nextLine();
                id = read.nextLine();
                System.out.println("Enter subject name");
                name = read.nextLine();
                System.out.println("Enter subject description");
                description = read.nextLine();
                System.out.println("Enter subject branch");
                branch = read.nextLine();
                System.out.println("Enter professor for this subject");
                professor = read.nextLine();
                System.out.println("Enter subject availability");
                open = read.nextInt();
                Subject sub = new Subject(id, name, description, branch, professor, open);
                avl.insert(sub);
            }
            
            if(i == 3) {
                System.out.println("Enter subject ID to search");
                id = read.nextLine();
                id = read.nextLine();
                
                Subject found = avl.find(id);
                if(found!=null) {
                System.out.println(found.getId());
                System.out.println(found.getName());
                System.out.println(found.getDescription());
                System.out.println(found.getBranch());
                System.out.println(found.getProfessor());
                System.out.println(found.getAvailability());
                } else
                    System.out.println("Not found");
            }
            
            avl.saveFile();
        }
        
        
    }
    */

    
}
