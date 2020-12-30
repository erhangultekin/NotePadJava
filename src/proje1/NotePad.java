package proje1;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.AttributedString;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;
import javax.swing.text.JTextComponent;
import javax.swing.undo.UndoManager;

public class NotePad extends javax.swing.JFrame {

    public NotePad() {
        UndoManager undo = new UndoManager();
        initComponents();
        textArea.getDocument().addUndoableEditListener(
                new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                undo.addEdit(e.getEdit());
            }
        });
        UndoMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (undo.canUndo()) {
                    undo.undo();
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        FindButton = new javax.swing.JButton();
        FindArea = new javax.swing.JTextField();
        ReplaceArea = new javax.swing.JTextField();
        ReplaceButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Open = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        Close = new javax.swing.JMenuItem();
        Control = new javax.swing.JMenu();
        Check = new javax.swing.JMenuItem();
        Undo = new javax.swing.JMenu();
        UndoMenu = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        FindButton.setText("Find");
        FindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindButtonActionPerformed(evt);
            }
        });

        ReplaceButton.setText("Replace");
        ReplaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReplaceButtonActionPerformed(evt);
            }
        });

        File.setText("File");

        Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        File.add(Open);

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        File.add(Save);

        Close.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        File.add(Close);

        jMenuBar1.add(File);

        Control.setText("Control");
        Control.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ControlActionPerformed(evt);
            }
        });

        Check.setText("Check");
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });
        Control.add(Check);

        jMenuBar1.add(Control);

        Undo.setText("Undo");

        UndoMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        UndoMenu.setText("Undo");
        UndoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoMenuActionPerformed(evt);
            }
        });
        Undo.add(UndoMenu);

        jMenuBar1.add(Undo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FindArea, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FindButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReplaceButton, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReplaceArea, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FindArea, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ReplaceArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FindButton))
                    .addComponent(ReplaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        String filename = "";
        FileDialog fileD = new FileDialog(this, "Save File", FileDialog.SAVE);
        fileD.setVisible(true);
        if (fileD.getFile() != null) {
            filename = fileD.getDirectory() + fileD.getFile();
        }

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(textArea.getText());
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(NotePad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        String filename = "";
        FileDialog fileD = new FileDialog(this, "Open File", FileDialog.LOAD);
        fileD.setVisible(true);
        if (fileD.getFile() != null) {
            filename = fileD.getDirectory() + fileD.getFile();
        }

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)))) {
            String icerik = "";

            while (scanner.hasNextLine()) {

                icerik += scanner.nextLine() + "\n";

            }
            textArea.setText(icerik);
            scanner.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NotePad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_OpenActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CloseActionPerformed

    private void ControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ControlActionPerformed

    }//GEN-LAST:event_ControlActionPerformed

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        ArrayList<Kelime> kelimeKontrol = new ArrayList<Kelime>();
        ArrayList<Kelime> scannerKontrol = new ArrayList<Kelime>();
        try { //KONTROL LİSTESİ
            FileReader fr = new FileReader("words.txt");
            BufferedReader br = new BufferedReader(fr);
            Scanner scanner = new Scanner(br);
            while (scanner.hasNextLine()) {
                String satir = scanner.nextLine();
                kelimeKontrol.add(new Kelime(satir));
            }
            br.close();

        } catch (Exception FileNotFoundException) {
            System.err.println("DOSYA BULUNAMADI.");
        }

        String yazi = textArea.getText(); //replace yapılacak olan text

        String[] geciciListe = yazi.split(",|\\.|;| |\n");
        for (String s : geciciListe) {
            scannerKontrol.add(new Kelime(s));
        }
        for (Kelime kelime1 : scannerKontrol) {
            for (Kelime kelime2 : kelimeKontrol) {
                if (!kelime1.equals(kelime2)) {
                    if (kelime1.getUzunluk() == kelime2.getUzunluk()) {
                        if (kelime1.getCharArrayList().equals(kelime2.getCharArrayList())) {
                            int s = kelime1.singleTransposition(kelime2);
                            if (s == 1) {
                                
                                break;
                            }
                        }
                    }
                } else {
                    break;
                }
            }
        }
        String yazi1=textArea.getText();
        int count=0;
        for(Kelime s:scannerKontrol){
            yazi1=yazi1.replace(geciciListe[count],s.getKelime());
            count++;
            
        }
        textArea.setText(yazi1);
        
        
        /*String yeniYazi = "";
        for (Kelime s1 : scannerKontrol) {
            yeniYazi += s1.getKelime() + " ";
            textArea.setText(yeniYazi);
        }*/

    }//GEN-LAST:event_CheckActionPerformed

    private void UndoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoMenuActionPerformed
        UndoManager undo = new UndoManager();
        textArea.getDocument().addUndoableEditListener(
                new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                undo.addEdit(e.getEdit());
            }
        });
        UndoMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (undo.canUndo()) {
                    undo.undo();
                }
            }
        });
    }//GEN-LAST:event_UndoMenuActionPerformed


    private void FindButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindButtonActionPerformed
          FindWord(textArea,FindArea.getText());
        
    }//GEN-LAST:event_FindButtonActionPerformed
    
    
    
    
    class myHighlighter extends DefaultHighlighter.DefaultHighlightPainter {

        public myHighlighter(Color c) {
            super(c);
        }

    }
    DefaultHighlighter.HighlightPainter hl = new myHighlighter(Color.pink);

    public void removeHighLight(JTextComponent textComp) {
        Highlighter removeHighlighter = textComp.getHighlighter();
        Highlighter.Highlight[] remove = removeHighlighter.getHighlights();
        for (int i = 0; i < remove.length; i++) {
            if (remove[i].getPainter() instanceof myHighlighter) {
                removeHighlighter.removeHighlight(remove[i]);
            }
        }
    }

    public void FindWord(JTextComponent textComp, String textString) {
        removeHighLight(textComp);
        try {
            Highlighter highlighter = (Highlighter) textComp.getHighlighter();
            Document doc = textComp.getDocument();
            String text = doc.getText(0, doc.getLength());

            int pos = 0;
            while ((pos = text.toUpperCase().indexOf(textString.toUpperCase(), pos)) >= 0) {
                highlighter.addHighlight(pos, pos + textString.length(), hl);
                pos += textString.length();
            }
        } catch (Exception e) {

        }
    }
    private void ReplaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReplaceButtonActionPerformed
        String a = FindArea.getText();
        String b = ReplaceArea.getText();
        String c = textArea.getText();

        String d = c.replaceAll(a, b);

        textArea.setText(d);
    }//GEN-LAST:event_ReplaceButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotePad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Check;
    private javax.swing.JMenuItem Close;
    private javax.swing.JMenu Control;
    private javax.swing.JMenu File;
    private javax.swing.JTextField FindArea;
    private javax.swing.JButton FindButton;
    private javax.swing.JMenuItem Open;
    private javax.swing.JTextField ReplaceArea;
    private javax.swing.JButton ReplaceButton;
    private javax.swing.JMenuItem Save;
    private javax.swing.JMenu Undo;
    private javax.swing.JMenuItem UndoMenu;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
