package SistemManajemenSekolah;
import tampilan.DataSiswa;
import tampilan.DataGuru;
import koneksi.Koneksi;
import java.sql.Connection;

/**
 *
 * @author Rizqi Maulana Mahfudz
 */
public class SistemManajemenSekolah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koneksi k = new Koneksi();
        Connection conn = k.connect();
        
        if (conn != null) {
            /* Set the Nimbus look and feel */
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(DataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            
            /* Create and display the Pelanggan form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new DataSiswa().setVisible(true);
                    new DataGuru().setVisible(true);
                }
            });
        } else {
            System.out.println("Aplikasi tidak dapat dijalankan karena koneksi database gagal");
        }
    }    
}
