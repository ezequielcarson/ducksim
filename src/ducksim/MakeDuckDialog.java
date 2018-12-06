package ducksim;

import com.sun.org.apache.xml.internal.security.utils.JDKXPathAPI;

import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MakeDuckDialog extends JDialog {

    // Fields
    
    // Duck panel
    private final JPanel duckPanel = new JPanel();
    private final JLabel duckLabel = new JLabel("Duck");
    private final String[] duckStrings = {"Mallard", "Redhead", "Rubber", "Decoy", "Goose"};
    private final JComboBox duckOptions = new JComboBox(duckStrings);

    //Bling panel
    private final JPanel blingPanel = new JPanel();
    private final JLabel crossCountLabel = new JLabel("0",JLabel.RIGHT);
    private final JLabel starCountLabel = new JLabel("0",JLabel.RIGHT);
    private final JLabel moonCountLabel = new JLabel("0",JLabel.RIGHT);
    private final JButton incCrossButton = new JButton("+");
    private final JButton decCrossButton = new JButton("-");
    private final JButton incStarButton = new JButton("+");
    private final JButton decStarButton = new JButton("-");
    private final JButton incMoonButton = new JButton("+");
    private final JButton decMoonButton = new JButton("-");


    // Button panel
    private final JPanel buttonPanel = new JPanel();
    private final JButton cancelButton = new JButton("Cancel");
    private final JButton okayButton = new JButton("Okay");




    // Stored Data
    private String duckType = "Mallard";
    private int crossCount = 0;
    private int starCount = 0;
    private int moonCount = 0;

    // Constructor
    public MakeDuckDialog(DuckSimModel model, DuckSimView view) {

        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        // add duck panel
        duckPanel.add(duckLabel);
        duckOptions.addActionListener(e -> {
            JComboBox cb = (JComboBox) e.getSource();
            duckType = (String) cb.getSelectedItem();
        });
        duckPanel.add(duckOptions);
        this.add(duckPanel);


        // add bling panel
        blingPanel.setLayout(new GridLayout(3,4,1,1));
        blingPanel.add(new JLabel(" Cross", JLabel.LEFT));
        blingPanel.add(crossCountLabel);
        blingPanel.add(incCrossButton);
        blingPanel.add(decCrossButton);
        blingPanel.add(new JLabel(" Star",  JLabel.LEFT));
        blingPanel.add(starCountLabel);
        blingPanel.add(incStarButton);
        blingPanel.add(decStarButton);
        blingPanel.add(new JLabel(" Moon",  JLabel.LEFT));
        blingPanel.add(moonCountLabel);
        blingPanel.add(incMoonButton);
        blingPanel.add(decMoonButton);
        this.add(blingPanel);


        incCrossButton.addActionListener( e -> {
           if (crossCount + starCount + moonCount  < 3) {
               crossCount++;
               crossCountLabel.setText(String.valueOf(crossCount));
               repaint();
           }
        });


        decCrossButton.addActionListener( e -> {
            if (crossCount > 0) {
                crossCount--;
                crossCountLabel.setText(String.valueOf(crossCount));
                repaint();
            }
        });

        incStarButton.addActionListener( e -> {
            if (crossCount + starCount + moonCount < 3) {
                starCount++;
                starCountLabel.setText(String.valueOf(starCount));
                repaint();
            }
        });


        decStarButton.addActionListener( e -> {
            if (starCount > 0) {
                starCount--;
                starCountLabel.setText(String.valueOf(starCount));
                repaint();
            }
        });


        incMoonButton.addActionListener( e -> {
            if (crossCount + starCount + moonCount < 3) {
                moonCount++;
                moonCountLabel.setText(String.valueOf(moonCount));
                repaint();
            }
        });


        decMoonButton.addActionListener( e -> {
            if (moonCount > 0) {
                moonCount--;
                moonCountLabel.setText(String.valueOf(moonCount));
                repaint();
            }
        });



        // add button panel
        cancelButton.addActionListener(e -> {
            this.dispose();
        });
        buttonPanel.add(cancelButton);
        okayButton.addActionListener(e -> {
            // makeDuckDialog

            Duck duck = DuckFactory.getInstance().createDuck(duckType, starCount,moonCount,crossCount);

            if (duck != null) {
                model.addNewDuck(duck);
            }
            view.repaint();
            this.dispose();
        });


        buttonPanel.add(okayButton);

        this.add(buttonPanel);

    }

    // Public Methods
    public String getDuckType() {
        return duckType;
    }
}
